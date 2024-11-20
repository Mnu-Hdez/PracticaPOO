package controller;
import model.Player;
import model.Tournament;
import model.Team;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Tournament_Controller {

    private Collection<Tournament> TournamentList;

    public Tournament_Controller(Collection<Tournament> TournamentList) {
        this.TournamentList = TournamentList;
    }

    public boolean tournamentAdd(Player player,Tournament tournament)
    {
        if(this.TournamentList.contains(tournament))
        {
            this.TournamentList.add(tournament);
            return true;
        }
        return false;
    }

    public void tournamentCreate(LocalDate begin,LocalDate end,String name,String league,String sport)
    {
       Tournament tournament = new Tournament(begin, end, name,league, sport, new ArrayList<Team>());
        if(!this.TournamentList.contains(tournament))
        {
            this.TournamentList.add(tournament);
        }
    }

    public boolean tournamentDelete(String tournament_name)
    {
        for(Tournament tournament: this.TournamentList)
        {
            if(tournament.getName().equals(tournament_name))
            {
                this.TournamentList.remove(tournament);
                return true;
            }
        }
        return false;
    }

    public boolean tournamentRemove(String tournament_name,Player player,boolean deleteTeam)
    {

        for(Tournament tournament: this.TournamentList)
        {
            if(tournament.getName().equals(tournament_name))
            {
                Collection<Team> Team = tournament.getParticipants();

                for(Team team: Team)
                {
                    if(team.getLineup().contains(player))
                    {
                        if(deleteTeam)
                        {
                            Team.remove(team);
                            tournament.setParticipants(Team);
                            tournamentMatchmaking(tournament_name,"-m");//afecta al matchmaking
                            return true;
                        }
                        else
                        {
                            team.getLineup().remove(player);
                            tournament.setParticipants(Team);
                            tournamentMatchmaking(tournament_name,"-m");//afecta al matchmaking
                            return true;
                        }
                    }
                } 
            }
        }
        return false;
    }
    public boolean tournamentMatchmaking(String tournament_name,String mode)
    {
            for (Tournament tournament : this.TournamentList) {

                if (tournament.getName().equals(tournament_name) && isInProgress(tournament)) {
                    Collection<Team> teams = tournament.getParticipants();
                    switch (mode) {
                        case "-m":
                            manualMatchmaking(teams);//hacerlos boolean para que devuelvan cosas
                            break;

                        case "-a":
                            automaticMatchmaking(teams);
                            break;
                    
                        default:
                            System.out.println("\n Modo de matchmaking no válido. \n");
                            return false;
                    }
                }
            }
            return false;
    }

    private boolean manualMatchmaking(Collection<Team> teams) 
    {
            // Implement manual matchmaking logic here
            return false;//modify
    }

    private boolean automaticMatchmaking(Collection<Team> teams) 
    {
        ArrayList<Team> teamList = new ArrayList<>(teams);
        Collections.shuffle(teamList);
        // Implement automatic matchmaking logic here

        
        return false;//modify
    }

    public void tournament_list()
    {
        //LIST WITH PROPERTIES??
    }

    public boolean isInProgress(Tournament tournament)
    {
        //FINISH TO CODE
        return false;
    }
}
