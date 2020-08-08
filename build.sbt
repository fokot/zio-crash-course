ThisBuild / scalaVersion     := "2.13.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.fokot"
ThisBuild / organizationName := "fokot"

val zioVersion = "1.0.0-RC21-2"
val zio = "dev.zio" %% "zio" % zioVersion
val zioTest = "dev.zio" %% "zio-test" % zioVersion
val zioTestSbt = "dev.zio" %% "zio-test-sbt" % zioVersion
val zioCats = "dev.zio" %% "zio-interop-cats" % "2.1.4.0-RC17"

lazy val root = (project in file("."))
  .settings(
    name := "zio-crash-course",
    libraryDependencies ++= Seq(
      zio,
      zioTest,
      zioTestSbt,
      zioCats
    )
  )