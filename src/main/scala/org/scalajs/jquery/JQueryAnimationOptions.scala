package org.scalajs.jquery

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait JQueryAnimationOptions extends js.Object {
  /**
     * A string or number determining how long the animation will run.
     */
  var duration: js.Any = js.native
  /**
     * A string indicating which easing function to use for the transition.
     */
  var easing: String = js.native
  /**
     * A function to call once the animation is complete.
     */
  var complete: js.Function = js.native
  /**
     * A function to be called for each animated property of each animated element. This function provides an opportunity to modify the Tween object to change the value of the property before it is set.
     */
  var step: js.Function2[Double, js.Any, Any] = js.native
  /**
     * A function to be called after each step of the animation, only once per animated element regardless of the number of animated properties. (version added: 1.8)
     */
  var progress: js.Function3[JQueryPromise[js.Any], Double, Double, Any] = js.native
  /**
     * A function to call when the animation begins. (version added: 1.8)
     */
  var start: js.Function1[JQueryPromise[js.Any], Any] = js.native
  /**
     * A function to be called when the animation completes (its Promise object is resolved). (version added: 1.8)
     */
  var done: js.Function2[JQueryPromise[js.Any], Boolean, Any] = js.native
  /**
     * A function to be called when the animation fails to complete (its Promise object is rejected). (version added: 1.8)
     */
  var fail: js.Function2[JQueryPromise[js.Any], Boolean, Any] = js.native
  /**
     * A function to be called when the animation completes or stops without completing (its Promise object is either resolved or rejected). (version added: 1.8)
     */
  var always: js.Function2[JQueryPromise[js.Any], Boolean, Any] = js.native
  /**
     * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately. As of jQuery 1.7, the queue option can also accept a string, in which case the animation is added to the queue represented by that string. When a custom queue name is used the animation does not automatically start; you must call .dequeue("queuename") to start it.
     */
  var queue: js.Any = js.native
  /**
     * A map of one or more of the CSS properties defined by the properties argument and their corresponding easing functions. (version added: 1.4)
     */
  var specialEasing: Object = js.native
}