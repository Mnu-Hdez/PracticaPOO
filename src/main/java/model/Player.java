package model;

public class Player extends User {

    private double score;
    private String full_name;
    private String dni;
    //hashmap o hashset para unir inequivocamente a los jugadores
    //con su debida puntuacion en cada categoria
    //sino lista normal

    // revisar los atributos y los constructores super()
    public Player(double score, String dni, String full_name) {
        this.dni = dni;
        this.full_name = full_name;
        this.score = score;
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

    @Override
    public String toString() {
        return full_name + ", " + score + " puntos";
    }

}
