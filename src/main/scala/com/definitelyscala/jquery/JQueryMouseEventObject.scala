package com.definitelyscala.jquery

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait JQueryMouseEventObject extends JQueryInputEventObject {
  var button: Double = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var screenX: Double = js.native
  var screenY: Double = js.native
}