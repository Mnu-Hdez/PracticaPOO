package controller;
import java.util.HashMap;
import model.Matchmake;
import model.Player;

public class Matchmake_Controller
{
    private HashMap<Player,Matchmake> matchmake;

    public Matchmake_Controller()
    {
        this.matchmake = new HashMap<Player,Matchmake>();
    }

    //revisar logica hashmaps
    public void random_matchmake()
    {
        //TO DO
    }

    //revisar
    public void matchmake(Player playerA, Player playerB)
    {
        Player aux = matchmake.get(playerA).getPlayerB();
        if(!matchmake.containsKey(playerA) || !aux.equals(playerA))
        {
            Matchmake aux_match = new Matchmake(playerA, playerB);
            matchmake.put(playerA, aux_match);
        }

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
    //TO DO
    public void clear_matchmaking()
    {

    }
}