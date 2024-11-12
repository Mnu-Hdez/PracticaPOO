package model;

public interface IUser<T extends User> {
    boolean login(String mail,String password,T activeUser);
    void logout(T activeUser);
    void tournament_list();

}
