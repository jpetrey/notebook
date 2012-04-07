/*
 * Category Class
 * Josh LaRoe
 * 04/03/2012
 */
import java.util.*;

public class Category {
    
    private String title;
    private LinkedList<Note> notes;
    private String comments;
    
    /* Constructor for a new empty category */
    public Category(String _title, String _comments) {
        
        title = _title;
        comments = _comments;
        notes = new LinkedList<Note>();
        
    }
    
    /* Constructor for a new category with notes */
    public Category(String _title, String _comments, LinkedList<Note> _notes) {
        
        
    }
    
    /*
    public LinkedList<Note> searchForNotesInCategory(Note _note) {
        
        LinkedList<Note> results;
        
        return results;
        
    }
    */
    
    public void sortNotesInCategory() {
      
        /* Sort the notes */
        
    }
    
    public void removeNoteFromCategory(Note _note) {
        
        notes.remove(_note);
        
    }
    
    public void addNoteToCategory(Note _note) {
        
        notes.add(_note);
        
    }
    
    /* Setters and Getters */
    
    public void setComments(String _comments) {
        
        comments = _comments;
        
    }
    
    public String getComments() {
        
        return comments;
        
    }
    
    public void setTitle(String _title) {
        
        title = _title;
        
    }
    
    public String getTitle() {
        
        return title;
        
    }
    
    public void setNotes(LinkedList<Note> _notes) {
        
        notes = _notes;
        
    }
    
    public LinkedList<Note> getNotes() {
        
        return notes;
        
    }
    
}
