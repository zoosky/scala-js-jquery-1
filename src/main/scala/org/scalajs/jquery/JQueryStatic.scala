package org.scalajs.jquery

import scala.scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.|

@js.native
trait JQueryStatic extends js.Object {
  /**
   * Perform an asynchronous HTTP (Ajax) request.
   *
   * @param settings A set of key/value pairs that configure the Ajax request. All settings are optional. A default can be set for any option with $.ajaxSetup().
   * @see { https://api.jquery.com/jQuery.ajax/#jQuery-ajax-settings}
   */
  def ajax(settings: JQueryAjaxSettings): JQueryXHR = js.native
  /**
   * Perform an asynchronous HTTP (Ajax) request.
   *
   * @param url A string containing the URL to which the request is sent.
   * @param settings A set of key/value pairs that configure the Ajax request. All settings are optional. A default can be set for any option with $.ajaxSetup().
   * @see { https://api.jquery.com/jQuery.ajax/#jQuery-ajax-url-settings}
   */
  def ajax(url: String, settings: JQueryAjaxSettings): JQueryXHR = js.native
  /**
   * Handle custom Ajax options or modify existing options before each request is sent and before they are processed by $.ajax().
   *
   * @param dataTypes An optional string containing one or more space-separated dataTypes
   * @param handler A handler to set default values for future Ajax requests.
   * @see { https://api.jquery.com/jQuery.ajaxPrefilter/}
   */
  def ajaxPrefilter(dataTypes: String, handler: js.Function3[js.Any, JQueryAjaxSettings, JQueryXHR, Any]): Unit = js.native
  /**
   * Handle custom Ajax options or modify existing options before each request is sent and before they are processed by $.ajax().
   *
   * @param handler A handler to set default values for future Ajax requests.
   * @see { https://api.jquery.com/jQuery.ajaxPrefilter/}
   */
  def ajaxPrefilter(handler: js.Function3[js.Any, JQueryAjaxSettings, JQueryXHR, Any]): Unit = js.native
  /**
   * Creates an object that handles the actual transmission of Ajax data.
   *
   * @param dataType A string identifying the data type to use.
   * @param handler A handler to return the new transport object to use with the data type provided in the first argument.
   * @see { https://api.jquery.com/jQuery.ajaxTransport/}
   */
  def ajaxTransport(dataType: String, handler: js.Function3[js.Any, JQueryAjaxSettings, JQueryXHR, Any]): Unit = js.native
  var ajaxSettings: JQueryAjaxSettings = js.native
  /**
   * Set default values for future Ajax requests. Its use is not recommended.
   *
   * @param options A set of key/value pairs that configure the default Ajax request. All options are optional.
   * @see { https://api.jquery.com/jQuery.ajaxSetup/}
   */
  def ajaxSetup(options: JQueryAjaxSettings): Unit = js.native
  /**
   * Load data from the server using a HTTP GET request.
   *
   * @param url A string containing the URL to which the request is sent.
   * @param success A callback function that is executed if the request succeeds.
   * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, or html).
   * @see { https://api.jquery.com/jQuery.get/#jQuery-get-url-data-success-dataType}
   */
  def get(url: String, success: js.Function3[js.Any, String, JQueryXHR, Any], dataType: String): JQueryXHR = js.native
  /**
   * Load data from the server using a HTTP GET request.
   *
   * @param url A string containing the URL to which the request is sent.
   * @param data A plain object or string that is sent to the server with the request.
   * @param success A callback function that is executed if the request succeeds.
   * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, or html).
   * @see { https://api.jquery.com/jQuery.get/#jQuery-get-url-data-success-dataType}
   */
  def get(url: String, data: Object | String, success: js.Function3[js.Any, String, JQueryXHR, Any], dataType: String): JQueryXHR = js.native
  /**
   * Load data from the server using a HTTP GET request.
   *
   * @param settings The JQueryAjaxSettings to be used for the request
   * @see { https://api.jquery.com/jQuery.get/#jQuery-get-settings}
   */
  def get(settings: JQueryAjaxSettings): JQueryXHR = js.native
  /**
   * Load JSON-encoded data from the server using a GET HTTP request.
   *
   * @param url A string containing the URL to which the request is sent.
   * @param success A callback function that is executed if the request succeeds.
   * @see { https://api.jquery.com/jQuery.getJSON/}
   */
  def getJSON(url: String, success: js.Function3[js.Any, String, JQueryXHR, Any]): JQueryXHR = js.native
  /**
   * Load JSON-encoded data from the server using a GET HTTP request.
   *
   * @param url A string containing the URL to which the request is sent.
   * @param data A plain object or string that is sent to the server with the request.
   * @param success A callback function that is executed if the request succeeds.
   * @see { https://api.jquery.com/jQuery.getJSON/}
   */
  def getJSON(url: String, data: Object | String, success: js.Function3[js.Any, String, JQueryXHR, Any]): JQueryXHR = js.native
  /**
   * Load a JavaScript file from the server using a GET HTTP request, then execute it.
   *
   * @param url A string containing the URL to which the request is sent.
   * @param success A callback function that is executed if the request succeeds.
   * @see { https://api.jquery.com/jQuery.getScript/}
   */
  def getScript(url: String, success: js.Function3[String, String, JQueryXHR, Any] = js.native): JQueryXHR = js.native
  /**
   * Create a serialized representation of an array or object, suitable for use in a URL query string or Ajax request.
   *
   * @see { https://api.jquery.com/jQuery.param/}
   */
  var param: JQueryParam = js.native
  /**
   * Load data from the server using a HTTP POST request.
   *
   * @param url A string containing the URL to which the request is sent.
   * @param success A callback function that is executed if the request succeeds. Required if dataType is provided, but can be null in that case.
   * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, text, html).
   * @see { https://api.jquery.com/jQuery.post/#jQuery-post-url-data-success-dataType}
   */
  def post(url: String, success: js.Function3[js.Any, String, JQueryXHR, Any], dataType: String): JQueryXHR = js.native
  /**
   * Load data from the server using a HTTP POST request.
   *
   * @param url A string containing the URL to which the request is sent.
   * @param data A plain object or string that is sent to the server with the request.
   * @param success A callback function that is executed if the request succeeds. Required if dataType is provided, but can be null in that case.
   * @param dataType The type of data expected from the server. Default: Intelligent Guess (xml, json, script, text, html).
   * @see { https://api.jquery.com/jQuery.post/#jQuery-post-url-data-success-dataType}
   */
  def post(url: String, data: Object | String, success: js.Function3[js.Any, String, JQueryXHR, Any], dataType: String): JQueryXHR = js.native
  /**
   * Load data from the server using a HTTP POST request.
   *
   * @param settings The JQueryAjaxSettings to be used for the request
   * @see { https://api.jquery.com/jQuery.post/#jQuery-post-settings}
   */
  def post(settings: JQueryAjaxSettings): JQueryXHR = js.native
  /**
   * A multi-purpose callbacks list object that provides a powerful way to manage callback lists.
   *
   * @param flags An optional list of space-separated flags that change how the callback list behaves.
   * @see { https://api.jquery.com/jQuery.Callbacks/}
   */
  def Callbacks(flags: String = js.native): JQueryCallback = js.native
  /**
   * Holds or releases the execution of jQuery's ready event.
   *
   * @param hold Indicates whether the ready hold is being requested or released
   * @see { https://api.jquery.com/jQuery.holdReady/}
   */
  def holdReady(hold: Boolean): Unit = js.native
  /**
   * Accepts a string containing a CSS selector which is then used to match a set of elements.
   *
   * @param selector A string containing a selector expression
   * @param context A DOM Element, Document, or jQuery to use as context
   * @see { https://api.jquery.com/jQuery/#jQuery-selector-context}
   */
  def apply(selector: String, context: Element | JQuery): JQuery = js.native
  /**
   * Accepts a string containing a CSS selector which is then used to match a set of elements.
   *
   * @param element A DOM element to wrap in a jQuery object.
   * @see { https://api.jquery.com/jQuery/#jQuery-element}
   */
  def apply(element: Element): JQuery = js.native
  /**
   * Accepts a string containing a CSS selector which is then used to match a set of elements.
   *
   * @param elementArray An array containing a set of DOM elements to wrap in a jQuery object.
   * @see { https://api.jquery.com/jQuery/#jQuery-elementArray}
   */
  def apply(elementArray: js.Array[Element]): JQuery = js.native
  /**
   * Binds a function to be executed when the DOM has finished loading.
   *
   * @param callback A function to execute after the DOM is ready.
   * @see { https://api.jquery.com/jQuery/#jQuery-callback}
   */
  def apply(callback: js.Function1[JQueryStatic, Any]): JQuery = js.native
  /**
   * Accepts a string containing a CSS selector which is then used to match a set of elements.
   *
   * @param object A plain object to wrap in a jQuery object.
   * @see { https://api.jquery.com/jQuery/#jQuery-object}
   */
  def apply(`object`: js.Any): JQuery = js.native
  /**
   * Accepts a string containing a CSS selector which is then used to match a set of elements.
   *
   * @param object An existing jQuery object to clone.
   * @see { https://api.jquery.com/jQuery/#jQuery-object}
   */
  def apply(`object`: JQuery): JQuery = js.native
  /**
   * Specify a function to execute when the DOM is fully loaded.
   * @see { https://api.jquery.com/jQuery/#jQuery}
   */
  def apply(): JQuery = js.native
  /**
   * Creates DOM elements on the fly from the provided string of raw HTML.
   *
   * @param html A string of HTML to create on the fly. Note that this parses HTML, not XML.
   * @param ownerDocument A document in which the new elements will be created.
   * @see { https://api.jquery.com/jQuery/#jQuery-html-ownerDocument}
   */
  def apply(html: String, ownerDocument: Document): JQuery = js.native
  /**
   * Creates DOM elements on the fly from the provided string of raw HTML.
   *
   * @param html A string defining a single, standalone, HTML element (e.g. <div/> or <div></div>).
   * @param attributes An object of attributes, events, and methods to call on the newly-created element.
   * @see { https://api.jquery.com/jQuery/#jQuery-html-attributes}
   */
  def apply(html: String, attributes: Object): JQuery = js.native
  /**
   * Relinquish jQuery's control of the $ variable.
   *
   * @param removeAll A Boolean indicating whether to remove all jQuery variables from the global scope (including jQuery itself).
   * @see { https://api.jquery.com/jQuery.noConflict/}
   */
  def noConflict(removeAll: Boolean = js.native): JQueryStatic = js.native
  /**
   * Provides a way to execute callback functions based on one or more objects, usually Deferred objects that represent asynchronous events.
   *
   * @param deferreds One or more Deferred objects, or plain JavaScript objects.
   * @see { https://api.jquery.com/jQuery.when/}
   */
  def when[T](deferreds: T | JQueryPromise[T]*): JQueryPromise[T] = js.native
  /**
   * Hook directly into jQuery to override how particular CSS properties are retrieved or set, normalize CSS property naming, or create custom properties.
   * @see { https://api.jquery.com/jQuery.cssHooks/}
   */
  var cssHooks: js.Dictionary[js.Any] = js.native
  /**
   * An object containing all CSS properties that may be used without a unit. The .css() method uses this object to see if it may append px to unitless values.
   * @see { https://api.jquery.com/jQuery.cssNumber/}
   */
  var cssNumber: js.Any = js.native
  /**
   * Store arbitrary data associated with the specified element. Returns the value that was set.
   *
   * @param element The DOM element to associate with the data.
   * @param key A string naming the piece of data to set.
   * @param value The new data value.
   * @see { https://api.jquery.com/jQuery.data/#jQuery-data-element-key-value}
   */
  def data[T](element: Element, key: String, value: T): T = js.native
  /**
   * Returns value at named data store for the element, as set by jQuery.data(element, name, value), or the full data store for the element.
   *
   * @param element The DOM element to associate with the data.
   * @param key A string naming the piece of data to set.
   * @see { https://api.jquery.com/jQuery.data/#jQuery-data-element-key}
   */
  def data(element: Element, key: String): js.Dynamic = js.native
  /**
   * Returns value at named data store for the element, as set by jQuery.data(element, name, value), or the full data store for the element.
   *
   * @param element The DOM element to associate with the data.
   * @see { https://api.jquery.com/jQuery.data/#jQuery-data-element}
   */
  def data(element: Element): js.Dynamic = js.native
  /**
   * Execute the next function on the queue for the matched element.
   *
   * @param element A DOM element from which to remove and execute a queued function.
   * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
   * @see { https://api.jquery.com/jQuery.dequeue/}
   */
  def dequeue(element: Element, queueName: String = js.native): Unit = js.native
  /**
   * Determine whether an element has any jQuery data associated with it.
   *
   * @param element A DOM element to be checked for data.
   * @see { https://api.jquery.com/jQuery.hasData/}
   */
  def hasData(element: Element): Boolean = js.native
  /**
   * Show the queue of functions to be executed on the matched element.
   *
   * @param element A DOM element to inspect for an attached queue.
   * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
   * @see { https://api.jquery.com/jQuery.queue/#jQuery-queue-element-queueName}
   */
  def queue(element: Element, queueName: String): js.Array[js.Any] = js.native
  /**
   * Manipulate the queue of functions to be executed on the matched element.
   *
   * @param element A DOM element where the array of queued functions is attached.
   * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
   * @param newQueue An array of functions to replace the current queue contents.
   * @see { https://api.jquery.com/jQuery.queue/#jQuery-queue-element-queueName-newQueue}
   */
  def queue(element: Element, queueName: String, newQueue: js.Array[js.Function]): JQuery = js.native
  /**
   * Manipulate the queue of functions to be executed on the matched element.
   *
   * @param element A DOM element on which to add a queued function.
   * @param queueName A string containing the name of the queue. Defaults to fx, the standard effects queue.
   * @param callback The new function to add to the queue.
   * @see { https://api.jquery.com/jQuery.queue/#jQuery-queue-element-queueName-callback}
   */
  def queue(element: Element, queueName: String, callback: js.Function): JQuery = js.native
  /**
   * Remove a previously-stored piece of data.
   *
   * @param element A DOM element from which to remove data.
   * @param name A string naming the piece of data to remove.
   * @see { https://api.jquery.com/jQuery.removeData/}
   */
  def removeData(element: Element, name: String = js.native): JQuery = js.native
  /**
   * A constructor function that returns a chainable utility object with methods to register multiple callbacks into callback queues, invoke callback queues, and relay the success or failure state of any synchronous or asynchronous function.
   *
   * @param beforeStart A function that is called just before the constructor returns.
   * @see { https://api.jquery.com/jQuery.Deferred/}
   */
  def Deferred[T](beforeStart: js.Function1[JQueryDeferred[T], Any] = js.native): JQueryDeferred[T] = js.native
  /**
   * Effects
   */
  var easing: JQueryEasingFunctions = js.native
  var fx: js.Any = js.native
  /**
   * Takes a function and returns a new one that will always have a particular context.
   *
   * @param func The function whose context will be changed.
   * @param context The object to which the context (this) of the function should be set.
   * @param additionalArguments Any number of arguments to be passed to the function referenced in the function argument.
   * @see { https://api.jquery.com/jQuery.proxy/#jQuery-proxy-function-context-additionalArguments}
   */
  def proxy(func: js.Function, context: Object, additionalArguments: js.Any*): js.Dynamic = js.native
  /**
   * Takes a function and returns a new one that will always have a particular context.
   *
   * @param context The object to which the context (this) of the function should be set.
   * @param name The name of the function whose context will be changed (should be a property of the context object).
   * @param additionalArguments Any number of arguments to be passed to the function named in the name argument.
   * @see { https://api.jquery.com/jQuery.proxy/#jQuery-proxy-context-name-additionalArguments}
   */
  def proxy(context: Object, name: String, additionalArguments: js.Any*): js.Dynamic = js.native
  var Event: JQueryEventConstructor = js.native
  /**
   * Takes a string and throws an exception containing it.
   *
   * @param message The message to send out.
   * @see { https://api.jquery.com/jQuery.error/}
   */
  def error(message: js.Any): JQuery = js.native
  var expr: js.Any = js.native
  var fn: js.Any = js.native
  //TODO: Decide how we want to type this
  var isReady: Boolean = js.native
  // Properties
  var support: JQuerySupport = js.native
  /**
   * Check to see if a DOM element is a descendant of another DOM element.
   *
   * @param container The DOM element that may contain the other element.
   * @param contained The DOM element that may be contained by (a descendant of) the other element.
   * @see { https://api.jquery.com/jQuery.contains/}
   */
  def contains(container: Element, contained: Element): Boolean = js.native
  /**
   * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and array-like objects with a length property (such as a function's arguments object) are iterated by numeric index, from 0 to length-1. Other objects are iterated via their named properties.
   *
   * @param collection The object or array to iterate over.
   * @param callback The function that will be executed on every object.
   * @see { https://api.jquery.com/jQuery.each/#jQuery-each-array-callback}
   */
  def each[T](collection: js.Array[T], callback: js.Function2[Double, T, Any]): js.Dynamic = js.native
  /**
   * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays. Arrays and array-like objects with a length property (such as a function's arguments object) are iterated by numeric index, from 0 to length-1. Other objects are iterated via their named properties.
   *
   * @param collection The object or array to iterate over.
   * @param callback The function that will be executed on every object.
   * @see { https://api.jquery.com/jQuery.each/#jQuery-each-object-callback}
   */
  def each(collection: js.Any, callback: js.Function2[js.Any, js.Any, Any]): js.Dynamic = js.native
  /**
   * Merge the contents of two or more objects together into the first object.
   *
   * @param target An object that will receive the new properties if additional objects are passed in or that will extend the jQuery namespace if it is the sole argument.
   * @param object1 An object containing additional properties to merge in.
   * @param objectN Additional objects containing properties to merge in.
   * @see { https://api.jquery.com/jQuery.extend/#jQuery-extend-target-object1-objectN}
   */
  def extend(target: js.Any, object1: js.Any, objectN: js.Any*): js.Dynamic = js.native
  /**
   * Merge the contents of two or more objects together into the first object.
   *
   * @param deep If true, the merge becomes recursive (aka. deep copy).
   * @param target The object to extend. It will receive the new properties.
   * @param object1 An object containing additional properties to merge in.
   * @param objectN Additional objects containing properties to merge in.
   * @see { https://api.jquery.com/jQuery.extend/#jQuery-extend-deep-target-object1-objectN}
   */
  def extend(deep: Boolean, target: js.Any, object1: js.Any, objectN: js.Any*): js.Dynamic = js.native
  /**
   * Execute some JavaScript code globally.
   *
   * @param code The JavaScript code to execute.
   * @see { https://api.jquery.com/jQuery.globalEval/}
   */
  def globalEval(code: String): js.Dynamic = js.native
  /**
   * Finds the elements of an array which satisfy a filter function. The original array is not affected.
   *
   * @param array The array to search through.
   * @param func The function to process each item against. The first argument to the function is the item, and the second argument is the index. The function should return a Boolean value.  this will be the global window object.
   * @param invert If "invert" is false, or not provided, then the function returns an array consisting of all elements for which "callback" returns true. If "invert" is true, then the function returns an array consisting of all elements for which "callback" returns false.
   * @see { https://api.jquery.com/jQuery.grep/}
   */
  def grep[T](array: js.Array[T], func: js.Function2[T, Double, Boolean], invert: Boolean = js.native): js.Array[T] = js.native
  /**
   * Search for a specified value within an array and return its index (or -1 if not found).
   *
   * @param value The value to search for.
   * @param array An array through which to search.
   * @param fromIndex The index of the array at which to begin the search. The default is 0, which will search the whole array.
   * @see { https://api.jquery.com/jQuery.inArray/}
   */
  def inArray[T](value: T, array: js.Array[T], fromIndex: Double = js.native): Double = js.native
  /**
   * Determine whether the argument is an array.
   *
   * @param obj Object to test whether or not it is an array.
   * @see { https://api.jquery.com/jQuery.isArray/}
   */
  def isArray(obj: js.Any): Boolean = js.native
  /**
   * Check to see if an object is empty (contains no enumerable properties).
   *
   * @param obj The object that will be checked to see if it's empty.
   * @see { https://api.jquery.com/jQuery.isEmptyObject/}
   */
  def isEmptyObject(obj: js.Any): Boolean = js.native
  /**
   * Determine if the argument passed is a JavaScript function object.
   *
   * @param obj Object to test whether or not it is a function.
   * @see { https://api.jquery.com/jQuery.isFunction/}
   */
  def isFunction(obj: js.Any): Boolean = js.native
  /**
   * Determines whether its argument is a number.
   *
   * @param value The value to be tested.
   * @see { https://api.jquery.com/jQuery.isNumeric/}
   */
  def isNumeric(value: js.Any): Boolean = js.native
  /**
   * Check to see if an object is a plain object (created using "{}" or "new Object").
   *
   * @param obj The object that will be checked to see if it's a plain object.
   * @see { https://api.jquery.com/jQuery.isPlainObject/}
   */
  def isPlainObject(obj: js.Any): Boolean = js.native
  /**
   * Determine whether the argument is a window.
   *
   * @param obj Object to test whether or not it is a window.
   * @see { https://api.jquery.com/jQuery.isWindow/}
   */
  def isWindow(obj: js.Any): Boolean = js.native
  /**
   * Check to see if a DOM node is within an XML document (or is an XML document).
   *
   * @param node The DOM node that will be checked to see if it's in an XML document.
   * @see { https://api.jquery.com/jQuery.isXMLDoc/}
   */
  def isXMLDoc(node: Node): Boolean = js.native
  /**
   * Convert an array-like object into a true JavaScript array.
   *
   * @param obj Any object to turn into a native Array.
   * @see { https://api.jquery.com/jQuery.makeArray/}
   */
  def makeArray(obj: js.Any): js.Array[js.Any] = js.native
  /**
   * Translate all items in an array or object to new array of items.
   *
   * @param array The Array to translate.
   * @param callback The function to process each item against. The first argument to the function is the array item, the second argument is the index in array The function can return any value. Within the function, this refers to the global (window) object.
   * @see { https://api.jquery.com/jQuery.map/#jQuery-map-array-callback}
   */
  def map[T, U](array: js.Array[T], callback: js.Function2[T, Double, U]): js.Array[U] = js.native
  /**
   * Translate all items in an array or object to new array of items.
   *
   * @param arrayOrObject The Array or Object to translate.
   * @param callback The function to process each item against. The first argument to the function is the value; the second argument is the index or key of the array or object property. The function can return any value to add to the array. A returned array will be flattened into the resulting array. Within the function, this refers to the global (window) object.
   * @see { https://api.jquery.com/jQuery.map/#jQuery-map-object-callback}
   */
  def map(arrayOrObject: js.Any, callback: js.Function2[js.Any, js.Any, Any]): js.Dynamic = js.native
  /**
   * Merge the contents of two arrays together into the first array.
   *
   * @param first The first array to merge, the elements of second added.
   * @param second The second array to merge into the first, unaltered.
   * @see { https://api.jquery.com/jQuery.merge/}
   */
  def merge[T](first: js.Array[T], second: js.Array[T]): js.Array[T] = js.native
  /**
   * An empty function.
   * @see { https://api.jquery.com/jQuery.noop/}
   */
  def noop(): js.Dynamic = js.native
  /**
   * Return a number representing the current time.
   * @see { https://api.jquery.com/jQuery.now/}
   */
  def now(): Double = js.native
  /**
   * Takes a well-formed JSON string and returns the resulting JavaScript object.
   *
   * @param json The JSON string to parse.
   * @see { https://api.jquery.com/jQuery.parseJSON/}
   */
  def parseJSON(json: String): js.Dynamic = js.native
  /**
   * Parses a string into an XML document.
   *
   * @param data a well-formed XML string to be parsed
   * @see { https://api.jquery.com/jQuery.parseXML/}
   */
  def parseXML(data: String): Document = js.native
  /**
   * Remove the whitespace from the beginning and end of a string.
   *
   * @param str Remove the whitespace from the beginning and end of a string.
   * @see { https://api.jquery.com/jQuery.trim/}
   */
  def trim(str: String): String = js.native
  /**
   * Determine the internal JavaScript [[Class]] of an object.
   *
   * @param obj Object to get the internal JavaScript [[Class]] of.
   * @see { https://api.jquery.com/jQuery.type/}
   */
  def `type`(obj: js.Any): String = js.native
  /**
   * Sorts an array of DOM elements, in place, with the duplicates removed. Note that this only works on arrays of DOM elements, not strings or numbers.
   *
   * @param array The Array of DOM elements.
   * @see { https://api.jquery.com/jQuery.unique/}
   */
  def unique(array: js.Array[Element]): js.Array[Element] = js.native
  /**
   * Parses a string into an array of DOM nodes.
   *
   * @param data HTML string to be parsed
   * @param context DOM element to serve as the context in which the HTML fragment will be created
   * @param keepScripts A Boolean indicating whether to include scripts passed in the HTML string
   * @see { https://api.jquery.com/jQuery.parseHTML/}
   */
  def parseHTML(data: String, context: HTMLElement, keepScripts: Boolean): js.Array[js.Any] = js.native
  /**
   * Parses a string into an array of DOM nodes.
   *
   * @param data HTML string to be parsed
   * @param context DOM element to serve as the context in which the HTML fragment will be created
   * @param keepScripts A Boolean indicating whether to include scripts passed in the HTML string
   * @see { https://api.jquery.com/jQuery.parseHTML/}
   */
  def parseHTML(data: String, context: Document, keepScripts: Boolean): js.Array[js.Any] = js.native
}