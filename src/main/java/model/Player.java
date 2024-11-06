package model;

public class Player extends User{

    private double score;
    private String full_name;
    private String dni;
    private Admin admin;

    public Player( String mail,String password,double score, String dni, String full_name,Admin admin) 
    {
        super(mail,password);
        this.score = score;
        this.dni = dni;
        this.admin = admin;
        this.full_name = full_name;
    }

    public Player(String mail, String password, String dni, String full_name, Admin admin) 
    {
        super(mail, password);
        this.dni = dni;
        this.admin = admin;
        this.full_name = full_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public User getAdmin()
    {
        return this.admin;
    }
    @Override
    public String toString() {
        return full_name + ", " + score + " puntos";
    }

}
