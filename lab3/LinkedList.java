public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        size = 0;
        head = null;
    }

    public static void main(String[] a) {
        LinkedList l = new LinkedList();
        for (int i = 0; i < 100; i++) {
            l.add(i);
        }
      for (int i = 0; i < 100; i++) {
         l.delete(0);
      }
        for (int i = 0; i < 100; i++) {
            l.add(i);
        }
        l.delete(-5);
        for (int i = 0; i < 100; i++) {
            l.add(i);
        }
        for (int i = 0; i < 100; i++) {
            l.add(i);
        }
        for (int i = 0; i < 100; i++) {
            l.add(i);
        }
        l.delete(5);

        System.out.println("програма закінчена успіщно " + l.size);
    }

    public void add(Integer data) {
        size++;
        if (head == null) {
            head = new Node();
            head.setData(data);
            head.setNext(null);
            System.out.println("Added data: " + data + " new size=" + size);
            return;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            // next є останнім елементом
            Node last = new Node();
            last.setData(data);
            last.setNext(null);
            current.setNext(last);
        }
        System.out.println("Added data: " + data + " new size=" + size);
    }

    public Integer get(int index) {
        if (size <= index) {
            return null;
        }
        Node next = head;
        for (int i = 0; i < index; i++) {
            next = next.getNext();
        }
        return next.getData();

    }

    public boolean delete(int index) {
        final boolean result = _delete(index);
        System.out.println("Deleted index: " + index + " result=" + result + " new size=" + size);
        return result;
    }

    private boolean _delete(int index) {

        if (size <= index || index < 0) {
            return false;
        }

        if (index == 0) {
            head = head.getNext();
            size--;
            return true;
        }

        size--;
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        Node newNext = current.getNext().getNext();
        current.setNext(newNext);

        return true;
    }

    public int size() {
        System.out.println("getting size: " + size);
        return size;

    }
}