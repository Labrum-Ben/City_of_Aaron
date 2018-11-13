package view;

/* ListMenuView class
 * Object: Manage the list menu
 * @author Gavin Siegel
 * Date last modified:  11/7/2018
 */
import view.MainMenuView;
import java.util.Scanner;
import cityofaaron.CityOfAaron;


public class ListMenuView{
    
    private String listMenu;
    private int max;
    Scanner keyboard = new Scanner(System.in);
    
    public ListMenuView(){
           listMenu = "\n"
                + "**********************************\n"
                + "* CITY OF AARON: LIST MENU   *\n"
                + "**********************************\n"
                + " 1 - List or View the animals in the storehouse\n"
                + " 2 - List or View the tools in the storehouse\n"
                + " 3 - List or View the provisions in the storehouse\n"
                + " 4 - List or View the authors of this game\n"
                + " 5 - Return to the Main Menu\n";        
        }

    public void displayMenuView(){
        int menuOption;
        do
        {
        // Display the menu
        System.out.println(listMenu);

        // Prompt the user and get the user’s input
        menuOption = getMenuOption();
        // Perform the desired action
        }   while (menuOption != max);
    }
    
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
    }
    

    public void doAction(int option)
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

    public void listAnimals(){
 
    }

    public void listTools(){

    }

    public void listProvisions(){

    }

    public void listTeam(){
 
    }
}
