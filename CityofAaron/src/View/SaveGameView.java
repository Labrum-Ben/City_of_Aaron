// The MainMenuView class - part of the view layer
// Object of this class manage the main menu
// Author: Labrum Ben, Brown team
// Date last modified: November 2018
//-------------------------------------------------------------
package View;

import View.MainMenuView;
import java.util.Scanner;
import cityofaaron.CityofAaron;
import View.ViewInterface.MenuView;


public class SaveGameView extends MenuView
{

    private boolean saveGameMenu;
    
   /*rivate final String saveGameMenu;
    private int max;
 Scanner keyboard = new Scanner(System.in);
 */


public SaveGameView()
{
        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: SAVED GAME MENU  *\n" +
                   "* Select a saved game*\n" +
                   "**********************************\n" +
                   " 1 - Save Game 1\n" +
                   " 2 - Save Game 2\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Main Menu\n" +
                   " 5 - Quit\n",
        
                
                5);
}
        
   public void displaySaveGameView(){
        int menuOption;
        do
        {
        // Display the menu
        System.out.println(saveGameMenu);

        // Prompt the user and get the user’s input
        menuOption = getMenuOption();
        // Perform the desired action
        }   while (menuOption != max);
    }
    /*
    public int getMenuOption(){
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
                startGameOne();
                break;
            case 2: // get and start a saved game
                startGameTwo();
                break;
            case 3: // get help menu
                displayHelpMenuView();
                break;
            case 4: // save game
                displayMainMenuView();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
        }
    } 

    public void startGameOne(){
    }
    
    public void startGameTwo(){
    }
    
    public void displayHelpMenuView(){
    }

    public void displayMainMenuView() {
        
    }
    
  
    }

  

  




