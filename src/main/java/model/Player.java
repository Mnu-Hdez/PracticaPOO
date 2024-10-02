package model;
public class Player
{
    private String name;
    private float score;

    public Player(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    
    @Override
    public String toString()
    {
        return name +", "+ score + " puntos";
    }
    
}
