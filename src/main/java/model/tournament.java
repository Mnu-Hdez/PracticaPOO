package model;

import java.time.LocalDate;
import java.util.Collection;

public class Tournament {
    private LocalDate inicio;
    private LocalDate fin;
    private String league;
    private String sport;
    private Collection<Team> Participants;
    //si solo participa una persona sin equipo se creará un
    //nuevo equipo de una sola persona
    //otra opcion es crear 2 clases de torneo,
    //una individual y otro de colectivo
    
    public Tournament(LocalDate inicio, LocalDate fin, String league, String sport,Collection<Team> Participants) {
        this.inicio = inicio;
        this.fin = fin;
        this.league = league;
        this.sport = sport;
        this.Participants = Participants;
    }

    public Tournament(String league, String sport)
    {
        this.league = league;
        this.sport = sport;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
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

    public Collection<Team> getParticipants() {
        return Participants;
    }

    
}
