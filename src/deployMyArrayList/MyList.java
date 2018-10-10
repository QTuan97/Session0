package src.deployMyArrayList;

import java.sql.SQLOutput;

public class MyList<T> {
    Object[] list = new Object[DEFAULT_CAPACITY];
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public MyList() {
        Object[] list = new Object[DEFAULT_CAPACITY];
    };

    public MyList(int capacity){
        Object[] list = new Object[capacity];
    }

    public void add(int index, T elements){
        list[index] = elements;
        size++;
    }

    public void remove(int index){
        for(int i = 0; i < list.length; i++ ){
            if(i == index){
                for(int j = i; j < list.length - 1; j++){
                    list[j] = list[j+1];
                }
                break;
            }
        }
    }

    public boolean contains(T elements){
        for(int i = 0; i < list.length; i++){
            if(list[i] == elements){
                return true;
            }
        }
        return false;
    }

    public int indexOf(T elements){
        int pos = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i] == elements){
                pos += i;
            }
        }
        return pos;
    }

    public void ensureCapacity(int cap){
        Object[] list1 = new Object[cap];
        for(int i = 0; i < list.length;i++){
            for(int j = i; j < list1.length;j++)
            list1[j] = list[i];
        }
        System.out.println("Has increased to " + cap + " !");
    }

    public int size(){
        return list.length;
    }

    public void get(int index){
        if(index > list.length || index < 0){
            System.out.println("Invaild input!");
        }
        for(int i = 0; i < list.length; i++){
            if(i == index){
                System.out.println(list[i]);
            }
        }
    }

    public void showList(){
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }

    public void clear(){
        for(int i = 0; i < list.length; i++){
            list[i] = null;
        }
    }

}
