package org.scalajs.jquery

import scala.scalajs.js

@js.native
trait JQueryPromiseCallback[T] extends js.Object {
  def apply(value: T, args: js.Any*): Unit = js.native
}