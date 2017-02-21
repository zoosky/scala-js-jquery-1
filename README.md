scala-js-jquery
===============

[![Build Status](https://travis-ci.org/scala-js/scala-js-jquery.svg?branch=master)](https://travis-ci.org/scala-js/scala-js-jquery)
[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-0.6.13.svg)](https://www.scala-js.org/)

Scala.js facades for [jQuery 1.10.x / 2.0.x](http://jquery.com/).

Generated from [TypeScript definitions](https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/jquery) based on jQuery 1.10.x / 2.0.x.

Usage
-----

I'm working to get this hosted somewhere. Once I do, you'll be able to do this:

```
libraryDependencies += "DefinitelyScala" %%% "scala-js-jquery" % "1.0" // <-- DOESN'T WORK YET```
```

Until it's hosted, you'll have to clone the git repo, then add the following to your SBT build definition:

```
  // Reference library as RootProject
  val jquery = RootProject(file("{path to project}"))
  // Reference the project
  (myProject).dependsOn(jquery)
```
    
If you see an error regarding a missing dependency, you're not using Coursier. 
If you don't want to switch (though you should), you may remove the plugin from `plugins.sbt`. 

Classes and traits are available in the package `org.scalajs.jquery`.
