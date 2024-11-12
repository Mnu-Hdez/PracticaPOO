package model;

public interface IUser<T extends User> {
    T login(String mail,String password);
    void tournament_list();

}
