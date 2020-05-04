lazy val commonSettings = Seq(
  organization := "com.lebenitza",
  name := "sbt-native-packager-1335",
  version:= "1.0.0",
  scalaVersion := "2.12.10",
 
  mainClass in(Compile, run) := Option("com.lebenitza.service.Boot"),
)

val dockerSettings = Seq(
  defaultLinuxInstallLocation in Docker := "/opt/microservice",
  dockerRepository in Docker := Some("lebenitza/test"),

  dockerBaseImage := "openjdk:8",
  dockerExposedPorts in Docker := Seq(8080),

  daemonUser in Docker := "root",
  daemonUserUid in Docker := None,
  version in Docker := version.value,
  
  // Workaround to: https://github.com/sbt/sbt-native-packager/issues/1335
  // dockerEntrypoint := Seq("/opt/microservice/bin/boot")
)

lazy val `sbt-native-packager-1335` = (project in file("."))
  .settings(
    commonSettings ++ dockerSettings,
  ).enablePlugins(AshScriptPlugin)