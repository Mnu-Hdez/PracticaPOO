import controller.*;
import model.*;
public class Generator 
{
    private Player_Controller playerCont;
    private Admin_Controller adminCont;
    private Tournament_Controller tournamentCont;
    private Team_Controller teamCont;
    
    public Generator(Player_Controller pController)
    {
        this.playerCont = pController;
    }

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
         playerCont.createPlayer("maria@alumnos.upm.es", "password321", "87654321J", "Maria Lopez", juan);
         playerCont.createPlayer("john@alumnos.upm.es", "password789", "98765432H", "John Doe", bob);
         playerCont.createPlayer("alice@alumnos.upm.es", "password2324","12345673G","Alicia Fuente", alga);
         
        
        /*
        
        // Example data for tournaments

        Tournament tournament1 = new Tournament("Champions League", "2023-10-01", "Europe");
        Tournament tournament2 = new Tournament("Europa League", "2023-11-01", "Europe");
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
