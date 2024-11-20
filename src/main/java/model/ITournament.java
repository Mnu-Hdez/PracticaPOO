package model;

import java.time.LocalDate;

public interface ITournament {
    public void tournament_list();
    public boolean tournamentAdd(Player player,Tournament tournament);
    public void tournamentCreate(LocalDate begin,LocalDate end,String name,String league,String sport);
    public void tournamentDelete(String tournament_name);
    public boolean tournamentRemove(String tournament_name,Player player,boolean deleteTeam);
    public boolean tournamentMatchmaking(String tournament_name,String mode);
}
