package com.codouk.pointcoachingv2.entities;

import java.io.Serializable;
import java.util.Date;

public class Point implements Serializable {
    private Long codePoint;
    private Date datePoint;
    private double poidsPerdus;
    private int semaine;

    private Boolean routineAlimentaire;
    private Boolean mindfulEating;
    private Boolean mindfulEatingAffecte;

    private Boolean hydratation;
    private Boolean hydratationAffecte;

    private Boolean sport;
    private Boolean sportAffecte;

    private Boolean stress;
    private Boolean stressAffecte;

    private Boolean sommeil;
    private Boolean sommeilAffecte;

    private Boolean infosSupplementaire;

    private Coach coach;
    private Client client;
    private Formule formule;

    public Point() {
        super();
    }

    public Point(Date datePoint, double poidsPerdus, int semaine, Boolean routineAlimentaire, Boolean mindfulEating, Boolean hydratation, Boolean sport, Boolean stress, Boolean sommeil, Boolean infosSupplementaire, Coach coach, Client client, Formule formule) {
        super();
        this.datePoint = datePoint;
        this.poidsPerdus = poidsPerdus;
        this.semaine = semaine;
        this.routineAlimentaire = routineAlimentaire;
        this.mindfulEating = mindfulEating;
        this.hydratation = hydratation;
        this.sport = sport;
        this.stress = stress;
        this.sommeil = sommeil;
        this.infosSupplementaire = infosSupplementaire;
        this.coach = coach;
        this.client = client;
        this.formule = formule;
    }

    public Long getCodePoint() {        return codePoint;    }

    public void setCodePoint(Long codePoint) {        this.codePoint = codePoint;    }

    public Date getDatePoint() {        return datePoint;    }

    public void setDatePoint(Date datePoint) {        this.datePoint = datePoint;    }

    public double getPoidsPerdus() {        return poidsPerdus;    }

    public void setPoidsPerdus(double poidsPerdus) {        this.poidsPerdus = poidsPerdus;    }

    public int getSemaine() {        return semaine;    }

    public void setSemaine(int semaine) {        this.semaine = semaine;    }

    public Boolean getRoutineAlimentaire() {        return routineAlimentaire;    }

    public void setRoutineAlimentaire(Boolean routineAlimentaire) {
        this.routineAlimentaire = routineAlimentaire;
    }

    public Boolean getMindfulEating() {        return mindfulEating;    }

    public void setMindfulEating(Boolean mindfulEating) {        this.mindfulEating = mindfulEating;    }

    public Boolean getMindfulEatingAffecte() {        return mindfulEatingAffecte;    }

    public void setMindfulEatingAffecte(Boolean mindfulEatingAffecte) {
        this.mindfulEatingAffecte = mindfulEatingAffecte;
    }

    public Boolean getHydratation() {        return hydratation;    }

    public void setHydratation(Boolean hydratation) {        this.hydratation = hydratation;    }

    public Boolean getHydratationAffecte() {        return hydratationAffecte;    }

    public void setHydratationAffecte(Boolean hydratationAffecte) {
        this.hydratationAffecte = hydratationAffecte;
    }

    public Boolean getSport() {        return sport;    }

    public void setSport(Boolean sport) {        this.sport = sport;    }

    public Boolean getSportAffecte() {        return sportAffecte;    }

    public void setSportAffecte(Boolean sportAffecte) {        this.sportAffecte = sportAffecte;    }

    public Boolean getStress() {        return stress;    }

    public void setStress(Boolean stress) {        this.stress = stress;    }

    public Boolean getStressAffecte() {        return stressAffecte;    }

    public void setStressAffecte(Boolean stressAffecte) {        this.stressAffecte = stressAffecte;    }

    public Boolean getSommeil() {
        return sommeil;
    }

    public void setSommeil(Boolean sommeil) {        this.sommeil = sommeil;    }

    public Boolean getSommeilAffecte() {        return sommeilAffecte;    }

    public void setSommeilAffecte(Boolean sommeilAffecte) {        this.sommeilAffecte = sommeilAffecte;    }

    public Boolean getInfosSupplementaire() {        return infosSupplementaire;    }

    public void setInfosSupplementaire(Boolean infosSupplementaire) {
        this.infosSupplementaire = infosSupplementaire;
    }

    public Coach getCoach() {        return coach;    }

    public void setCoach(Coach coach) {        this.coach = coach;    }

    public Client getClient() {        return client;    }

    public void setClient(Client client) {        this.client = client;    }

    public Formule getFormule() {        return formule;    }

    public void setFormule(Formule formule) {        this.formule = formule;    }
}
