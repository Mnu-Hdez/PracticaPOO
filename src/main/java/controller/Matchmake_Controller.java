package controller;

import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import model.Matchmake;
import model.Player;
import view.Matchmake_View;


public class Matchmake_Controller
{
    // modificar el hashmap a collections(cualquier tipo)
    //usar arrwylist para hacerlo más ágil
    private Collection <Matchmake> matchmake;
    private Matchmake_View matchView;

    public Matchmake_Controller(Collection <Matchmake> matchmake)
    {
        this.matchmake = matchmake;
    }
    
    public ArrayList<Matchmake> getMatchmake() {
        return matchmake;
    }


    public void setMatchmake(ArrayList<, Matchmake> matchmake) {
        this.matchmake = matchmake;
    }

    //CHECK --> fix
    public boolean random_matchmake(ArrayList<Player> playerList)
    {
        boolean flag = false;
        if( playerList.size() % 2 == 0)
        {
            flag = true;
            int p1,p2;
            while(!playerList.isEmpty())
            {
                Random random = new Random();
                p1 = random.nextInt(playerList.size());
                p2 = random.nextInt(playerList.size());
                while(p1 == p2)
                {
                   p2 = random.nextInt(playerList.size()); 
                }
            
                Player playerA = playerList.get(p1);
                Player playerB = playerList.get(p2);
                matchmake.put(playerA,new Matchmake(playerA,playerB));

                playerList.remove(p1);
                playerList.remove(p2);
            } 
        }
        return flag; 
    }

    //FIXED
    public boolean matchmake(Player playerA, Player playerB)
    {
        boolean flag = true;
        
        for(Matchmake match: PlayerList)
        {
            if(match.getPlayerA().equals(playerA) && match.getPlayerB().equals(PlayerB))
            {
                return false;
            }
            else if(match.getPlayerA().equals(playerB) && match.getPlayerB().equals(PlayerA))
            {
                return false;
            }
        }
        
        if(flag)
        {
            this.PlayerList.add(new Matchmake(PlayerA,PlayerB));
        }
        return flag;
    }

    //FIX IN THE VIEW ALSO
    public void showMatchmaking()
    {
        matchView.showList(this.matchmake);
    }
    //RECODE FOR CHANGES MADE(HASHMAP to ARRAYLIST)
    public void erase_matchmaking(Matchmake matchmaking)
    {
        Player aux = matchmake.get(matchmaking.getPlayerA()).getPlayerA();

        if(matchmake.get(aux).getPlayerB().equals(matchmaking.getPlayerB()))
        {
            matchmake.remove(aux);
        }

    }
    //CHECK
    public void clear_matchmaking()
    {
        this.matchmake = new ArrayList<Matchmake>();
    }
}
