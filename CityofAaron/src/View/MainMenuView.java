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
                HelpMenuView mmv = new HelpMenuView();
                mmv.displayMenuView();
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

}  
 

