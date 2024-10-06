package controller;

import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

import model.Matchmake;
import model.Player;


public class Matchmake_Controller
{
    private HashMap<Player,Matchmake> matchmake;

    public Matchmake_Controller()
    {
        this.matchmake = new HashMap<Player,Matchmake>();
    }

    //CHECK
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
                matchmake.put(playerA,new Matchmake(playerA,playerB);

                playerList.remove(p1);
                playerList.remove(p2);
            } 
        }
        return flag; 
    }

    //CHECK
    public boolean matchmake(Player playerA, Player playerB)
    {
        boolean flag = false;
        // Player aux = matchmake.get(playerA).getPlayerB();
        if(!matchmake.containsKey(playerA)) //PlayerA not in the list
        {    
            //check if PlayerB has matchmake with PlayerA
            if(!(matchmake.get(playerB)).getPlayerB.equals(playerA)) 
                {
                    Matchmake aux_match = new Matchmake(playerA, playerB);
                    matchmake.put(playerA, aux_match);
                    flag = true;
                }
        }else
                {
                //matchmake has a PlayerA and checks for PlayerB
                if(!(matchmake.get(playerA)).getPlayerB.equals(playerB))
                    {
                        Matchmake aux_match = new Matchmake(playerA, playerB);
                        matchmake.put(playerA, aux_match);
                        flag = true;
                    }
                }
        return flag;
    }

    //revisar logica de hashmap
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
        this.matchmake = new HashMap<Player,Matchmake>();
    }
}
