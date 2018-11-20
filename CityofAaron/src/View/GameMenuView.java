/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author theag
 */
public class GameMenuView {
    
    // The viewList() method
    // Purpose: Creates a ListMenuView object and calls its
    // displayMenu( ) method       
    // Parameters: none
    // Returns: none
    public void viewList()
    {
        ListMenuView lmv = new ListMenuView();
        mlv.displayMenu();
    } 

    
    
    
}
        public void doAction(int option)
    {
        switch(option)
        {
            case 1: // view the map
                viewMap();
                break;
            case 2: // view a list
                viewList();
                break;

}
