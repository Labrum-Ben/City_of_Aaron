// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: ADRIENNE GROLL
// Date last modified: 11/7/2018
//-------------------------------------------------------------
package View;


import Control.GameControl;
import java.util.Scanner;
import cityofaaron.CityofAaron;
import View.ViewInterface.MenuView;
/**
 *
 * @author theag - ADRIENNE GROLL
 */
public class HelpMenuView extends MenuView
{
// The MainMenuView constructor
// Purpose: Initialize the menu data1
// Parameters: none
// Returns: none
// ===================================
public HelpMenuView()
{
        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: HELP GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - View goals\n" +
                   " 2 - View map help\n" +
                   " 3 - View move help\n" +
                   " 4 - View list help\n" +
                   " 5 - Return to the Main menu\n",
        
                 5);
               
}                
    @Override public void doAction(int option)
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
