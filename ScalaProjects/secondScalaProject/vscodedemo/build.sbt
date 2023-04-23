val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "vscodedemo",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

  //https://youtu.be/HQmnndjA6PI
  //used chatgpt to find specifics for vscode instead of intellij
artifactName :={ //renames jar files to specified name in quotes
  (sv: ScalaVersion, 
  module: ModuleID, 
  artifact: Artifact) => "demo-lambda" + artifact.extension 
}