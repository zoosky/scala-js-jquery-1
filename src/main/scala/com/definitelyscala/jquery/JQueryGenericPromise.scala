package com.definitelyscala.jquery

import scala.scalajs.js

@js.native
trait JQueryGenericPromise[T] extends js.Object {
  /**
   * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
   *
   * @see { https://api.jquery.com/deferred.then/#deferred-then-doneFilter-failFilter-progressFilter}
   */
  def `then`[U](doneFilter: js.Function, failFilter: js.Function, progressFilter: js.Function): JQueryPromise[U] = js.native
  /**
   * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
   *
   * @see { https://api.jquery.com/deferred.then/#deferred-then-doneFilter-failFilter-progressFilter}
   */
}