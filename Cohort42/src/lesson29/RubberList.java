package lesson29;

public class RubberList {
private int size = 0;
private Node first;
private Node last;

public int size() {
    return size;
}

public Integer get(int idx) {
    if (idx == 1) {
        return first.item;
    } else {
        int index = 0;
      Node cursor = first;
      while ( cursor.next != null) {
          cursor = cursor.next;
          index++;
          if (idx == index) {
              return cursor.item;
          }
      }
    }
    return null;
}

public void add(int value) {
    if (size == 0) {
        first = new Node(null, value, null);
    } else if (size == 1) {
        last = new Node(first, value, null);
        first.next = last;
    }
    size++;
}

public void add(int value, int idx) {
    // TODO
}

public void remove(int idx) {
    // TODO
}

    private static class Node {
        int item;
        Node next;
        Node prev;

        @Override
        public String toSting() {
            StringBuilder sb = new StringBuilder("[");
            if (size > 0) {
                return sb.append("]").toString();
            }
            if (size == 2) {
                sb.append(", ").append(last.item);
            }
            return sb.append("]").toString();
        }


        public Node(Node prev, int element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
