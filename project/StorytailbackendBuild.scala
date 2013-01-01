import sbt._
import sbt.Keys._

object StorytailbackendBuild extends Build {

  lazy val storytailbackend = Project(
    id = "story-tail-backend",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "story-tail-backend",
      organization := "com.valdemar",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2"
      // add other settings here
    )
  )
}
