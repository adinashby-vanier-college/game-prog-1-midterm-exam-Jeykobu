// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(600, 400, 1);
        showTextWithBigBlackFont("You win", 180, 200);
    }

    /**
     * 
     */
    public void showTextWithBigBlackFont(String messageint, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        String message = "Winninggggggggg";
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
