package controller;
import model.Admin;
import java.util.Collection;

public class Admin_Controller extends User_Controller
{
    private Collection<Admin> AdminList;

    public Admin_Controller(Collection<Admin> AdminList)
    {
        this.AdminList = AdminList;
    }

    public Collection<Admin> getAdminList()
    {
        return AdminList;
    }
}
