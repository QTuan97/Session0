package src.deployMyLinkedList;

public class MyLinkList<T> {
    private Node head;
    private Node last;
    private int numNodes = 0;

    private class Node<T> {
        private Node<T> next;
        private T data;
        public Node(T data) {
            this.data = data;
        }
        public T getData() {
            return this.data;
        }
    }

    public MyLinkList(T data){
        head = new Node(data);
    }

    public void add(int index, T data){
        Node temp = head;
        Node hold;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        hold = temp.next;
        temp.next = new Node(data);
        temp.next.next = hold;
        numNodes++;
    }

    public void addFrist(T data){
        if(head == null){
            head = new Node(data);
            last = head;
        }else {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
        }
        numNodes++;
    }

    public void addLast(T data){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        last = temp.next;
        numNodes++;
    }

    public void remove(int index){
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;

    }

    public void removeObject(T data){
        while (head.getData() == data) {
            head = head.next;
        }
        Node temp = head;
        while (temp != null) {
            if(temp.getData() == data){
                temp.next = temp.next.next;
                numNodes--;
            }
            temp = temp.next;
        };
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int size(){
        int count = 0;
        for(Node temp = head; temp != null; temp = temp.next){
            ++count;
        }
        return count;
    }

    public boolean contains(T data){
        Node temp = head;
        while (temp != null){
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(T data){
        Node temp = head;
        int count = 0;
        while (temp != null){
            if(temp.data == data){
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    public void get(int index){
        Node temp = head;
        if(index > numNodes){
            System.out.println("Out of bound!");
            return;
        }
        for(int i = 0; i <= index; i++){
            if(i == index){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
}


