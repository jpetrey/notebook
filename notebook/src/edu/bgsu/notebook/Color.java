package edu.bgsu.notebook;

/**
 * Colors enumeration.
 */
public enum Color 
{
    BLUE, RED, YELLOW, BLACK, MAGENTA, GREEN;
    
    public Color getColor()
    {
    	switch(this)
    	{
    	case BLUE : return Color.BLUE;
    	case RED : return Color.RED;
    	case YELLOW : return Color.YELLOW;
    	case BLACK : return Color.BLACK;
    	case MAGENTA : return Color.MAGENTA;
    	case GREEN : return Color.GREEN;
    	default: return Color.BLACK;
    	}
    } 
}