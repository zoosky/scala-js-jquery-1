package com.definitelyscala.jquery

import scala.scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.|

@js.native
trait JQueryDeferred[T] extends JQueryGenericPromise[T] {
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
  def always(alwaysCallback1: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]], alwaysCallbackN: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]]*): JQueryDeferred[T] = js.native
  /**
   * Add handlers to be called when the Deferred object is resolved.
   *
   * @param doneCallback1 A function, or array of functions, that are called when the Deferred is resolved.
   * @param doneCallbackN Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
   * @see { https://api.jquery.com/deferred.done/}
   */
  def done(doneCallback1: JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]], doneCallbackN: JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]]*): JQueryDeferred[T] = js.native
  /**
   * Add handlers to be called when the Deferred object is rejected.
   *
   * @param failCallback1 A function, or array of functions, that are called when the Deferred is rejected.
   * @param failCallbackN Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
   * @see { https://api.jquery.com/deferred.fail/}
   */
  def fail(failCallback1: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]], failCallbackN: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]]*): JQueryDeferred[T] = js.native
  /**
   * Add handlers to be called when the Deferred object generates progress notifications.
   *
   * @param progressCallback1 A function, or array of functions, to be called when the Deferred generates progress notifications.
   * @param progressCallbackN Optional additional functions, or arrays of functions, to be called when the Deferred generates progress notifications.
   * @see { https://api.jquery.com/deferred.progress/}
   */
  def progress(progressCallback1: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]], progressCallbackN: JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]]*): JQueryDeferred[T] = js.native
  /**
   * Call the progressCallbacks on a Deferred object with the given args.
   *
   * @param args Optional arguments that are passed to the progressCallbacks.
   * @see { https://api.jquery.com/deferred.notify/}
   */
  def notify(value: js.Any, args: js.Any*): JQueryDeferred[T] = js.native
  /**
   * Call the progressCallbacks on a Deferred object with the given context and args.
   *
   * @param context Context passed to the progressCallbacks as the this object.
   * @param args Optional arguments that are passed to the progressCallbacks.
   * @see { https://api.jquery.com/deferred.notifyWith/}
   */
  def notifyWith(context: js.Any, args: js.Array[js.Any] = js.native): JQueryDeferred[T] = js.native
  /**
   * Reject a Deferred object and call any failCallbacks with the given args.
   *
   * @param args Optional arguments that are passed to the failCallbacks.
   * @see { https://api.jquery.com/deferred.reject/}
   */
  def reject(value: js.Any, args: js.Any*): JQueryDeferred[T] = js.native
  /**
   * Reject a Deferred object and call any failCallbacks with the given context and args.
   *
   * @param context Context passed to the failCallbacks as the this object.
   * @param args An optional array of arguments that are passed to the failCallbacks.
   * @see { https://api.jquery.com/deferred.rejectWith/}
   */
  def rejectWith(context: js.Any, args: js.Array[js.Any] = js.native): JQueryDeferred[T] = js.native
  /**
   * Resolve a Deferred object and call any doneCallbacks with the given args.
   *
   * @param value First argument passed to doneCallbacks.
   * @param args Optional subsequent arguments that are passed to the doneCallbacks.
   * @see { https://api.jquery.com/deferred.resolve/}
   */
  def resolve(value: T, args: js.Any*): JQueryDeferred[T] = js.native
  /**
   * Resolve a Deferred object and call any doneCallbacks with the given context and args.
   *
   * @param context Context passed to the doneCallbacks as the this object.
   * @param args An optional array of arguments that are passed to the doneCallbacks.
   * @see { https://api.jquery.com/deferred.resolveWith/}
   */
  def resolveWith(context: js.Any, args: js.Array[T] = js.native): JQueryDeferred[T] = js.native
  /**
   * Return a Deferred's Promise object.
   *
   * @param target Object onto which the promise methods have to be attached
   * @see { https://api.jquery.com/deferred.promise/}
   */
  def promise(target: js.Any = js.native): JQueryPromise[T] = js.native
  // Deprecated - given no typings
  def pipe(doneFilter: js.Function1[js.Any, Any] = js.native, failFilter: js.Function1[js.Any, Any] = js.native, progressFilter: js.Function1[js.Any, Any] = js.native): JQueryPromise[js.Any] = js.native
}