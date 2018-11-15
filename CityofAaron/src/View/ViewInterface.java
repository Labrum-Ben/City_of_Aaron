/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.util.Scanner;


/**
 *
 * @author theag
 */
public interface ViewInterface
{
    public void displayMenu();
    public int getMenuOption();
    public void doAction(int option);
    
    public abstract class MenuView implements ViewInterface
{
    // the data members common to all menu views
    protected final static Scanner keyboard = new Scanner(System.in);
        
    protected String menu;  // this string holds the menu string
    protected int max; // this int holds the max input value

    // MenuView Constructor
    // Purpose: Initialize the view object with the menu string
    // Parameters: the menu string and the max value
    // Returns: none
    public MenuView(String _menu, int _max)
    {
        menu = _menu;
        max = _max;
    }
}
    
     // The displayMenu method
    // Purpose: displays the menu, gets the user's input, and does the 
    //  selected action
    // Parameters: none
    // Returns: none
    // ===================================    
    @Override public void displayMenu()
    {
        // execute this loop as long as the selected option is not max
        int menuOption = 0;
        do
        {
            // display the menu
            System.out.println(menu);
        
            // get the user's selection
            menuOption = getMenuOption();
        
            // perform the selected action
            doAction(menuOption);  
        } while (menuOption != max);
    } 
// The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================         
  @Override public int getMenuOption()
    {
        //declare a variable to hold user's input
        int userInput = 0;
        final int MAX = 5;
        //begin loop
        do
        {
        //get user input from the keyboard
        userInput = keyboard.nextInt();
        //if it is not a valid value, output an error message
        if(userInput < 1 || userInput > MAX)
        System.out.println("ERROR: you must select 1, 2, 3, 4, or 5");
        //loop back to the top of the loop if input was not valid
        //end loop
        }while (userInput < 1 || userInput > MAX);
        return userInput;
        
        
    }
}
        
