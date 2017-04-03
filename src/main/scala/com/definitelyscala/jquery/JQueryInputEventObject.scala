package com.definitelyscala.jquery

import scala.scalajs.js

@js.native
trait JQueryInputEventObject extends BaseJQueryEventObject {
  var altKey: Boolean = js.native
  var ctrlKey: Boolean = js.native
  var shiftKey: Boolean = js.native
}