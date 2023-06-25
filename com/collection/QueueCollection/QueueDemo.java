package com.collection.QueueCollection;
/**
 * @author BAO 6/25/2023
 */
import java.util.LinkedList;
import java.util.Queue;

/**
 * Mỗi queue method tồn 2 tại 2 loại
 *
 * <p>- These methods throw an exception if the operation fails
 *
 * <p>boolean add(E e): this method inserts the specified element into this queue if it is possible
 * to do so immediately without violating(mà không vi phạm giới hạn sức chứa), returning true khi
 * thành công and ném ra 1 lỗi ILLegalStateException nếu không còn chỗ trống.
 *
 * <p>E element() - Method này trả về phần đầu của queue nhưng không xóa.
 *
 * <p>E remove() - Method này trả về phần đầu và xóa element đó khỏi queue
 *
 * <p>These methods return a special value if the operation fails (either null or false, depending
 * on the operation).
 *
 * <p>boolean offer(E e) - This method inserts the specified element into this queue if it is
 * possible to do so immediately without violating(vi phạm) capacity restrictions(hạn chế)
 *
 * <p>E peek() - This method retrieves, but does not remove, the head of this queue, or returns null
 * if this queue is empty.
 *
 * <p>E poll() - This method retrieves and removes the head of this queue, or returns null if this
 * queue is empty.
 */
public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> elementQueue = new LinkedList<>();

    elementQueue.add("element1");
    elementQueue.add("element1");
    elementQueue.add("element2");
    elementQueue.add("element3");

    System.out.println("WatitingQueue: " + elementQueue);

    //    The remove() method throws NoSuchElementException of the Queue is empty
    String name = elementQueue.remove();
    System.out.println("Removed from WaitingQueue: " + name + " | new Queue: " + elementQueue);

    elementQueue.clear();
    System.out.println(elementQueue.poll());
    System.out.println("Removed all | New Queue: " + elementQueue);

    //    Check is a Queue is empty
    System.out.println("is waitingQueue empty? :" + elementQueue.isEmpty());

    //    Find the size of the Queue
    System.out.println("Size of waitingQueue :" + elementQueue.size());

    String nameAdd = "Johnny";
    elementQueue.add(nameAdd);

    //    Check if the Queue contains an element
    if (elementQueue.contains(nameAdd)) {
      System.out.println("WaitingQueue contains " + nameAdd);
    } else {
      System.out.println("WaitingQueue doesn't contains " + nameAdd);
    }

    // Get the element at the front of the Queue without removing it using element();
    //    The element() method throws NoSuchElementException if the Queue is empty;
    elementQueue.add("Bao");
    String firstElementInWaitingQueue = elementQueue.element();
    System.out.println("First "+firstElementInWaitingQueue);


    elementQueue.clear();
    // Get the element at the front of the Queue without removing it using peek()
    // The peek() method is similar to element() except that it returns null if the Queue is empty
    firstElementInWaitingQueue = elementQueue.peek();
    System.out.println("Waiting Queue : " + firstElementInWaitingQueue);
  }
}
