package edu.bgsu.notebook;

/**
 * Category class.
 * @author Josh LaRoe
 * @since 04/03/2012
 */

public class Category 
{	
	private static int numberOfCategories = 0;
	private int id;
	private String title;
	private String comments;

	/**
	 *  Constructor for new category.
	 */
	public Category(String _title, String _comments) {
		this.id = ++numberOfCategories;
		this.title = title != null ? title : "";
		this.comments = comments != null ? comments : "";
	}

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
	
	public int getID()
	{
		return id;
	}
}