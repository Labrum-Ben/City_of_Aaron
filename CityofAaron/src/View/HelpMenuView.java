// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: ADRIENNE GROLL
// Date last modified: 11/7/2018
//-------------------------------------------------------------
package View;


import Control.GameControl;
import java.util.Scanner;
import cityofaaron.CityofAaron;
/**
 *
 * @author theag - ADRIENNE GROLL
 */
public class HelpMenuView 
{
    Scanner keyboard = new Scanner(System.in);
    
    private String helpMenu;
    private int max;
    
    public void displayHelpMenuView()
{
    // execute this loop as long as the selected option is not 5
    int menuOption;
    do
{
    // Display the menu
    System.out.println(helpMenu);

    // Prompt the user and get the user’s input
    menuOption = getMenuOption();
    // Perform the desired action
    doAction(menuOption);
}   while (menuOption != max);
}

// The MainMenuView constructor
// Purpose: Initialize the menu data
// Parameters: none
// Returns: none
// ===================================
public HelpMenuView()
{
        helpMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: HELP GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - View goals\n" +
                   " 2 - View map help\n" +
                   " 3 - View move help\n" +
                   " 4 - View list help\n" +
                   " 5 - Quit\n";
        
        max = 5;
               
}            
 // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================         
public int getMenuOption()
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

    // Perform the desired action
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(int option)
    {
        switch(option)
        {
            case 1: // View goals
                ViewGoals();
                break;
            case 2: // View map help
                ViewMapHelp();
                break;
            case 3: // View move help
                ViewMoveHelp();
                break;
            case 4: // View list help
                ViewListHelp();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
        }
            
    }


 public void ViewGoals()
 {
     System.out.println("\nView goals option selected.");
 }
 
 public void ViewMapHelp()
 {
     System.out.println("\nView map help option selected.");
 }
 
 public void ViewMoveHelp ()
 {
     System.out.println("\nView move help option selected.");
 }
 
 public void ViewListHelp ()
 {
     System.out.println("\nView list help option selected.");
 }
}
