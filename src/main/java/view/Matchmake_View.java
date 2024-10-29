package view;

import java.util.HashMap;

import model.Matchmake;
import model.Player;

public class Matchmake_View
{
    public Matchmake_View(){}

    private void show(Matchmake matchmake)
    {
        matchmake.toString();
    }

    public void showList(HashMap<Player, Matchmake> matchmakes)
    {
        for(Matchmake aux: matchmakes.values())
        {
            show(aux);
        }
    }

}

