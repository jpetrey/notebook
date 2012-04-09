package edu.bgsu.notebook;

import java.util.Comparator;

/**
 * IDComparator class.
 * @author Josh LaRoe
 * @since 04/07/2012
 */

public class IDComparator implements Comparator<Note>
{
	
	/**
	 * Compare two notes by ID
	 * @param note1 Left note
	 * @param note2 Right note
	 * @return diff Difference between the two note's ids
	 */
	public int compare(Note note1, Note note2)
	{
		return note1.getID() - note2.getID();
	}
}
