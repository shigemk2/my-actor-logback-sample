name := """my-actor-logback-sample"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "org.slf4j" % "slf4j-api" % "1.7.12",
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.2",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

