package com.codouk.pointcoachingv2.dao;

import com.codouk.pointcoachingv2.entities.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PointRepository extends JpaRepository<Point, Long> {

    @Query("select p from Point p where p.codePoint =: x")
    public Point consulterPointByCodePointDao(@Param("x") Long codePoint);

    @Query("select p from Point p where lower(p.coach.nomCoach) =:x")
    public List<Point> listPointDao(@Param("x") String nomCoach);
}
