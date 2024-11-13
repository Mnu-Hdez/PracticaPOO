package model;
import java.util.Collection;

public class Team 
{
    private String name;
    private Collection<Player> lineup;
    private Admin admin;

    public Team(String name,Admin admin,Collection<Player> lineup)
    {
        this.name = name;
        this.admin = admin;
        this.lineup = lineup;
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

    public Admin getAdmin() {
        return admin;
    }


    //revisar
    public double getMediaGeometrica()
    {
        //hay que hacerlo de todas las estadísticas
        // TO FIX
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
