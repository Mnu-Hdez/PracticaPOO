package controller;
import model.Team;
import model.Player;
import model.Admin;
import java.util.Collection;
public class Team_Controller 
{
    private Collection<Team> TeamList;
    
    public Team_Controller(Collection<Team> TeamList) 
    {
        this.TeamList = TeamList;
    }

    public boolean teamCreate(String Team_name,Admin admin)
    {
        for(Team team: TeamList)
        {
            if(team.getName().equals(Team_name))
            {
                return false;
            }
        }
       // no se ha encontrado un equipo con el mismo nombre
       this.TeamList.add(new Team(Team_name,admin));
        return true;
    }

    public boolean teamCreate(String Team_name,Admin admin,Collection<Player> lineup)
    {


        return false;
    }

    public boolean teamDelete(String Team_name)
    {
        //ESTO DEPENDE DE SI EL CONTROLADOR DE TOURNAMENT
        // NOS DICE SI EL TORNEO COMENZO O NO
        
        //fix
        return false;
    }

    public boolean teamAdd(String Team_name,Player player)
    {
        for(Team team: TeamList)
        {
            if(team.getName().equals(Team_name))
            {
                team.getLineup().add(player);
                return true;
            }
        }
        return false;
    }

    public boolean teamAdd(String Team_name,Admin admin,Collection<Player> players)
    {
        for(Team team: TeamList)
        {
            if(team.getName().equals(Team_name))
            {
                
            }
        }
        return false;
    }

    public boolean teamRemove(String Team_name,Player player)
    {
        for(Team team: TeamList)
        {
            if(team.getName().equals(Team_name))
            {
                team.getLineup().remove(player);
                return true;
            }
        }
        return false;
    }
    

}
