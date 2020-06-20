
package sarasai;

public class MyLinkedList {
    private Item head;
    public MyLinkedList() {
        head = null;
    }
    public void add(Object o) {
        if (head == null){
            this.head = new Item();
            this.head.value = o; 
        } else {
            Item last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new Item();
            last.next.value = o;
        }
    }
    public Object get(int index) {
        //
        return null;
    }
    public void remove(int index) {
        //
    }
    public void set(int index, Object o) {
        //
    }
    public void insert(int index, Object o) {
        //
    }
    public int size() {
        if (head == null) {
            return 0;
        } else {
            Item last = head;
            int counter = 1;
            while (last.next != null) {
                last = last.next;
                counter++;
            }
            return counter;
        }
    }
    @Override
    public String toString() {
        String s = "MyLinkedList{";
        Item last = head;
        while (last != null) {
            s += (last.value == null) ? "null" : last.value.toString() + " ";
            last = last.next;
        }
        s += "}";
        return s;
    }
    private class Item {
        Item next;
        Object value;
    }
}