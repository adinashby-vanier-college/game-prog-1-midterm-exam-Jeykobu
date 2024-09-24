// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /* */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new  Burger();
        addObject(burger, 43, 45);
        Burger burger2 =  new  Burger();
        addObject(burger2, 274, 100);
        Burger burger3 =  new  Burger();
        addObject(burger3, 481, 34);
        Burger burger4 =  new  Burger();
        addObject(burger4, 156, 136);
        Burger burger5 =  new  Burger();
        addObject(burger5, 409, 201);
        Burger burger6 =  new  Burger();
        addObject(burger6, 417, 91);
        Burger burger7 =  new  Burger();
        addObject(burger7, 77, 294);
        Burger burger8 =  new  Burger();
        addObject(burger8, 267, 331);
        Burger burger9 =  new  Burger();
        addObject(burger9, 514, 333);
        Pig pig =  new  Pig();
        addObject(pig, 294, 197);
        Snake snake =  new  Snake();
        addObject(snake, 561, 38);
    }
}
