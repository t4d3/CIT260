/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.zombieStuff.view;

import byui.CIT260.zombieStuff.control.FightZombieControl;
import byui.CIT260.zombieStuff.exceptions.GameControlException;
import zombiestuff.ZombieStuff;

/**
 *
 * @author Justin Cox
 */
public class FightZombieView extends View {

    public FightZombieView() {

        super("\n*********************************************************"
                + "\n*                   TIME TO FIGHT!!!                    *"
                + "\n*-------------------------------------------------------*"
                + "\n*      #.                                               *"
                + "\n*     *@@/             %@  ,@(  /@                      *"
                + "\n*    @**@@@.     ,@%@@@@@@@@@@@@@&@(  ./                *"
                + "\n*   @@@(@ %*  &%,&@@# (@, (@  %&%@@@&@@,                *"
                + "\n*  @/@@@&  .&@@*&@        /#  ,#,%@@/ .(@%              *"
                + "\n*        %@@, .@@@@@@&  .   #,          ( %@@&/         *"
                + "\n*          ,%@&. ,@#                       @@* /,       *"
                + "\n*            (&@&.  .@@@&/      .(&@@,  /@@&,           *"
                + "\n*             .@&*. &@#  .@(  ,@# ,@@@  *@&,,.          *"
                + "\n*            ./@@. .&@@@&@@,   @@@@@@&  %@##@#          *"
                + "\n*            @@/&&   *@@@%       *//,,(.@/&@*           *"
                + "\n*             .#@@@(.      /@ %&.   .  %@@&.    .       *"
                + "\n*               ,@@@(               &@,.(@@% #@&@       *"
                + "\n*                *@@@          .   @#     /@@&./@,      *"
                + "\n*                    @@@      (@@@%@&,@/  *@@@* .%((@,  *"
                + "\n*                    &@@  ,#@(%@%@&%@/@#     .*%&@@##@  *"
                + "\n*                    %@@ *@(&@@&.%%(@*@%            .*  *"
                + "\n*                    #@@   *@@@&@@@@* @@ .              *"
                + "\n*             #@@@@@@%@@&.     *# .@& @@/#@@@%.         *"
                + "\n*              #@(,@( &@#@@@&%###(#%%%@@@      %@@      *"
                + "\n*              /(      ,    #&&&&&&%%#/.                *"
                + "\n--------------------------------------------------------*"
                + "\n*         There is a zombie in this location.           *"
                + "\n*              You have two options:                    *"
                + "\n*                                                       *"
                + "\n*              F - Fight to the death                   *"
                + "\n*              R - Run away like a girl                 *"
                + "\n*********************************************************"
                + "\n\tWhat are you going to do?");
    }

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "F":
                this.fightAZombie();
                System.out.print("\nCongrats, you won...murderer.");
                break;
            case "R":
                return true;
            default:
                System.out.println("\nERROR: Invalid selection... Try again!");
                break;
        }
        return true;
    }

    private void fightAZombie() {
        try {
            FightZombieControl.fightAZombie(ZombieStuff.getCurrentGame().getMap().getLocation(
                    ZombieStuff.getCurrentGame().getPlayerCharacter().getCurrentLocation()));
        } catch (GameControlException e) {
            ErrorView.display("fightAZombie", e.getMessage());
        }
    }
}
