package controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import model.Player;
import view.Player_View; 

public class Player_Controller
{
    private HashMap<String,Player> PlayerList;
    private Player_View playerview;

    public Player_Controller(HashMap<String,Player> PlayerList)
    {
        this.PlayerList = PlayerList;
    }

    public Player_Controller()
    {
        this.PlayerList = new HashMap<String,Player>();
    }

    public HashMap<String,Player> getPlayerList() {
        return PlayerList;
    }

    public void setPlayerList(HashMap<String,Player> playerList) {
        PlayerList = playerList;
    }

    
    public void setPlayerScore(String name,float score){
        if(PlayerList.get(name)!= null)
        {
            PlayerList.get(name).setScore(score);
        }

    }
    
    public void createPlayer(String name)
    {
        if(PlayerList.get(name)==null)
        {
            PlayerList.put(name,new Player(name));
        }
    }

    public void deletePlayer(String name)
    {
        if(PlayerList.get(name)!= null)
        {
            PlayerList.remove(name);
        }
    }

    public void showList()
    {
        this.playerview.showList(PlayerList);
    }

    
    public void rank()
    {
        
        ArrayList<Player> players = new ArrayList<>(PlayerList.values());
        Collections.sort(players);
        while(!players.isEmpty())
        {
            Player aux = players.get(players.size()-1);
            
            this.playerview.showPlayer(aux);

            players.remove(aux);
        }
    }
    
}
