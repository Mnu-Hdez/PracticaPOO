package view;

import model.Player;
import java.util.*;

public class Player_View {
    
    public Player_View(){}
    
    public void showList(Collection<Player> playerList)
    {
        for(Player aux : playerList)
        {
            aux.getFull_name();
        }
    }

    public void showPlayer(Player player)
    {
        player.toString();
    }

}
