package model;

import java.util.Date;

public class Tournament {
    private Date inicio;
    private Date fin;
    private String league;
    private String sport;

    
    public Tournament(Date inicio, Date fin, String league, String sport) {
        this.inicio = inicio;
        this.fin = fin;
        this.league = league;
        this.sport = sport;
    }

    public Tournament(String league, String sport)
    {
        this.league = league;
        this.sport = sport; 
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

}
