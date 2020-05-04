logLevel := Level.Warn

addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.4.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.2")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

addSbtPlugin("net.vonbuchholtz" % "sbt-dependency-check" % "2.0.0")

/*
Native packager
*/
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.0")
