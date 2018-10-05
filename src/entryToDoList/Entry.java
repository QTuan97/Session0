package src.entryToDoList;

public class Entry {
    private static int count = 0;
    private int id;
    private int priotity;
    private String notes;

    public Entry(){
    }

    public int getCount() {
        return this.id;
    }

    public String getNotes(){
        return this.notes;
    }

    public int getPriotity(){
        return this.priotity;
    }

    public Entry(int priotity, String notes){
        this.priotity = priotity;
        this.notes = notes;
        this.id = count + 1;
        count++;
    }

    public String getEntryInfo(){
        return "(Priotity: " + priotity + ") " + notes;
    }
}
