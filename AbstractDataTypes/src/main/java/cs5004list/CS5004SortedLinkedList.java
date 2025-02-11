package cs5004list;

public class CS5004SortedLinkedList<T extends Comparable<T>> implements CS5004SortedList<T> {

    private Node<T> head;

    public void insert(T element) {
        if (head == null) {
            head = new Node<>(element);
            return;
        }
        head = head.insert(element);
    }

    public String toString()  {
        if (head == null) {
            return "";
        }
        return head.toString();
    }

    class Node<T extends Comparable<T>> {
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node(T data) {
            this(data, null);
        }

        Node<T> insert(T data) {
            // insert before
            if (data.compareTo(this.data) < 0) {
                return new Node<>(data, this);
            }
            // end of list
            if (this.next == null) {
                this.next = new Node<>(data);
                return this;
            }
            this.next = next.insert(data);
            return this;
        }

        public String toString() {
            if (this.next == null) {
                return data.toString();
            }
            return data.toString() + " " + next.toString();
        }

    }

}
