package com.codouk.pointcoachingv2.metier;

import com.codouk.pointcoachingv2.entities.Client;
import com.codouk.pointcoachingv2.entities.Coach;
import com.codouk.pointcoachingv2.entities.Point;

import java.util.List;

public interface IPointMetier {
    public Client consulterClient(String prenomClient);
    public Point consulterPoint(Long codePoint);
    public Coach consulterCoach(String nomCoach);

    public Client findClientByCodeClient(Long codeClient);

    public List<Client>listClientByCoach(String codeCoach);
    public List<Client> listClientByForm(Long codeFormule);

    public List<Point> listPoint(String nomCoach);

    public List<Client>findClFormByCoach(Long codeFormule, String codeCoach);
}
