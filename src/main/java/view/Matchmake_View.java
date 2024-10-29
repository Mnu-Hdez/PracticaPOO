package view;

import java.util.ArrayList;
import model.Matchmake;

public class Matchmake_View
{
    public Matchmake_View(){}

    private void show(Matchmake matchmake)
    {
        matchmake.toString();
    }

    public void showList(ArrayList <Matchmake> matchmakes)
    {
        for(Matchmake viewer: matchmakes)
        {
            show(viewer);
        }
    }

}

