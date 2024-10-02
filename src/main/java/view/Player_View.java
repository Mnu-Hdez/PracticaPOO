package view;

import model.Player;
import java.util.HashMap;

public class Player_View {
    
    public Player_View(){}
    
    public void show(HashMap<String,Player> playerList)
    {
        for(HashMap.Entry<String,Player> aux : playerList.entrySet())
        {
            String name = aux.getKey();
            playerList.get(name).toString();
        }
    }

}
