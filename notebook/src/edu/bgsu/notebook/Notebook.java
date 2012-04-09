package edu.bgsu.notebook;

import java.util.*;

/**
 * Notebook class.
 * @author Josh LaRoe
 * @since 04/03/2012
 */

public class Notebook 
{
	private String name;
	private List<Note> notes;
	private List<Category> categories;

	/**
	 * Constructor for a blank notebook. 
	 * @param _name The name of the new notebook.
	 */
	public Notebook(String _name) 
	{
		name = _name;
	}

	/**
	 * Sorts notes by Comparator
	 * @param comp Comparator to compare notes
	 */
	public void sortNotes(Comparator<Note> comp) 
	{
		Collections.sort(notes, comp);
	}

	/**
	 * Searches notes by field
	 * @return The results list of notes
	 */
	public List<Note> searchNotes() 
	{
		return notes;
	}

	/**
	 * Remove a note from the notebook
	 * @param _note The note to be removed
	 */
	public void remove(Note _note) 
	{
		notes.remove(_note);
	}

	/**
	 * Remove a category from the notebook
	 * @param _category The category to remove
	 */
	public void remove(Category _category) 
	{
		categories.remove(_category);

		/* Remove it from all of the notes */
		for(Note note : notes) {
			note.removeCategory(_category);
		}
	}

	/**
	 * Add a note to the notebook
	 * @param _note The note to be added
	 */
	public void add(Note _note) 
	{
		notes.add(_note);
	}

	/**
	 * Add a category to the notebook
	 * @param _category The category to be added
	 */
	public void add(Category _category) 
	{
		categories.add(_category);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String _name)
	{
		name = _name;
	}
}
