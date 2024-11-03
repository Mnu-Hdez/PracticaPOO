package model;
import java.math.*;
import java.util.Collection;

public class team 
{
    private String name;
    private Collection<Player> lineup;

    public team()
    {

    }

    
    public String getName() {
        return name;
    }


    public void setName(String name) 
    {
        this.name = name;
    }


    public Collection<Player> getLineup() 
    {
        return lineup;
    }


    public void setLineup(Collection<Player> lineup) 
    {
        this.lineup = lineup;
    }


    //revisar
    public double getMediaGeometrica()
    {
        double mux = 1;
        for(Player aux: lineup)
        {
            if(aux.getScore()!= 0.0)
            {
                 mux = mux * aux.getScore();
            }
        }

        double media = Math.cbrt(mux);
        return media;
    }



}
