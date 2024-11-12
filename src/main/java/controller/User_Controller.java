package controller;

import model.IUser;
import model.User;
import java.util.Collection;
public class User_Controller<T extends User> implements IUser<T> {

    protected Collection<T> UserList;

    public T login(String mail,String password)
    {
        for(T user:UserList)
        {
            if(user.getMail().equals(mail) && user.getPassword().equals(password))
            {
                return user;
            }
        }
        return null;
    }


    public void tournament_list()
    {
        
    }
}
