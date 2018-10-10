package src.deployMyArrayList;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(3);
        list.add(0,12);
        list.add(1,13);
        list.add(2,15);
        list.ensureCapacity(10);
        list.add(4,20);
        list.showList();
        System.out.println("Find things");
        list.get(0);
        System.out.println("Clear things");
        list.clear();
        list.showList();
    }
}
