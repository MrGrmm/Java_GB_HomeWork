package Lesson_4;

import java.util.LinkedList;

public class task2 {
    public class main<T> {

        private final LinkedList<T> list = new LinkedList<>();
    
        public void enqueue(T element) {
            list.addLast(element);
        }
    
        public T dequeue() {
            if (list.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return list.removeFirst();
        }
    
        public T first() {
            if (list.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return list.getFirst();
        }
    
        public int size() {
            return list.size();
        }
    
        public boolean isEmpty() {
            return list.isEmpty();
        }
            Queue<Integer> queue = new Queue<>();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            System.out.println(queue.dequeue());
            System.out.println(queue.first());
            queue.enqueue(4);
            System.out.println(queue.size());
            while (!queue.isEmpty()) {
                System.out.println(queue.dequeue());
    }
}
