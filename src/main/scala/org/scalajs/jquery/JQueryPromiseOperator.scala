package org.scalajs.jquery

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait JQueryPromiseOperator[T, U] extends js.Object {
  def apply(callback1: JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]], callbacksN: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]]*): JQueryPromise[U] = js.native
}