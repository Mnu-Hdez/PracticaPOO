package controller;

import java.util.Random;
import java.util.HashMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import model.Matchmake;
import model.Player;
import view.Matchmake_View;


public class Matchmake_Controller
{
    private ArrayList <Matchmake> matchmake;
    private Matchmake_View matchView;

    public Matchmake_Controller(ArrayList <Matchmake> matchmake)
    {
        this.matchmake = matchmake;
    }
    
    public ArrayList<Matchmake> getMatchmake() {
        return this.matchmake;
    }


    public void setMatchmake(ArrayList<Matchmake> matchmake) {
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
                matchmake.add(new Matchmake(playerA,playerB));

                playerList.remove(p1);
                playerList.remove(p2);
            } 
        }
        return flag; 
    }

    
    public boolean matchmake(Player playerA, Player playerB)
    {
        boolean flag = true;
        
        for(Matchmake match: matchmake)
        {
            if(match.getPlayerA().equals(playerA) && match.getPlayerB().equals(playerB))
            {
                return false;
            }
            else if(match.getPlayerA().equals(playerB) && match.getPlayerB().equals(playerA))
            {
                return false;
            }
        }
        
        if(flag)
        {
            this.matchmake.add(new Matchmake(playerA,playerB));
        }
        return flag;
    }

    public void showMatchmaking()
    {
        matchView.showList(this.matchmake);
    }
    
    public void erase_matchmaking(Matchmake matchmaking)
    {
        if(matchmake.contains(matchmaking))
        {
            matchmake.remove(matchmaking);
        }
    }

    public void clear_matchmaking()
    {
        this.matchmake = new ArrayList<Matchmake>();
    }
}
