import com.typesafe.sbt.SbtScalariform.{ ScalariformKeys, scalariformSettings }
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._


object Projects {
  val projectId = "scala-js-jquery"
  val projectName = "scala-js-jquery"

  object Versions {
    val app = "1.0.0"
    val scala = "2.11.8"
  }

  lazy val commonSettings = Seq(
    version := Versions.app,
    scalaVersion := Versions.scala,

    scalacOptions ++= Seq(
      "-encoding", "UTF-8", "-feature", "-deprecation", "-unchecked", "–Xcheck-null", "-Xfatal-warnings", "-Xlint",
      "-Ywarn-adapted-args", /* "-Ywarn-dead-code", */ "-Ywarn-inaccessible", "-Ywarn-nullary-override", "-Ywarn-numeric-widen"
    ),
    scalacOptions in Test ++= Seq("-Yrangepos"),

    publishMavenStyle := false,

    shellPrompt := { state => s"[${Project.extract(state).currentProject.id}] $$ " },

    // Prevent Scaladoc
    publishArtifact in (Compile, packageDoc) := false,
    publishArtifact in packageDoc := false,
    sources in (Compile,doc) := Seq.empty,

    // Code Quality
    ScalariformKeys.preferences := ScalariformKeys.preferences.value
  ) ++ scalariformSettings

  private[this] val scalaJsSettings = Seq(
    name := projectName,
    libraryDependencies ++= Seq("org.scala-js" %%% "scalajs-dom" % "0.8.1"),
    persistLauncher := false,
    scalaJSStage in Global := FastOptStage
  )

  lazy val jquery = Project(id = projectId, base = file(".")).settings(commonSettings ++ scalaJsSettings).enablePlugins(ScalaJSPlugin)
}
