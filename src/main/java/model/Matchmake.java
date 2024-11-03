package model;

public class Matchmake
{
    private Player playerA;
    private Player playerB;

    public Matchmake(Player playerA,Player playerB)
    {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    @Override
    public String toString()
    {
        return (this.playerA.getFull_name() + " vs " + this.playerB.getFull_name());
    }
    
}