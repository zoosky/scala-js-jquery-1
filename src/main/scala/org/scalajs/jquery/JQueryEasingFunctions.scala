package org.scalajs.jquery

import scala.scalajs.js

@js.native
trait JQueryEasingFunctions extends js.Object {
  @js.annotation.JSBracketAccess
  def apply(name: String): JQueryEasingFunction = js.native
  @js.annotation.JSBracketAccess
  def update(name: String, v: JQueryEasingFunction): Unit = js.native
  var linear: JQueryEasingFunction = js.native
  var swing: JQueryEasingFunction = js.native
}