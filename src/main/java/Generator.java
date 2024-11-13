import controller.*;
import model.*;
import java.time.LocalDate;
import java.util.ArrayList;
public class Generator 
{
    private Player_Controller playerCont;
    private Admin_Controller adminCont;
    private Tournament_Controller tournamentCont;
    private Team_Controller teamCont;
    
    public Generator(Player_Controller playerCont,Admin_Controller adminCont,Tournament_Controller tournamentCont,Team_Controller teamCont)
    {
        this.playerCont = playerCont;
        this.adminCont = adminCont;
        this.tournamentCont = tournamentCont;
        this.teamCont = teamCont;
    }

    public void populate()
    {
        // Example data for admins
        Admin alga = adminCont.createAdmin( "algaPocha@admin.com", "password123");
        Admin bob =  adminCont.createAdmin("bob@admin.com", "password456");
        Admin juan = adminCont.createAdmin("juan@admin.com", "juan");

        // Example data for players
        Player maria = new Player("maria@alumnos.upm.es", "password321", "87654321J", "Maria Lopez", juan);
        playerCont.addPlayer(maria);
        Player john = new Player("john@alumnos.upm.es", "password789", "98765432H", "John Doe", bob);
        playerCont.addPlayer(john);
        Player ali = new Player("alice@alumnos.upm.es", "password2324","12345673G","Alicia Fuente", alga);
        playerCont.addPlayer(ali);


         



        tournamentCont.tournamentCreate(LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 5), "Champions League", "Football");
        tournamentCont.tournamentCreate(LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 10), "Wimbledon", "Tennis");
        tournamentCont.tournamentCreate(LocalDate.of(2024, 3, 15), LocalDate.of(2024, 3, 25), "March Madness", "Basketball");
        tournamentCont.tournamentCreate(LocalDate.of(2025, 7, 20), LocalDate.of(2025, 8, 5), "Tour de France", "Cycling");
        tournamentCont.tournamentCreate(LocalDate.of(2023, 9, 10), LocalDate.of(2023, 9, 20), "US Open", "Tennis");


        // Example data for teams
        Team team1 = new Team( "GolfosBurgo", alga,new ArrayList<Player>());
        Team team2 = new Team("Nutrias nalgonas", bob, new ArrayList<Player>());
        Team team3 = new Team("Albacete fc", juan, new ArrayList<Player>());

        /* 
        teamCont.addTeam(team1);
        teamCont.addTeam(team2);
        teamCont.addTeam(team3);
        /*
        
        tournamentCont.addTournament(tournament4);
        tournamentCont.addTournament(tournament5);
        tournamentCont.addTournament(tournament6);
        tournamentCont.addTournament(tournament7);
        tournamentCont.addTournament(tournament8);

        
        // Example data for tournaments

       
        tournamentCont.addTournament(tournament1);
        tournamentCont.addTournament(tournament2);

        // Example data for teams

        Team team1 = new Team("Team A", "City A", "Coach A");
        Team team2 = new Team("Team B", "City B", "Coach B");
        teamCont.addTeam(team1);
        teamCont.addTeam(team2);

        */
    }
}
