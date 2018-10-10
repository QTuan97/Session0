package src.deployMyLinkedList;

public class testRun {
    public static void main(String[] args) {
        MyLinkList<Integer> list = new MyLinkList(10);
        list.addFrist(12);
        list.addLast(20);
        list.add(3,14);
        list.add(5,15);
        System.out.println("List:");
        list.printList();
        System.out.println("Size:");
        System.out.println(list.size());
        System.out.println("New List:");
        list.removeObject(12);
        list.printList();
    }

}
