/**
 *<p>Class represents a notebook</p>
 *<p>The entries stores in array</p>
  */
public class Notepad {

    private Entry[] entries;
    /**
     * @param numberOfEntries sets the size of the array
     */

    public Notepad(int numberOfEntries){
        entries=new Entry[numberOfEntries];
    }

    public void addNewEntry(String name, String text) {
        Entry entry = new Entry(name);
        entry.setText(text);
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] == null) {
                entries[i] = entry;
                break;
            }
        }
    }

    public void removeEntry(String name) {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null) {
                if (entries[i].getName().equals(name)) {
                    entries[i] = null;
                }
            }
        }
    }

    public void editEntry(String name, String text) {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i].getName().equals(name)) {
            entries[i].setText(text);
                break;
            }
        }
    }
    public void showAllEntries(){
        for (int i = 0; i < entries.length; i++) {
            if (entries[i]!= null) {
            System.out.println(entries[i].getName()+"\n"+entries[i].getText());
            }
        }
    }
}
