import java.io.*;
import java.util.*;

public class Notebook {

    private int nbid;
    private String name;
    private LinkedList<Note> notes;
    private LinkedList<Category> categories;
    
    /* Constructor for a blank notebook */
    public Notebook(String _name) {
        
        name = _name;
        
    }
    
    /* Constructor for a copy of a notebook */
    public Notebook(Notebook notebook) {
        
        name = notebook.name;
        notes = notebook.notes;
        categories = notebook.categories;
        
    }
    
    public void sortNotesInNotebook() {
        
        
        
    }
    
    public void sortCategoriesInNotebook() {
        
        
        
    }
    
    /*
    
    public LinkedList<Note> searchForNotesInNotebook() {
        
        LinkedList<Note> results;
        
        return results;
        
    }
    
    public LinkedList<Category> searchForCategoriesInNotebook() {
        
        LinkedList<Category> results;
        
        return results;
        
    }
    
    */
    
    public void deleteCategory(Category category) {
        
        
        
    }
    
    public void addCategory(Category category) {
        
        
        
    }
    
    public void deleteNote(Note note) {
        
        
        
    }
    
    public void addNote(Note note) {
        
        
        
    }
    
    public void writeFile(File file) {
        
        
        
    }
    
    public void readFile(File file) {
        
        
        
    }
    
    public String getName() {
        
        return name;
        
    }
    
    public void setName(String _name) {
        
        name = _name;
        
    }
    
}
