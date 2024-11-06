package model;

public interface IUser {
    boolean login(String mail,String password,User activeUser);
    void logout(User activeUser);
    void tournament_list();

}
