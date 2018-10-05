package src.entryToDoList;
public class TestToDo {
    public static void main(String[] args) {
        Todo ToDoList = new Todo();
        Entry Job1 = new Entry(6, "Work");
        Entry Job2 = new Entry(10, "Sleep");
        Entry Job3 = new Entry(3, "Play");
        ToDoList.addEntry(Job1);
        ToDoList.addEntry(Job2);
        ToDoList.addEntry(Job3);
        ToDoList.deleteEntry(1);
        ToDoList.deleteEntry(4);
        ToDoList.showTodoList();
    }
}
