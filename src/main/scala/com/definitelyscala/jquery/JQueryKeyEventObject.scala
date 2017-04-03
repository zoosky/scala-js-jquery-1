package com.definitelyscala.jquery

import scala.scalajs.js

@js.native
trait JQueryKeyEventObject extends JQueryInputEventObject {
  var char: js.Any = js.native
  var charCode: Double = js.native
  var key: js.Any = js.native
  var keyCode: Double = js.native
}