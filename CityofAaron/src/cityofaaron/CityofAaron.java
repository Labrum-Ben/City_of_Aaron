/*
 * The CityofAaron file for the cityOfAaron project
 * CIT-260
 * Fall 2018
 *  Team members: Ben Labrum, Adrienne Groll
 */

package cityofaaron;
import java.util.Random;
import Model.*;
import View.*;
import Model.Game;
public class CityofAaron {
     
    
    private static Game theGame = null;

     /**
     * ADRIENNE GROLL
     */
    // main function - entry point for the program
    // runs the main menu
    public static void main(String[] args) {
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();       
         
    }
    public static void setGame(Game game) {
        theGame = game;
     }
     
    public static Game getGame( ) {
    return theGame;
    }
    
}

