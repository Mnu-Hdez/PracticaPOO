package model;
import java.util.Collection;

public class Team 
{
    private String name;
    private Collection<Player> lineup;
    private Admin admin;

    public Team()
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
        //hay que hacerlo de todas las estadísticas

        double mux = 1;
        for(Player aux: lineup)
        {
            if(aux.getScore()!= 0.0)
            {
                 mux = mux * aux.getScore();
            }
        }

        double media = Math.pow(mux, 1.0/lineup.size());
        return media;
    }



}
