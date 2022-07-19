package com.codouk.pointcoachingv2.entities;

import java.io.Serializable;
import java.util.Collection;

public class Coach implements Serializable {
    private String codeCoach;    private String nomCoach;
    private Collection<Client> clients;    private Collection<Point> points;

    public Coach() {
        super();
    }

    public Coach(String codeCoach) {
        super();
        this.codeCoach = codeCoach;
    }

    public Coach(String codeCoach, String nomCoach) {
        super();
        this.codeCoach = codeCoach;        this.nomCoach = nomCoach;
    }

    public String getCodeCoach() {        return codeCoach;    }

    public void setCodeCoach(String codeCoach) {        this.codeCoach = codeCoach;    }

    public String getNomCoach() {        return nomCoach;    }

    public void setNomCoach(String nomCoach) {        this.nomCoach = nomCoach;    }

    public Collection<Client> getClients() {        return clients;    }

    public void setClients(Collection<Client> clients) {        this.clients = clients;    }

    public Collection<Point> getPoints() {        return points;    }

    public void setPoints(Collection<Point> points) {        this.points = points;    }
}
