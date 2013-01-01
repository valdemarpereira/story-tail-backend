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
      scalaVersion := "2.9.2",
	resolvers ++= Seq(
        "akka Releases" at "http://repo.akka.io/releases/",
        "spray repo" at "http://repo.spray.io",
        "repo.novus rels" at "http://repo.novus.com/releases/",
        "Scala tools" at "https://oss.sonatype.org/content/groups/scala-tools/"
       ),
      libraryDependencies  ++= Seq(
        "com.typesafe.akka" % "akka-actor" % "2.0.4",
        "io.spray" % "spray-can" % "1.0-M7",
        "io.spray" % "spray-routing" % "1.0-M7",
        "io.spray" % "spray-http" % "1.0-M7",
        "org.mongodb" %% "casbah" % "2.3.0",
        "com.novus" %% "salat-core" % "1.9.1"
      ),
        scalacOptions += "-Ydependent-method-types"

      // add other settings here
    )
  )
}
