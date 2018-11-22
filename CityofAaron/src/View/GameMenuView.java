/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

        
import Control.GameControl;
import java.util.Scanner;
import CityofAaron.CityofAaron;
import View.ViewInterface.MenuView;
/**
 *
 * @author theag
 */
public class GameMenuView extends MenuView
{
// The MainMenuView constructor
// Purpose: Initialize the menu data1
// Parameters: none
// Returns: none
// ===================================
public GameMenuView()
{
        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - View the map\n" +
                   " 2 - View a list\n" +
                   " 3 - Move to a new location\n" +
                   " 4 - Manage the crops\n" +
                   " 5 - Return to the Main menu\n",
        
                 5);            
}  
    @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // View map
                ViewMap();
                break;
            case 2: // View list
                ViewList();
                break;
            case 3: // Move to a new location
                MoveToNewLocation();
                break;
            case 4: // Manage the crops
                ManageCrops();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
        }
            
    }    
    
 public void ViewMap()
 {
     System.out.println("\nView map option selected.");
 }
 
 public void ViewList()
 {
     System.out.println("\nView list option selected.");
 }
 
 public void MoveToNewLocation ()
 {
     System.out.println("\nMove to new location selected.");
 }
 
 public void ManageCrops ()
 {
     System.out.println("\nManage the crops.");
 }
 
     // The viewList() method
    // Purpose: Creates a ListMenuView object and calls its
    // displayMenu( ) method       
    // Parameters: none
    // Returns: none
    public void viewList()
    {
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenuView();
    } 
    
    
}

