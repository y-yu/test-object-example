// https://github.com/sbt/sbt/commit/505492ed332bebfc92508c98378ad968b0ac22ee
Compile / scalacOptions -= "-Xsource:3"

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.11.3")

addSbtPlugin("com.github.sbt" % "sbt-release" % "1.4.0")

addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
