package View;

/* ListMenuView class
 * Object: Manage the list menu
 * @author Adrienne Groll, Ben Labrum, Gavin Siegel
 * Date last modified:  11/24/2018
 */

import Control.GameControl;
import java.util.Scanner;
import cityofaaron.CityofAaron;
import Model.*;
import View.ViewInterface.MenuView;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
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
        Game theGame = CityofAaron.getGame();
        ArrayList<ListItem> animals = theGame.getAnimals();

    System.out.format("%-16s%-24s\n", "Animal", "Quantity");
    for(ListItem animal : animals)
    { 
    System.out.format("%-16s%-24s\n", animal.getName(), animal.getNumber());
    }
    }
  
  //ADRIENNE 12-8-2018 Week 12
    public class WriteFile {
        public void PrintWriter(ArrayList<ListItem> animals) throws IOException {

        PrintWriter pw = null;
        FileOutputStream fo = null;
        
        String filePath;
        System.out.println("\nChoose a saved game.");
        filePath = keyboard.next();
        
        try (PrintWriter out = new PrintWriter("data.txt"))
        {
            pw = new PrintWriter(new FileOutputStream(filePath));
            fo = new FileOutputStream(filePath);
            int datList = animals.size();
            for (int i = 0; i < datList; i++) {
                pw.write(animals.get(i).toString() + "\n");
            }
            } 
            catch(IOException e)
            {
            System.out.println("File Error.");
            }



    } 

    }
  
  
    public void listTools(){
    // List or view the animals in the storehouse
        Game theGame = CityofAaron.getGame();
        ArrayList<ListItem> tools = theGame.getTools();

    System.out.format("%-16s%-24s\n", "tool", "Quantity");
    for(ListItem tool : tools)
    { 
    System.out.format("%-16s%-24s\n", tool.getName(), tool.getNumber());
    }
    }

//Ben Labrum
//12/8/2018
//Week 12 Assignment    
    
      public void listProvisions() {
        System.out.println("Show Provisions Selected");
      }
     public class provisionsList {
        public void PrintWriter(ArrayList<ListItem> provisions) throws IOException {

        PrintWriter pw = null;
        FileOutputStream fo = null;
        
        String filePath;
        System.out.println("\nChoose a saved game.");
        filePath = keyboard.next();
        
        try (PrintWriter out = new PrintWriter("data.txt"))
        {
            pw = new PrintWriter(new FileOutputStream(filePath));
            fo = new FileOutputStream(filePath);
            int dataList = provisions.size();
            for (int i = 0; i < dataList; i++) {
                pw.write(provisions.get(i).toString() + "\n");
            }
            } 
            catch(IOException e)
            {
            System.out.println("File Error.");
            }



    } 

    }
    public void listTeam(){
            System.out.println("\nList team.");
    }
}



