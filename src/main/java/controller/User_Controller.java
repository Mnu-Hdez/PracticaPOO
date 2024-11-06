package controller;

import model.IUser;
import model.User;
import java.util.Collection;
public class User_Controller implements IUser
{
    protected Collection<User> UserList;


    public boolean login(String mail,String password,User activeUser)
    {
        for(User user:UserList)
        {
            if(user.getMail().equals(mail) && user.getPassword().equals(password))
            {
                activeUser = user;
                return true;
            }
        }
        return false;
    }


    public void logout(User activeUser)
    {
        activeUser = null;
    }

    public void tournament_list()
    {

    }
}
