package View;

/* ListMenuView class
 * Object: Manage the list menu
 * @author Adrienne Groll, Ben Labrum, Gavin Siegel
 * Date last modified:  11/24/2018
 */

import java.util.Scanner;
import CityofAaron.CityofAaron;
import Model.ListItem;
import View.ViewInterface.MenuView;
import java.util.ArrayList;

public class ListMenuView extends MenuView{
    
   /* private String listMenu;
    private int max;
    Scanner keyboard = new Scanner(System.in); */
    
    public ListMenuView(){
             super("\n" +
                 "**********************************\n"
                + "* CITY OF AARON: LIST MENU   *\n"
                + "**********************************\n"
                + " 1 - List or View the animals in the storehouse\n"
                + " 2 - List or View the tools in the storehouse\n"
                + " 3 - List or View the provisions in the storehouse\n"
                + " 4 - List or View the authors of this game\n"
                + " 5 - Return to the Main Menu\n",
               5);
        }

  


    @Override public void doAction(int option)
    {
         switch(option)
        {
            case 1: // List Animals
                listAnimals();
                break;
            case 2: // List Tools
                listTools();
                break;
            case 3: // List Provisions
                listProvisions();
                break;
            case 4: // List Team
                listTeam();
                break;
            case 5:
                System.out.println("");
        }
    }   


  public void listAnimals()
    {
    // List or view the animals in the storehouse
    ArrayList<ListItem> animals = theGame.getAnimals();

    System.out.format("%-16s%-24s\n", "Animal", "Quantity");
    for(ListItem animal : animals)
    { 
    System.out.format("%-16s%-24s\n", animal.getName(), animal.getNumber());
    }
    }
    public void listTools(){
           System.out.println("\nList tools.");
    }

    public void listProvisions(){
            System.out.println("\nList provisions.");
    }

    public void listTeam(){
            System.out.println("\nList team.");
    }

}
