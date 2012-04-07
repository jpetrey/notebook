package edu.bgsu.notebook;

import java.util.ArrayList;
import java.util.List;

public class Note
{
    private String title;
    private String comments;
    private Color color;
    private List<Category> categories;
    
    /**
     *  Constructor for new note with categories.
     */
    public Note(String title, String comments, Color color, List<Category> categories) 
    {
        this.title = title != null ? title : "";
        this.comments = comments != null ? comments : "";
        this.categories = categories != null ? categories : new ArrayList<Category>();
        this.color = color != null ? color : Color.BLACK;
    }
    
    public void removeCategory(Category category) 
    {
        categories.remove(category);   
    }
    
    public void addCategory(Category category) 
    {     
        categories.add(category);
    }
    
    public void addCategories(List<Category> categories) 
    {
        this.categories.addAll(categories);
    }
    
    public List<Category> getCategory() 
    {
        return categories;
    }
    
    public void setTitle(String _title) 
    {
        title = _title;
    }
    
    public void setComments(String _comments) 
    {
        comments = _comments;
    }
    
    public String getTitle() 
    {
        return title;
    }
    
    public String getComments() 
    {
        return comments;
    }
    
    public void setColor(Color _color) 
    {
        color = _color;
    }
    
    public Color getColor() 
    {
        return color;
    }
}