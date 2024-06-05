addSbtPlugin("ch.epfl.scala"                   % "sbt-scalafix"              % "0.11.0")
addSbtPlugin("org.scalameta"                   % "sbt-scalafmt"              % "2.5.0")
addSbtPlugin("pl.project13.scala"              % "sbt-jmh"                   % "0.4.6")
addSbtPlugin("com.timushev.sbt"                % "sbt-updates"               % "0.6.3")
addSbtPlugin("io.spray"                        % "sbt-revolver"              % "0.10.0")
addSbtPlugin("com.github.sbt"                  % "sbt-github-actions"        % "0.22.0")
addSbtPlugin("com.github.sbt"                  % "sbt-ci-release"            % "1.5.12")
addSbtPlugin("dev.zio"                         % "zio-sbt-website"           % "0.4.0-alpha.26")
addSbtPlugin("de.heikoseeberger"               % "sbt-header"                % "5.10.0")
addSbtPlugin("org.scoverage"                   % "sbt-scoverage"             % "2.0.9")
addSbtPlugin("io.get-coursier"                 % "sbt-shading"               % "2.1.4")
addSbtPlugin("com.github.cb372"                % "sbt-explicit-dependencies" % "0.3.1")
addSbtPlugin("org.scala-js"                    % "sbt-scalajs"               % "1.16.0")
addSbtPlugin("org.portable-scala"              % "sbt-scalajs-crossproject"  % "1.3.2")
addSbtPlugin("com.thesamet"                    % "sbt-protoc"                % "1.0.7")
addSbtPlugin("com.thesamet"                    % "sbt-protoc-gen-project"    % "0.1.8")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin"            % "0.11.17"
