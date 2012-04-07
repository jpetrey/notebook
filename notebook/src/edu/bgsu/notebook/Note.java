import java.util.*;

public class Note {

    private int nid;
    private String title;
    private String comments;
    private Color color;
    private LinkedList<Category> categories;
    
    /* Construtor for new note with categories */
    public Note(String _title, String _comments, LinkedList<Category> _categories, Color _color) {
    
        title = _title;
        comments = _comments;
        categories = _categories;
        color = _color;
        
    }
    
    /* Constructor for a new note with one category */
    public Note(String _title, String _comments, Category _category, Color _color) {
        
        title = _title;
        comments = _comments;
        categories = new LinkedList<Category>();
        categories.add(_category);
        color = _color;
        
    }
    
    /* Constructor for a new note with no categories */
    public Note(String _title, String _comments, Color _color) {
        
        title = _title;
        comments = _comments;
        color = _color;
        categories = new LinkedList<Category>();
        
    }
    
    /* Constructor for a copy of a note */
    public Note(Note note) {
        
        title = note.title;
        comments = note.comments;
        color = note.color;
        categories = note.categories;
        
    }
    
    /* Constructor for a note from OCR */
    public Note() {
       
        
        
    }
    
    /*
    public LinkedList<Category> searchForCategoriesInNote() {
        
        LinkedList<Category> results;
        
        return results;
        
    }
    */
    
    public void sortCategoriesInNote() {
        
        
        
    }
    
    public void removeCategoryFromNote(Category _category) {
        
        categories.remove(_category);
        _category.removeNoteFromCategory(this);
        
    }
    
    public void addCategoryToNote(Category _category) {
        
        categories.add(_category);
        _category.addNoteToCategory(this);
        
    }
    
    public void setCategory(LinkedList<Category> _categories) {
        
        categories = _categories;
        
    }
    
    public LinkedList<Category> getCategory() {
        
        return categories;
        
    }
    
    public void setTitle(String _title) {
        
        title = _title;
        
    }
    
    public void setComments(String _comments) {
        
        comments = _comments;
        
    }
    
    public String getTitle() {
        
        return title;
        
    }
    
    public String getComments() {
        
        return comments;
        
    }
    
    public void setColor(Color _color) {
        
        color = _color;
    }
    
    public Color getColor() {
        
        return color;
        
    }
    
}