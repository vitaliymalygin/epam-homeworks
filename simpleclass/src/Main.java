/**
 * Initiating class
 */
public class Main {
    public static void main(String[] args) {
        Notepad notepad=new Notepad(10);
        notepad.addNewEntry("first","This is my first record");
        notepad.addNewEntry("second","This is my second record");
        notepad.addNewEntry("third","This is my third record");
        notepad.showAllEntries();
        notepad.removeEntry("third");
        notepad.showAllEntries();
        notepad.editEntry("second", "Edited second record");
        notepad.showAllEntries();

    }
}
