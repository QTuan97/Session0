package src.entryToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class Todo {
    ArrayList<Entry> list = new ArrayList<Entry>();

    public void addEntry(Entry entry){
        list.add(entry);
    }

    public void getEntryById(int id){
        int found = 0;
        for(int i  = 0;i < list.size();i++){
            boolean match = list.get(i).getCount() == id;
            if(match){
                System.out.println("The position of entry is "
                        + id);
                found++;
                break;
            }
        }
        boolean notFound = found == 0;
        if (notFound) {
            System.out.println("There is no entry with id " + id + " in the list");
        }
    }

    public void sortList(){
        Entry temp;
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j <list.size(); j++) {
                if (list.get(j).getPriotity() > list.get(i).getPriotity()){
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                    sortList();
                }
            }
        }
    }
    public void showTodoList(){
            System.out.println("There are " + list.size() + " jobs to do in list: ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i).getEntryInfo());
                System.out.println();
            }
        }
    public void deleteEntry(int id){
        if(id > list.size()){
            System.out.println("Invaild input!");
        }else{
            list.remove(list.get(id));
        }
    }
    }
