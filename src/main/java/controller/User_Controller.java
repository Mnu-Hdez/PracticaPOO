package controller;

import model.IUser;
import model.User;
import java.util.Collection;
public class User_Controller<T extends User> implements IUser<T> {

    protected Collection<T> UserList;

    public boolean login(String mail,String password,T activeUser)
    {
        for(T user:UserList)
        {
            if(user.getMail().equals(mail) && user.getPassword().equals(password))
            {
                activeUser = user;
                return true;
            }
        }
        return false;
    }


    public void logout(T activeUser)
    {
        activeUser = null;
    }

    public void tournament_list()
    {
        
    }
}
