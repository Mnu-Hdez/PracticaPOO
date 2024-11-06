package controller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

import model.*;
import view.Player_View; 

public class Player_Controller extends User_Controller implements IPlayer
{
    //fix to use  the super playerList
    private Collection<Player> PlayerList;
    private Player_View playerview;

    public Player_Controller(Collection<Player> PlayerList)
    {
        this.PlayerList = PlayerList;
    }

    public Player_Controller()
    {
        this.PlayerList = new ArrayList<Player>();
    }

    public Collection<Player> getPlayerList() {
        return PlayerList;
    }

    public void setPlayerList(Collection<Player> playerList) {
        PlayerList = playerList;
    }
    
    public void setPlayerScore(String mail,float score){

        for(Player player:PlayerList)
        {
            if(player.getMail().equals(mail))
            {
                if(score >= -999999.0)
                {
                    player.setScore(score);
                }else System.out.println("Un jugador no puede tener puntuacion menor a -999999.0");
            }
        }
    }
    
    public boolean createPlayer(String mail,String password, String dni, String full_name,Admin admin)
    { 
        boolean flag = true;
        for(Player player:PlayerList)
        {
            if(player.getMail().equals(mail))
            {
                flag = false;
            }
        }
        if(flag == true)
        {
            PlayerList.add(new Player(mail,password,0,dni,full_name,admin));
        }
        
        return flag;
    }

    public Player getPlayer(String mail)
    {
        for(Player player:PlayerList)
        {
            if(player.getMail().equals(mail))
            {
                return player;
            }
        }
        return null;
    }

    public boolean deletePlayer(String mail)
    {
        boolean flag = false;

        for(Player player:PlayerList){
            if(player.getMail().equals(mail))
            {
                PlayerList.remove(player);
                flag = true;
            }
        }
        return flag;
    }

    public void showList()
    {
        this.playerview.showList(PlayerList);
    }

    

    public void rank()
    {
        ArrayList<Player> players = new ArrayList<>(PlayerList);

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

    public void showStatistics()
    {
        //rellenar
    }
    
}