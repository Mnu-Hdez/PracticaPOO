package controller;
import model.Admin;
import java.util.Collection;

public class Admin_Controller extends User_Controller<Admin>
{
    public Admin_Controller(){}
    
    public Admin_Controller(Collection<Admin> AdminList)
    {
        this.UserList = AdminList;
    }

    public Admin createAdmin(String mail,String password)
    {
        if(getAdmin(mail) == null)
        {
            UserList.add(new Admin(mail,password));
            return getAdmin(mail);
        }
        return null;
    }

    public void addAdmin(Admin admin)
    {
        if(getAdmin(admin.getMail()) == null)
        {
            UserList.add(admin);
        }
    }

    public Admin getAdmin(String mail)
    {
        for(Admin admin:UserList)
        {
            if(admin.getMail().equals(mail))
            {
                return admin;
            }
        }
        return null;
    }

    public Collection<Admin> getAdminList()
    {
        return UserList;
    }
}
