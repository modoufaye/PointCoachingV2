package com.codouk.pointcoachingv2.dao;

import com.codouk.pointcoachingv2.entities.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CoachRepository extends JpaRepository<Coach, String> {
    @Query("Select c from Coach c where lower(c.nomCoach) =: x")
    public Coach consulterCoach(@Param("x") String codeCoach);
}
