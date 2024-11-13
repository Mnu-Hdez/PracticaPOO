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
        //previamente tenemos q revisar 
        //q el jugador exista en la clase app con el controlador
        
        }

        //inscribe a un jugador
        return false;
    }

    public void tournamentCreate(LocalDate begin,LocalDate end,String name,String sport)
    {
       Tournament tournament = new Tournament(begin, end, name, sport, new ArrayList<Team>());
        if(!this.TournamentList.contains(tournament))
        {
            this.TournamentList.add(tournament);
        }
    }

    public boolean tournamentDelete()
    {
        //fix
        return false;
    }

    public boolean tournamentMatchmaking()
    {
        //fix
        return false;
    }

}
