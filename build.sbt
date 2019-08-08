name := """medilanda_app"""
organization := "lk.medilandafarms"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"

libraryDependencies += guice

// For database connection
libraryDependencies += javaJdbc


libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.47"

libraryDependencies += "javax.xml.bind" % "jaxb-api" % "2.3.0"

libraryDependencies += "javax.activation" % "activation" % "1.1.1"
libraryDependencies += "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.0"
