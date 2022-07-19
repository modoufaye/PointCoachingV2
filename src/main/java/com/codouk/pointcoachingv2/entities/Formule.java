package com.codouk.pointcoachingv2.entities;

import java.io.Serializable;

public class Formule implements Serializable {
    private Long codeFormule;

    public Formule() {
        super();
    }
    public Long getCodeFormule() {
        return codeFormule;
    }

    public void setCodeFormule(Long codeFormule) {
        this.codeFormule = codeFormule;
    }
}
