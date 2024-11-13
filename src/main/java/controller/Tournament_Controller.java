package controller;
import model.Player;
import model.Tournament;
import model.Team;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

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

    public boolean tournamentDelete(String league_name)
    {
        
        return false;
    }

    public boolean tournamentMatchmaking()
    {
        //fix
        return false;
    }

}
