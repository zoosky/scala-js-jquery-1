package org.scalajs.jquery

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait JQueryEventObject extends BaseJQueryEventObject with JQueryInputEventObject with JQueryMouseEventObject with JQueryKeyEventObject {
}