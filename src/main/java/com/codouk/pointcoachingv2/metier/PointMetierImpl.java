package com.codouk.pointcoachingv2.metier;

import com.codouk.pointcoachingv2.dao.ClientRepository;
import com.codouk.pointcoachingv2.entities.Client;
import com.codouk.pointcoachingv2.entities.Coach;
import com.codouk.pointcoachingv2.entities.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PointMetierImpl implements IPointMetier{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client consulterClient(String prenomClient) {
        Client cl = clientRepository.consulterClientDao(prenomClient);
        if(cl == null) throw new RuntimeException("Client introuvable");
        return cl;
    }

    @Override
    public Point consulterPoint(Long codePoint) {
        return null;
    }

    @Override
    public Coach consulterCoach(String nomCoach) {
        return null;
    }

    @Override
    public Client findClientByCodeClient(Long codeClient) {
        return null;
    }

    @Override
    public List<Client> listClientByCoach(String codeCoach) {
        return null;
    }

    @Override
    public List<Client> listClientByForm(Long codeFormule) {
        return null;
    }

    @Override
    public List<Point> listPoint(String nomCoach) {
        return null;
    }

    @Override
    public List<Client> findClFormByCoach(Long codeFormule, String codeCoach) {
        return null;
    }
}
