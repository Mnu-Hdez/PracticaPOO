package controller;
import java.util.ArrayList;
import java.util.Collection;
import model.*;
import view.Player_View; 

public class Player_Controller extends User_Controller<Player> /*implements IPlayer*/
{
    private Player_View playerview;

    public Player_Controller(Collection<Player> PlayerList)
    {
        this.UserList = PlayerList;
    }

    public Player_Controller()
    {
        this.UserList = new ArrayList<Player>();
    }

    public Collection<Player> getPlayerList() {
        return UserList;
    }

    public void setPlayerList(Collection<Player> playerList) {
        this.UserList = playerList;
    }
    
    public void setPlayerScore(String mail,float score){

            if(getPlayer(mail)!= null){

                if(score >= -999999.0)
                {
                    Player player = getPlayer(mail);
                    player.setScore(score);
                }else System.out.println("Un jugador no puede tener puntuacion menor a -999999.0");
            }
    }
    
    public boolean createPlayer(String mail,String password,String dni, String full_name,Admin admin)
    { 
        boolean flag = true;
        if(getPlayer(mail) != null)
        {
            flag = false;
        }
        
        if(flag == true)
        {
            UserList.add(new Player(mail,password,0,dni,full_name,admin));
        }
        
        return flag;
    }

    public boolean addPlayer(Player player)
    {
        if(!this.UserList.contains(player))
        {
            UserList.add(player);
            return true;
        }
        return false;
    }

    public Player getPlayer(String mail)
    {
        for(Player player:UserList)
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
        if(getPlayer(mail) != null){
                UserList.remove(getPlayer(mail));
                flag = true;
        }
        return flag;
    }

    public void showList()
    {
        this.playerview.showList(UserList);
    }

    

    public void rank()
    {
        ArrayList<Player> players = new ArrayList<>(UserList);

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

    public void showStatistics(Player player)
    {
        //rellenar

    }
    
}