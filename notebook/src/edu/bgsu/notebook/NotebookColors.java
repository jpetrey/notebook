package edu.bgsu.notebook;

import java.awt.Color;

/**
 * Colors enumeration.
 */
public enum NotebookColors 
{
    BLUE, RED, YELLOW, BLACK, MAGENTA, GREEN;
    
    public Color getColor()
    {
    	switch(this)
    	{
    	case BLUE : return Color.BLUE;
    	case RED : return Color.RED;
    	case YELLOW : return new Color(0xffff80);
    	case BLACK : return Color.BLACK;
    	case MAGENTA : return Color.MAGENTA;
    	case GREEN : return Color.GREEN;
    	default : return Color.WHITE;
    	}
    }
    
    public String getHexString()
    {
    	switch(this)
    	{
    	case BLUE : return "#0000ff";
    	case RED : return "#ff0000";
    	case YELLOW : return "#ffff80";
    	case BLACK : return "#000000";
    	case MAGENTA : return "#ff00ff";
    	case GREEN : return "#00ff00";
    	default : return "#ffffff";
    	}
    }
}