package _02_environment

import zio.{Has, RIO, Task, ZIO}

case class Customer(i: Int)

object customerservice {

  type CustomerService = Has[Service]

  trait Service {
    def save(c: Customer): Task[Customer]

    def get(id: Long): Task[Customer]

    def list(): Task[List[Customer]]
  }

  def save(c: Customer): RIO[CustomerService, Customer] =
    ZIO.accessM[CustomerService](_.get.save(c))

  def get(id: Long): RIO[CustomerService, Customer] =
    ZIO.accessM[CustomerService](_.get.get(id))

  def list(): RIO[CustomerService, List[Customer]] =
    ZIO.accessM[CustomerService](_.get.list())

  class CustomerServiceDoobie(tx: Transactor[Task]) extends Service {
    override def save(c: Customer): Task[Customer] = ???.transact(tx)

    override def get(id: Long): Task[Customer] = ???.transact(tx)

    override def list(): Task[List[Customer]] = ???.transact(tx)
  }

}

// We ended up with this solution:
// 1) it has less code (3x less boilerplate)
// 2) we specify that we will work with DB, not exactly what operation are allowed, smtg like zio.Console specifies that it works with Console
// 3) we have accessors out of the box, we do not need to write them
// 4) we never mock db, in test we run db in docker anyway and it is important to test db layer too
// 5) we can reuse ConnectionIO (part of the transactions) easily in different services
object CustomerService {

  type TransactorService = Has[Transactor[Task]]
  type F[A] = RIO[TransactorService, A]

  def save(c: Customer): F[Customer] =
    ZIO.accessM[TransactorService](r => ???.transact(r.get))

  def get(id: Long): F[Customer] =
    ZIO.accessM[TransactorService](r => ???.transact(r.get))

  def list(): F[List[Customer]] =
    ZIO.accessM[TransactorService](r => ???.transact(r.get))

  def findRelatedCustomers(c: Customer): ConnectionIO[List[Customer]] = ???

}
