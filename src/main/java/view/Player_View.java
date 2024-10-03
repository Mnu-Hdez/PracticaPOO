package view;

import model.Player;
import java.util.HashMap;

public class Player_View {
    
    public Player_View(){}
    
    public void showList(HashMap<String,Player> playerList)
    {
        for(HashMap.Entry<String,Player> aux : playerList.entrySet())
        {
            String name = aux.getKey();
            playerList.get(name).toString();
        }
    }

    public void showPlayer(Player player)
    {
        player.toString();
    }

}
