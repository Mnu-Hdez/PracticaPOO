import controller.*;
import model.*;
public class Generator 
{
    private Player_Controller pController;

    public Generator(Player_Controller pController)
    {
        this.pController = pController;
    }

    public Generator()
    {

    }


    public void populate()
    {
        Player player = new Player("Luisa", 4.5);
        pController.getPlayerList().put(player.getName(),player);
        player = new Player("Manuel",2.7);
        pController.getPlayerList().put(player.getName(), player);
        player = new Player("Kurt",4.0);
        pController.getPlayerList().put(player.getName(),player);
        player = new Player("Sofia",3.8);
        pController.getPlayerList().put(player.getName(),player);
        player = new Player("Robert",3.8);
        pController.getPlayerList().put(player.getName(), player);
        
    }
}
