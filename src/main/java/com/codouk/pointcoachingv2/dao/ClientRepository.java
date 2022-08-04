package com.codouk.pointcoachingv2.dao;

import com.codouk.pointcoachingv2.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("Select c from Client c where c.prenomClient =:x")
    public Client consulterClientDao(@Param("x") String prenomClient);
    @Query("Select c from Client c where c.codeClient =:x")
    public Client findClientByCodeClientDao(@Param("x") Long codeClient);

    @Query("Select c from Client c where c.coach.codeCoach =:x")
    public List<Client> listClientByCoachDao(@Param("x") String codeCoach);
    @Query("select c from Client c where c.formule.codeFormule =:x")
    public List<Client> listClientByFormuleDao(@Param("x") Long codeFormule);

    @Query("Select c from Client c where c.coach.codeCoach =:x  and c.formule.codeFormule =:y ")
    public List<Client> listClientFormuleByCoachDao(@Param("x") String codeCoach, @Param("y") Long codeFormule);

}
