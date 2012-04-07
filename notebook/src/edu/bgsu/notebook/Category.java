package edu.bgsu.notebook;
import java.util.*;

/**
 * Category class.
 * @author Josh LaRoe
 * @since 04/03/2012
 */
public class Category 
{
    private String title;
    private LinkedList<Note> notes;
    private String comments;
    
    /**
     *  Constructor for a new empty category .
     */
    public Category(String title, String comments) 
    {
        this.title = title;
        this.comments = comments;
        notes = new LinkedList<Note>();
    }
    
    /**
     *  Constructor for a new category with notes 
     */
    public Category(String _title, String _comments, List<Note> notes) 
    {
        
    }
    
    public void sortNotes() 
    {
        // TODO Sort the notes
        throw new RuntimeException("Not yet implemented!");
    }
    
    /* Setters and Getters */
    
    public void setComments(String _comments) 
    {   
        comments = _comments;  
    }
    
    public String getComments() 
    {
        return comments;
    }
    
    public void setTitle(String _title) 
    {
        title = _title;
    }
    
    public String getTitle() 
    {
        return title;
    }
    
    public void setNotes(LinkedList<Note> _notes) 
    {
        notes = _notes;
    }
    
    public LinkedList<Note> getNotes() 
    {
        return notes;
    }
}