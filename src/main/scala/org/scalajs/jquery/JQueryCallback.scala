package org.scalajs.jquery

import scala.scalajs.js

@js.native
trait JQueryCallback extends js.Object {
  /**
     * Add a callback or a collection of callbacks to a callback list.
     *
     * @param callbacks A function, or array of functions, that are to be added to the callback list.
     * @see { https://api.jquery.com/callbacks.add/}
     */
  def add(callbacks: js.Function): JQueryCallback = js.native
  /**
     * Add a callback or a collection of callbacks to a callback list.
     *
     * @param callbacks A function, or array of functions, that are to be added to the callback list.
     * @see { https://api.jquery.com/callbacks.add/}
     */
  def add(callbacks: js.Array[js.Function]): JQueryCallback = js.native
  /**
     * Disable a callback list from doing anything more.
     * @see { https://api.jquery.com/callbacks.disable/}
     */
  def disable(): JQueryCallback = js.native
  /**
     * Determine if the callbacks list has been disabled.
     * @see { https://api.jquery.com/callbacks.disabled/}
     */
  def disabled(): Boolean = js.native
  /**
     * Remove all of the callbacks from a list.
     * @see { https://api.jquery.com/callbacks.empty/}
     */
  def empty(): JQueryCallback = js.native
  /**
     * Call all of the callbacks with the given arguments
     *
     * @param arguments The argument or list of arguments to pass back to the callback list.
     * @see { https://api.jquery.com/callbacks.fire/}
     */
  def fire(arguments: js.Any*): JQueryCallback = js.native
  /**
     * Determine if the callbacks have already been called at least once.
     * @see { https://api.jquery.com/callbacks.fired/}
     */
  def fired(): Boolean = js.native
  /**
     * Call all callbacks in a list with the given context and arguments.
     *
     * @param context A reference to the context in which the callbacks in the list should be fired.
     * @param args An argument, or array of arguments, to pass to the callbacks in the list.
     * @see { https://api.jquery.com/callbacks.fireWith/}
     */
  def fireWith(context: js.Any = js.native, args: js.Array[js.Any] = js.native): JQueryCallback = js.native
  /**
     * Determine whether a supplied callback is in a list
     *
     * @param callback The callback to search for.
     * @see { https://api.jquery.com/callbacks.has/}
     */
  def has(callback: js.Function): Boolean = js.native
  /**
     * Lock a callback list in its current state.
     * @see { https://api.jquery.com/callbacks.lock/}
     */
  def lock(): JQueryCallback = js.native
  /**
     * Determine if the callbacks list has been locked.
     * @see { https://api.jquery.com/callbacks.locked/}
     */
  def locked(): Boolean = js.native
  /**
     * Remove a callback or a collection of callbacks from a callback list.
     *
     * @param callbacks A function, or array of functions, that are to be removed from the callback list.
     * @see { https://api.jquery.com/callbacks.remove/}
     */
  def remove(callbacks: js.Function): JQueryCallback = js.native
  /**
     * Remove a callback or a collection of callbacks from a callback list.
     *
     * @param callbacks A function, or array of functions, that are to be removed from the callback list.
     * @see { https://api.jquery.com/callbacks.remove/}
     */
  def remove(callbacks: js.Array[js.Function]): JQueryCallback = js.native
}