/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

/**
 *
 * @author Justin Cox
 */
public class FightZombieView extends View{
    public FightZombieView() {
        
        
        
        
        super( "\n*********************************************************"  
            +  "\n*                   TIME TO FIGHT!!!                    *"
            +  "\n*-------------------------------------------------------*"
            +  "\n*      #.                                               *"
            +  "\n*     *@@/             %@  ,@(  /@                      *" 
            +  "\n*    @**@@@.     ,@%@@@@@@@@@@@@@&@(  ./                *"
            +  "\n*   @@@(@ %*  &%,&@@# (@, (@  %&%@@@&@@,                *"
            +  "\n*  @/@@@&  .&@@*&@        /#  ,#,%@@/ .(@%              *"
            +  "\n*        %@@, .@@@@@@&  .   #,          ( %@@&/         *"    
            +  "\n*          ,%@&. ,@#                       @@* /,       *"   
            +  "\n*            (&@&.  .@@@&/      .(&@@,  /@@&,           *"
            +  "\n*             .@&*. &@#  .@(  ,@# ,@@@  *@&,,.          *"
            +  "\n*            ./@@. .&@@@&@@,   @@@@@@&  %@##@#          *"
            +  "\n*            @@/&&   *@@@%       *//,,(.@/&@*           *"
            +  "\n*             .#@@@(.      /@ %&.   .  %@@&.    .       *"
            +  "\n*               ,@@@(               &@,.(@@% #@&@       *"
            +  "\n*                *@@@          .   @#     /@@&./@,      *"
            +  "\n*                    @@@      (@@@%@&,@/  *@@@* .%((@,  *"
            +  "\n*                    &@@  ,#@(%@%@&%@/@#     .*%&@@##@  *"
            +  "\n*                    %@@ *@(&@@&.%%(@*@%            .*  *"
            +  "\n*                    #@@   *@@@&@@@@* @@ .              *"
            +  "\n*             #@@@@@@%@@&.     *# .@& @@/#@@@%.         *"
            +  "\n*              #@(,@( &@#@@@&%###(#%%%@@@      %@@      *"
            +  "\n*              /(      ,    #&&&&&&%%#/.                *"
            +  "\n*-------------------------------------------------------*"
            +  "\n*             What are you going to do?                 *"
            +  "\n--------------------------------------------------------*"
            +  "\n*              F - Fight to the death                   *"
            +  "\n*              R - Run away like a girl                 *"
            +  "\n*********************************************************");
    }
    
        @Override
    public boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "F" :
                    this.fightZombie();
                    break;
            case "R" :
                    System.out.println("You sissy...just fight!");
                    break;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return false;
    }

    private void fightZombie() {
        System.out.println("\n*** fightZombie() called ****");
    }
    
    
}
