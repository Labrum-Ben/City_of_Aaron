// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Ben Labrum, Adrienne Groll team
// Date last modified: 11/7/2018
//-------------------------------------------------------------



package View;

import Control.GameControl;
import View.ViewInterface.MenuView;
import java.util.Scanner;
//import CityofAaron.CityofAaron;


/**
 *
 * @author theag - ADRIENNE GROLL
 */
public class MainMenuView extends MenuView 
{
   /* Scanner keyboard = new Scanner(System.in);
    
    private String theMenu;
    private int max;*/
  
    public void displayHelpMenuView()
{
     // I added this code so it would display the help menu
    HelpMenuView hmv = new HelpMenuView();
    hmv.displayHelpMenuView();
}
/*public void displayMenuView()
{
    int menuOption;
    do
{
    // Display the menu
    System.out.println(theMenu);

    // Prompt the user and get the user’s input
    menuOption = getMenuOption();
    // Perform the desired action
    doAction(menuOption);
}   while (menuOption != max);
}*/

// The MainMenuView constructor
// Purpose: Initialize the menu data
// Parameters: none
// Returns: none
// ===================================
public MainMenuView()
{
        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                   " 5 - Quit\n",
        
                 5);
               
}            
 // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================         
/*public int getMenuOption()
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
        
        
    }*/

    // Perform the desired action
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
   @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // create and start a new game
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                displayHelpMenuView();
                break;
            case 4: // save game
                displaySaveGameView();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
        }
            
    }

        
 // The startNewGame method
 // Purpose: creates game object and starts the game
 // Parameters: none
 // Returns: none
 // ===================================     
 public void startNewGame()
 {
    // Display the Banner Page.
    System.out.println("\nWelcome to the city of Aaron.");

     // Prompt for and get the user’s name.
    String name;
    System.out.println("\nPlease type in your first name: ");
    name = keyboard.next();

    // Call the createNewGame() method in GameControl class
    // pass the name as a parameter
    GameControl.createNewGame(name);

    // Display a welcome message
    System.out.println("Welcome " + name + " have fun!!!");

    // Display the Game menu   
 }



public void startSavedGame()
{
    System.out.println("\nStart saved game option selected.");
}
 

  
public void displaySaveGameView()
{
    System.out.println("\nDisplay save game option selected.");
}

    @Override
    public void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMenuOption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 

}  
 

