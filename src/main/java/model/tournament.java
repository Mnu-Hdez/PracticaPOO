package model;

import java.time.LocalDate;
import java.util.Collection;

public class Tournament {
    
    private LocalDate begin;
    private LocalDate end;

    public void setParticipants(Collection<Team> participants) {
        Participants = participants;
    }

    private String name;
    private String league;
    private String sport;
    private Collection<Team> Participants;
    //si solo participa una persona sin equipo se creará un
    //nuevo equipo de una sola persona
    //otra opcion es crear 2 clases de torneo,
    //una individual y otro de colectivo
    
    public Tournament(LocalDate begin, LocalDate end,String name,String league, String sport,Collection<Team> Participants) {
        this.begin = begin;
        this.end = end;
        this.league = league;
        this.name = name;
        this.sport = sport;
        this.Participants = Participants;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate inicio) {
        this.begin = inicio;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate fin) {
        this.end = fin;
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
