package com.portfolio.jac.Dto;

import javax.validation.constraints.NotBlank;


public class dtoSkill {
    @NotBlank
    private String img;
    @NotBlank
    private String progreso;

    public dtoSkill() {
    }

    public dtoSkill(String img, String progreso) {
        this.img = img;
        this.progreso = progreso;
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
