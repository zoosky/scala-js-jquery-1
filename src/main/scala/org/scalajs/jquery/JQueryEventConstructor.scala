package org.scalajs.jquery

import scala.scalajs.js

@js.native
trait JQueryEventConstructor extends js.Object {
  def apply(name: String, eventProperties: js.Any): JQueryEventObject = js.native
}