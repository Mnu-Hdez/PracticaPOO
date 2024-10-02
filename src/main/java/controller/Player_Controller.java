package controller;

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

    //To DO
    //modify players score searching by its name
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

    public void show()
    {
        this.playerview.show(PlayerList);
    }

    public void rank()
    {

    }

    public void show_matchmake()
    {

    }

    public void clear_matchmake()
    {

    }

    public void matchmake(Player p1,Player p2)
    {

    }

    public void random_matchmake()
    {

    }

    
}