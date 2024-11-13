package controller;
import model.Player;
import model.Tournament;
import java.util.Collection;

public class Tournament_Controller {

    private Collection<Tournament> TournamentList;

    public Tournament_Controller(Collection<Tournament> TournamentList) {
        this.TournamentList = TournamentList;
    }

    public boolean tournamentAdd(Player player,Tournament tournament)
    {
        if(this.TournamentList.contains(tournament))
        {//previamente tenemos q revisar 
        //q el jugador exista en la clase app con el controlador

        }

        //inscribe a un jugador
        return false;
    }

    public void tournamentCreate()
    {

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
