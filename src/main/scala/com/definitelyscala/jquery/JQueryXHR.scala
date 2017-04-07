package com.definitelyscala.jquery

import scala.scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.|

@js.native
trait JQueryXHR extends XMLHttpRequest with JQueryPromise[js.Any] {
  /**
     * The .overrideMimeType() method may be used in the beforeSend() callback function, for example, to modify the response content-type header. As of jQuery 1.5.1, the jqXHR object also contains the overrideMimeType() method (it was available in jQuery 1.4.x, as well, but was temporarily removed in jQuery 1.5).
     */
  def overrideMimeType(mimeType: String): js.Dynamic = js.native
  /**
     * Cancel the request.
     *
     * @param statusText A string passed as the textStatus parameter for the done callback. Default value: "canceled"
     */
  def abort(statusText: String = js.native): Unit = js.native
  /**
     * Incorporates the functionality of the .done() and .fail() methods, allowing (as of jQuery 1.8) the underlying Promise to be manipulated. Refer to deferred.then() for implementation details.
     */
  def `then`[R](doneCallback: js.Function3[js.Any, String, JQueryXHR, R | JQueryPromise[R]], failCallback: js.Function3[JQueryXHR, String, js.Any, Unit] = js.native): JQueryPromise[R] = js.native
  /**
     * Property containing the parsed response if the response content type is json
     */
  var responseJSON: js.Any = js.native
  /**
     * A function to be called if the request fails.
     */
  def error(xhr: JQueryXHR, textStatus: String, errorThrown: String): Unit = js.native
}