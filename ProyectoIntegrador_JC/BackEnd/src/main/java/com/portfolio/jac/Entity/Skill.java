package com.portfolio.jac.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String img;
    private String progreso;

    public Skill() {
    }

    public Skill(String img, String progreso) {
        this.img = img;
        this.progreso = progreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getProgreso() {
        return progreso;
    }

    public void setProgreso(String progreso) {
        this.progreso = progreso;
    }

    

    
}
