package controller;
import java.util.ArrayList;
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
    
    public boolean createPlayer(String name)
    {
        boolean flag = false;
        if(PlayerList.get(name)==null)
        {
            PlayerList.put(name,new Player(name));
            flag = true;
        }
        return flag;
    }

    public boolean deletePlayer(String name)
    {
        boolean flag = false;

        if(PlayerList.get(name)!= null)
        {
            PlayerList.remove(name);
            flag = true;
        }
        return flag;
    }

    public void showList()
    {
        this.playerview.showList(PlayerList);
    }

    
    public void rank()
    {
        
        ArrayList<Player> players = new ArrayList<>(PlayerList.values());
        while(!players.isEmpty())
        {
            Player aux = players.get(0);
            for(Player player:players)
            {
                if(aux.getScore()<player.getScore())
                    aux = player;
                    
            }
            this.playerview.showPlayer(aux);

            players.remove(aux);
        }
    }
    
}