package com.collection.dequeExample;

/**
 * @author BAO 6/25/2023
 */

/**
 * A deque is a double-ended-queue. A double-ended-queue is a linear collection of elements that
 * supports the insertion and removal of elements at both end points.
 *
 * <p>The Deque interface is a richer(phong phú) abstract data type than both Stack and Queue
 * because it implements both stacks and queues at the same time.
 *
 * <p>Predefined classes like ArrayDeque and LinkedList implement the Deque interface.
 *
 * <p>Note that the Deque interface can be used both as last-in-first-out stacks and
 * first-in-first-out queues. The methods given in the Deque interface are divided into three parts:
 *
 * <p>Insert The addFirst and offerFirst methods insert elements at the beginning of the Deque
 * instance. The methods addLast and offerLast insert elements at the end of the Deque instance.
 *
 * <p>When the capacity of the Deque instance is restricted, the preferred methods are offerFirst
 * and offerLast because addFirst and offerFirst might fail to throw an exception if it is full.
 *
 * <p>Remove The removeFirst and pollFirst methods remove elements from the beginning of the Deque
 * instance. The removeLast and pollLast methods remove elements from the end. The methods pollFirst
 * and pollLast return null if the Deque is empty whereas the methods removeFirst and removeLast
 * throw an exception if the Deque instance is empty.
 *
 * <p>Retrieve The methods getFirst and peekFirst retrieve the first element of the Deque instance.
 * These methods don't remove the value from the Deque instance. Similarly, the methods getLast and
 * peekLast retrieve the last element. The methods getFirst and getLast throw an exception if the
 * deque instance is empty whereas the methods peekFirst and peekLast return NULL.
 */
public class DequeExample {
  public static void main(String[] args) {}
}
