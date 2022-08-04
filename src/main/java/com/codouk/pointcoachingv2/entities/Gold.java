package com.codouk.pointcoachingv2.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("GOL")
public class Gold extends Formule{
    final int nbRdv = 7;

    public Gold() {
        super();
    }

}
