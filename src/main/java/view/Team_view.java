package view;
import model.Team;
import model.Player;
public class Team_view {
    public void showTeam(Team team)
    {
        for(Player player: team.getLineup())
        {
            player.toString();
        }
    }
}
