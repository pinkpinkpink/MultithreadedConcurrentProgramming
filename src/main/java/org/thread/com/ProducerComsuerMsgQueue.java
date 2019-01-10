package src.main.java.org.thread.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.jvm.hotspot.utilities.MessageQueue;
import sun.plugin2.message.Message;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;

/**
 * 描述:
 * MsgQueuemanger
 *查询端口连接机器数量 netstat -nat | grep 80 -c
 * @author wangyifan
 * @create 2019-01-10 08:22
 */
public class ProducerComsuerMsgQueue<message> implements MessageQueue {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerComsuerMsgQueue.class);
    public final BlockingQueue<message> messages = new BlockingQueue<message>() {
        /**
         * Inserts the specified element into this queue if it is possible to do
         * so immediately without violating capacity restrictions, returning
         * {@code true} upon success and throwing an
         * {@code IllegalStateException} if no space is currently available.
         * When using a capacity-restricted queue, it is generally preferable to
         * use {@link #offer(Object) offer}.
         *
         * @param message the element to add
         * @return {@code true} (as specified by {@link Collection#add})
         * @throws IllegalStateException    if the element cannot be added at this
         *                                  time due to capacity restrictions
         * @throws ClassCastException       if the class of the specified element
         *                                  prevents it from being added to this queue
         * @throws NullPointerException     if the specified element is null
         * @throws IllegalArgumentException if some property of the specified
         *                                  element prevents it from being added to this queue
         */
        @Override
        public boolean add(message message) {
            return false;
        }

        /**
         * Inserts the specified element into this queue if it is possible to do
         * so immediately without violating capacity restrictions, returning
         * {@code true} upon success and {@code false} if no space is currently
         * available.  When using a capacity-restricted queue, this method is
         * generally preferable to {@link #add}, which can fail to insert an
         * element only by throwing an exception.
         *
         * @param message the element to add
         * @return {@code true} if the element was added to this queue, else
         * {@code false}
         * @throws ClassCastException       if the class of the specified element
         *                                  prevents it from being added to this queue
         * @throws NullPointerException     if the specified element is null
         * @throws IllegalArgumentException if some property of the specified
         *                                  element prevents it from being added to this queue
         */
        @Override
        public boolean offer(message message) {
            return false;
        }

        /**
         * Retrieves and removes the head of this queue.  This method differs
         * from {@link #poll() poll()} only in that it throws an exception if
         * this queue is empty.
         *
         * @return the head of this queue
         * @throws NoSuchElementException if this queue is empty
         */
        @Override
        public message remove() {
            return null;
        }

        /**
         * Retrieves and removes the head of this queue,
         * or returns {@code null} if this queue is empty.
         *
         * @return the head of this queue, or {@code null} if this queue is empty
         */
        @Override
        public message poll() {
            return null;
        }

        /**
         * Retrieves, but does not remove, the head of this queue.  This method
         * differs from {@link #peek peek} only in that it throws an exception
         * if this queue is empty.
         *
         * @return the head of this queue
         * @throws NoSuchElementException if this queue is empty
         */
        @Override
        public message element() {
            return null;
        }

        /**
         * Retrieves, but does not remove, the head of this queue,
         * or returns {@code null} if this queue is empty.
         *
         * @return the head of this queue, or {@code null} if this queue is empty
         */
        @Override
        public message peek() {
            return null;
        }

        /**
         * Inserts the specified element into this queue, waiting if necessary
         * for space to become available.
         *
         * @param message the element to add
         * @throws InterruptedException     if interrupted while waiting
         * @throws ClassCastException       if the class of the specified element
         *                                  prevents it from being added to this queue
         * @throws NullPointerException     if the specified element is null
         * @throws IllegalArgumentException if some property of the specified
         *                                  element prevents it from being added to this queue
         */
        @Override
        public void put(message message) throws InterruptedException {

        }

        /**
         * Inserts the specified element into this queue, waiting up to the
         * specified wait time if necessary for space to become available.
         *
         * @param message the element to add
         * @param timeout how long to wait before giving up, in units of
         *                {@code unit}
         * @param unit    a {@code TimeUnit} determining how to interpret the
         *                {@code timeout} parameter
         * @return {@code true} if successful, or {@code false} if
         * the specified waiting time elapses before space is available
         * @throws InterruptedException     if interrupted while waiting
         * @throws ClassCastException       if the class of the specified element
         *                                  prevents it from being added to this queue
         * @throws NullPointerException     if the specified element is null
         * @throws IllegalArgumentException if some property of the specified
         *                                  element prevents it from being added to this queue
         */
        @Override
        public boolean offer(message message, long timeout, TimeUnit unit) throws InterruptedException {
            return false;
        }

        /**
         * Retrieves and removes the head of this queue, waiting if necessary
         * until an element becomes available.
         *
         * @return the head of this queue
         * @throws InterruptedException if interrupted while waiting
         */
        @Override
        public message take() throws InterruptedException {
            return null;
        }

        /**
         * Retrieves and removes the head of this queue, waiting up to the
         * specified wait time if necessary for an element to become available.
         *
         * @param timeout how long to wait before giving up, in units of
         *                {@code unit}
         * @param unit    a {@code TimeUnit} determining how to interpret the
         *                {@code timeout} parameter
         * @return the head of this queue, or {@code null} if the
         * specified waiting time elapses before an element is available
         * @throws InterruptedException if interrupted while waiting
         */
        @Override
        public message poll(long timeout, TimeUnit unit) throws InterruptedException {
            return null;
        }

        /**
         * Returns the number of additional elements that this queue can ideally
         * (in the absence of memory or resource constraints) accept without
         * blocking, or {@code Integer.MAX_VALUE} if there is no intrinsic
         * limit.
         *
         * <p>Note that you <em>cannot</em> always tell if an attempt to insert
         * an element will succeed by inspecting {@code remainingCapacity}
         * because it may be the case that another thread is about to
         * insert or remove an element.
         *
         * @return the remaining capacity
         */
        @Override
        public int remainingCapacity() {
            return 0;
        }

        /**
         * Removes a single instance of the specified element from this queue,
         * if it is present.  More formally, removes an element {@code e} such
         * that {@code o.equals(e)}, if this queue contains one or more such
         * elements.
         * Returns {@code true} if this queue contained the specified element
         * (or equivalently, if this queue changed as a result of the call).
         *
         * @param o element to be removed from this queue, if present
         * @return {@code true} if this queue changed as a result of the call
         * @throws ClassCastException   if the class of the specified element
         *                              is incompatible with this queue
         *                              (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>)
         * @throws NullPointerException if the specified element is null
         *                              (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>)
         */
        @Override
        public boolean remove(Object o) {
            return false;
        }

        /**
         * Returns {@code true} if this collection contains all of the elements
         * in the specified collection.
         *
         * @param c collection to be checked for containment in this collection
         * @return {@code true} if this collection contains all of the elements
         * in the specified collection
         * @throws ClassCastException   if the types of one or more elements
         *                              in the specified collection are incompatible with this
         *                              collection
         *                              (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>)
         * @throws NullPointerException if the specified collection contains one
         *                              or more null elements and this collection does not permit null
         *                              elements
         *                              (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>),
         *                              or if the specified collection is null.
         * @see #contains(Object)
         */
        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        /**
         * Adds all of the elements in the specified collection to this collection
         * (optional operation).  The behavior of this operation is undefined if
         * the specified collection is modified while the operation is in progress.
         * (This implies that the behavior of this call is undefined if the
         * specified collection is this collection, and this collection is
         * nonempty.)
         *
         * @param c collection containing elements to be added to this collection
         * @return {@code true} if this collection changed as a result of the call
         * @throws UnsupportedOperationException if the {@code addAll} operation
         *                                       is not supported by this collection
         * @throws ClassCastException            if the class of an element of the specified
         *                                       collection prevents it from being added to this collection
         * @throws NullPointerException          if the specified collection contains a
         *                                       null element and this collection does not permit null elements,
         *                                       or if the specified collection is null
         * @throws IllegalArgumentException      if some property of an element of the
         *                                       specified collection prevents it from being added to this
         *                                       collection
         * @throws IllegalStateException         if not all the elements can be added at
         *                                       this time due to insertion restrictions
         * @see #add(Object)
         */
        @Override
        public boolean addAll(Collection<? extends message> c) {
            return false;
        }

        /**
         * Removes all of this collection's elements that are also contained in the
         * specified collection (optional operation).  After this call returns,
         * this collection will contain no elements in common with the specified
         * collection.
         *
         * @param c collection containing elements to be removed from this collection
         * @return {@code true} if this collection changed as a result of the
         * call
         * @throws UnsupportedOperationException if the {@code removeAll} method
         *                                       is not supported by this collection
         * @throws ClassCastException            if the types of one or more elements
         *                                       in this collection are incompatible with the specified
         *                                       collection
         *                                       (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>)
         * @throws NullPointerException          if this collection contains one or more
         *                                       null elements and the specified collection does not support
         *                                       null elements
         *                                       (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>),
         *                                       or if the specified collection is null
         * @see #remove(Object)
         * @see #contains(Object)
         */
        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        /**
         * Retains only the elements in this collection that are contained in the
         * specified collection (optional operation).  In other words, removes from
         * this collection all of its elements that are not contained in the
         * specified collection.
         *
         * @param c collection containing elements to be retained in this collection
         * @return {@code true} if this collection changed as a result of the call
         * @throws UnsupportedOperationException if the {@code retainAll} operation
         *                                       is not supported by this collection
         * @throws ClassCastException            if the types of one or more elements
         *                                       in this collection are incompatible with the specified
         *                                       collection
         *                                       (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>)
         * @throws NullPointerException          if this collection contains one or more
         *                                       null elements and the specified collection does not permit null
         *                                       elements
         *                                       (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>),
         *                                       or if the specified collection is null
         * @see #remove(Object)
         * @see #contains(Object)
         */
        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        /**
         * Removes all of the elements from this collection (optional operation).
         * The collection will be empty after this method returns.
         *
         * @throws UnsupportedOperationException if the {@code clear} operation
         *                                       is not supported by this collection
         */
        @Override
        public void clear() {

        }

        /**
         * Compares the specified object with this collection for equality. <p>
         * <p>
         * While the {@code Collection} interface adds no stipulations to the
         * general contract for the {@code Object.equals}, programmers who
         * implement the {@code Collection} interface "directly" (in other words,
         * create a class that is a {@code Collection} but is not a {@code Set}
         * or a {@code List}) must exercise care if they choose to override the
         * {@code Object.equals}.  It is not necessary to do so, and the simplest
         * course of action is to rely on {@code Object}'s implementation, but
         * the implementor may wish to implement a "value comparison" in place of
         * the default "reference comparison."  (The {@code List} and
         * {@code Set} interfaces mandate such value comparisons.)<p>
         * <p>
         * The general contract for the {@code Object.equals} method states that
         * equals must be symmetric (in other words, {@code a.equals(b)} if and
         * only if {@code b.equals(a)}).  The contracts for {@code List.equals}
         * and {@code Set.equals} state that lists are only equal to other lists,
         * and sets to other sets.  Thus, a custom {@code equals} method for a
         * collection class that implements neither the {@code List} nor
         * {@code Set} interface must return {@code false} when this collection
         * is compared to any list or set.  (By the same logic, it is not possible
         * to write a class that correctly implements both the {@code Set} and
         * {@code List} interfaces.)
         *
         * @param o object to be compared for equality with this collection
         * @return {@code true} if the specified object is equal to this
         * collection
         * @see Object#equals(Object)
         * @see Set#equals(Object)
         * @see List#equals(Object)
         */
        @Override
        public boolean equals(Object o) {
            return false;
        }

        /**
         * Returns the hash code value for this collection.  While the
         * {@code Collection} interface adds no stipulations to the general
         * contract for the {@code Object.hashCode} method, programmers should
         * take note that any class that overrides the {@code Object.equals}
         * method must also override the {@code Object.hashCode} method in order
         * to satisfy the general contract for the {@code Object.hashCode} method.
         * In particular, {@code c1.equals(c2)} implies that
         * {@code c1.hashCode()==c2.hashCode()}.
         *
         * @return the hash code value for this collection
         * @see Object#hashCode()
         * @see Object#equals(Object)
         */
        @Override
        public int hashCode() {
            return 0;
        }

        /**
         * Returns the number of elements in this collection.  If this collection
         * contains more than {@code Integer.MAX_VALUE} elements, returns
         * {@code Integer.MAX_VALUE}.
         *
         * @return the number of elements in this collection
         */
        @Override
        public int size() {
            return 0;
        }

        /**
         * Returns {@code true} if this collection contains no elements.
         *
         * @return {@code true} if this collection contains no elements
         */
        @Override
        public boolean isEmpty() {
            return false;
        }

        /**
         * Returns {@code true} if this queue contains the specified element.
         * More formally, returns {@code true} if and only if this queue contains
         * at least one element {@code e} such that {@code o.equals(e)}.
         *
         * @param o object to be checked for containment in this queue
         * @return {@code true} if this queue contains the specified element
         * @throws ClassCastException   if the class of the specified element
         *                              is incompatible with this queue
         *                              (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>)
         * @throws NullPointerException if the specified element is null
         *                              (<a href="{@docRoot}/java/util/Collection.html#optional-restrictions">optional</a>)
         */
        @Override
        public boolean contains(Object o) {
            return false;
        }

        /**
         * Returns an iterator over the elements in this collection.  There are no
         * guarantees concerning the order in which the elements are returned
         * (unless this collection is an instance of some class that provides a
         * guarantee).
         *
         * @return an {@code Iterator} over the elements in this collection
         */
        @Override
        public Iterator<message> iterator() {
            return null;
        }

        /**
         * Returns an array containing all of the elements in this collection.
         * If this collection makes any guarantees as to what order its elements
         * are returned by its iterator, this method must return the elements in
         * the same order. The returned array's {@linkplain Class#getComponentType
         * runtime component type} is {@code Object}.
         *
         * <p>The returned array will be "safe" in that no references to it are
         * maintained by this collection.  (In other words, this method must
         * allocate a new array even if this collection is backed by an array).
         * The caller is thus free to modify the returned array.
         *
         * <p>This method acts as bridge between array-based and collection-based
         * APIs.
         *
         * @return an array, whose {@linkplain Class#getComponentType runtime component
         * type} is {@code Object}, containing all of the elements in this collection
         */
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        /**
         * Returns an array containing all of the elements in this collection;
         * the runtime type of the returned array is that of the specified array.
         * If the collection fits in the specified array, it is returned therein.
         * Otherwise, a new array is allocated with the runtime type of the
         * specified array and the size of this collection.
         *
         * <p>If this collection fits in the specified array with room to spare
         * (i.e., the array has more elements than this collection), the element
         * in the array immediately following the end of the collection is set to
         * {@code null}.  (This is useful in determining the length of this
         * collection <i>only</i> if the caller knows that this collection does
         * not contain any {@code null} elements.)
         *
         * <p>If this collection makes any guarantees as to what order its elements
         * are returned by its iterator, this method must return the elements in
         * the same order.
         *
         * <p>Like the {@link #toArray()} method, this method acts as bridge between
         * array-based and collection-based APIs.  Further, this method allows
         * precise control over the runtime type of the output array, and may,
         * under certain circumstances, be used to save allocation costs.
         *
         * <p>Suppose {@code x} is a collection known to contain only strings.
         * The following code can be used to dump the collection into a newly
         * allocated array of {@code String}:
         *
         * <pre>
         *     String[] y = x.toArray(new String[0]);</pre>
         * <p>
         * Note that {@code toArray(new Object[0])} is identical in function to
         * {@code toArray()}.
         *
         * @param a the array into which the elements of this collection are to be
         *          stored, if it is big enough; otherwise, a new array of the same
         *          runtime type is allocated for this purpose.
         * @return an array containing all of the elements in this collection
         * @throws ArrayStoreException  if the runtime type of any element in this
         *                              collection is not assignable to the {@linkplain Class#getComponentType
         *                              runtime component type} of the specified array
         * @throws NullPointerException if the specified array is null
         */
        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        /**
         * Removes all available elements from this queue and adds them
         * to the given collection.  This operation may be more
         * efficient than repeatedly polling this queue.  A failure
         * encountered while attempting to add elements to
         * collection {@code c} may result in elements being in neither,
         * either or both collections when the associated exception is
         * thrown.  Attempts to drain a queue to itself result in
         * {@code IllegalArgumentException}. Further, the behavior of
         * this operation is undefined if the specified collection is
         * modified while the operation is in progress.
         *
         * @param c the collection to transfer elements into
         * @return the number of elements transferred
         * @throws UnsupportedOperationException if addition of elements
         *                                       is not supported by the specified collection
         * @throws ClassCastException            if the class of an element of this queue
         *                                       prevents it from being added to the specified collection
         * @throws NullPointerException          if the specified collection is null
         * @throws IllegalArgumentException      if the specified collection is this
         *                                       queue, or some property of an element of this queue prevents
         *                                       it from being added to the specified collection
         */
        @Override
        public int drainTo(Collection<? super message> c) {
            return 0;
        }

        /**
         * Removes at most the given number of available elements from
         * this queue and adds them to the given collection.  A failure
         * encountered while attempting to add elements to
         * collection {@code c} may result in elements being in neither,
         * either or both collections when the associated exception is
         * thrown.  Attempts to drain a queue to itself result in
         * {@code IllegalArgumentException}. Further, the behavior of
         * this operation is undefined if the specified collection is
         * modified while the operation is in progress.
         *
         * @param c           the collection to transfer elements into
         * @param maxElements the maximum number of elements to transfer
         * @return the number of elements transferred
         * @throws UnsupportedOperationException if addition of elements
         *                                       is not supported by the specified collection
         * @throws ClassCastException            if the class of an element of this queue
         *                                       prevents it from being added to the specified collection
         * @throws NullPointerException          if the specified collection is null
         * @throws IllegalArgumentException      if the specified collection is this
         *                                       queue, or some property of an element of this queue prevents
         *                                       it from being added to the specified collection
         */
        @Override
        public int drainTo(Collection<? super message> c, int maxElements) {
            return 0;
        }
    };
    private final LinkedTransferQueue<Message> messageQueue;

    private <message> ProducerComsuerMsgQueue(){
        messageQueue = (LinkedTransferQueue<Message>) new LinkedTransferQueue<message>();

    }

    public void put(message msg){
        try{
            messageQueue.put(message);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public Message take(){
        try{
            return messageQueue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return  null;
    }
    /**
     * This blocks until a message is available. Even if the thread is
     * interrupted while it is waiting, this will not return until a
     * message is written by the entity on the other side of the
     * queue.
     */
    @Override
    public Object readMessage() {
        return null;
    }

    /**
     * This blocks for up to <code>millis</code> milliseconds until a
     * message is available. If no message becomes available within
     * this time period, or the thread is interrupted during the wait,
     * returns null. (This implies that passing the value null back and
     * forth is not distinguishable with this method.) Passing a value
     * of 0 for the <code>millis</code> argument causes this method to
     * return without blocking. The millis argument must be greater
     * than or equal to zero.
     *
     * @param millis
     */
    @Override
    public Object readMessageWithTimeout(long millis) {
        return null;
    }

    /**
     * Write a message to the queue
     *
     * @param obj
     */
    @Override
    public void writeMessage(Object obj) {

    }
}
