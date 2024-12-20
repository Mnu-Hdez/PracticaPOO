package controller;
import model.Team;
import model.Player;
import model.Admin;

import java.util.ArrayList;
import java.util.Collection;
public class Team_Controller 
{
    private Collection<Team> TeamList;
    
    public Team_Controller(Collection<Team> TeamList) 
    {
        this.TeamList = TeamList;
    }

    public Team getTeam(String Team_name)
   {
       for(Team team: TeamList)
       {
            if(team.getName().equals(Team_name))
            {
                return team;
            }
       }
       return null;
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
        this.TeamList.add(new Team(Team_name,admin,new ArrayList<Player>()));
        return true;
    }

    public boolean teamCreate(String Team_name,Admin admin,Collection<Player> lineup)
    {
        for(Team team: TeamList)
        {
            if(team.getName().equals(Team_name))
            {
                return false;
            }
        }
        this.TeamList.add(new Team(Team_name,admin,lineup));
        return false;
    }

    public boolean teamDelete(String Team_name)
    {
        for(Team team: TeamList)
        {
            if(team.getName().equals(Team_name))
            {
                TeamList.remove(team);
                return true;
            }
        }
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
