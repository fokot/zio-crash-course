# [ZIO](https://zio.dev) crash course


WIP probably never will be done as ZIO will soon have a book

## Content

1. **Introduction**
    * zio.App
2. **Environment and layers**
    
    More on topic:
    * [Adam Fraser - Solving the dependency injection problem with ZIO](https://github.com/adamgfraser/solving-the-dependency-injection-problem-with-zio/blob/master/solving-the-dependency-injection-problem-with-zio.pdf)

3. **Concurrent and parallel programming**
    * fibers (ensuring)
    * scheduling
    * combinators (race, raceAll, zipPar, on, forEachPar etc.)
    
    More on topic:
    * [FIBER SUPERVISION IN ZIO - Wiem Zine El Abidine, Adam Fraser | Scalar 2020](https://www.youtube.com/watch?v=aCYJ3VsJnvM)
    * [Fabio Labella—How do Fibers Work? A Peek Under the Hood](https://www.youtube.com/watch?v=x5_MmZVLiSM)
4. **Integrating with non-FP scala and java code**
    * Futures
    * Callbacks
    * Blocking
5. **Integrating with FP scala code**
    * [Doobie](https://tpolecat.github.io/doobie)
    * [Http4s](https://http4s.org)
6. **Resource management**
    * bracket
    * Managed
7. **Error handling**
8. **Tests**
    * [zio-test](https://zio.dev/docs/howto/howto_test_effects)
9. **STM**
10. **Final project**
    * GraphQL api with [caliban](https://ghostdogpr.github.io/caliban/)
    * [Doobie](https://tpolecat.github.io/doobie) and [Quill](https://github.com/getquill/quill) database access
    * [JWT](https://jwt.io) authentication