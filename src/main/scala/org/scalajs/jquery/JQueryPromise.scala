package org.scalajs.jquery

import scala.scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.|

@js.native
trait JQueryPromise[T] extends JQueryGenericPromise[T] {
  /**
   * Determine the current state of a Deferred object.
   * @see { https://api.jquery.com/deferred.state/}
   */
  def state(): String = js.native
  /**
   * Add handlers to be called when the Deferred object is either resolved or rejected.
   *
   * @param alwaysCallback1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
   * @param alwaysCallbackN Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
   * @see { https://api.jquery.com/deferred.always/}
   */
  def always(alwaysCallback1: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]], alwaysCallbackN: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]]*): JQueryPromise[T] = js.native
  /**
   * Add handlers to be called when the Deferred object is resolved.
   *
   * @param doneCallback1 A function, or array of functions, that are called when the Deferred is resolved.
   * @param doneCallbackN Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
   * @see { https://api.jquery.com/deferred.done/}
   */
  def done(doneCallback1: JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]], doneCallbackN: JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]]*): JQueryPromise[T] = js.native
  /**
   * Add handlers to be called when the Deferred object is rejected.
   *
   * @param failCallback1 A function, or array of functions, that are called when the Deferred is rejected.
   * @param failCallbackN Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
   * @see { https://api.jquery.com/deferred.fail/}
   */
  def fail(failCallback1: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]], failCallbackN: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]]*): JQueryPromise[T] = js.native
  /**
   * Add handlers to be called when the Deferred object generates progress notifications.
   *
   * @param progressCallback1 A function, or array of functions, to be called when the Deferred generates progress notifications.
   * @param progressCallbackN Optional additional functions, or arrays of functions, to be called when the Deferred generates progress notifications.
   * @see { https://api.jquery.com/deferred.progress/}
   */
  def progress(progressCallback1: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]], progressCallbackN: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]]*): JQueryPromise[T] = js.native
  // Deprecated - given no typings
  def pipe(doneFilter: js.Function1[js.Any, Any] = js.native, failFilter: js.Function1[js.Any, Any] = js.native, progressFilter: js.Function1[js.Any, Any] = js.native): JQueryPromise[js.Any] = js.native
  /**
   * Return a Deferred's Promise object.
   *
   * @param target Object onto which the promise methods have to be attached
   * @see { https://api.jquery.com/deferred.promise/}
   */
  def promise(target: js.Any = js.native): JQueryPromise[T] = js.native
}