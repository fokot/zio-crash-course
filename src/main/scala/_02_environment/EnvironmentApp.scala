package _02_environment

import zio.{ExitCode, Has, IO, Task, UIO, URIO, ZIO}

object EnvironmentApp extends zio.App {

  trait A {
    def a: String
  }

  trait B {
    def b: String
  }

  trait C {
    def writeEffect(s: String): UIO[Unit] = UIO(println(s))
    def readEffect: UIO[String] = UIO(scala.Console.in.readLine())
  }





  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] =


//  trait SecretStore {
//    trait Service
//    def secret: String
//  }
//
//  case class SecretStoreImpl(secret: String) extends SecretStore
//
//  def writeSecret(): UIO[SecretStore with Console] =
//    ZIO.accessM[SecretStore with Console](r => r.get[Console].putStrLn(r.get[SecretStore].secret))


}
