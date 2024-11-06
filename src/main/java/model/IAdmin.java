package model;

public interface IAdmin
{
    boolean createPlayer(String mail,String password, String dni, String full_name,Admin admin);
    boolean deletePlayer(String mail);   

    boolean teamCreate();
    boolean teamDelete();
    boolean teamAdd();
    boolean teamRemove();
    
    boolean tournamentCreate();
    boolean tournamentDelete();
    boolean tournamentMatchmaking();
}
