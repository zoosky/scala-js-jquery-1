package org.scalajs.jquery

import scala.scalajs.js

@js.native
trait JQueryEventObject extends BaseJQueryEventObject with JQueryInputEventObject with JQueryMouseEventObject with JQueryKeyEventObject {
}