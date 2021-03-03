package org.fundacionjala.prog101.DanielaSC.polimorfismo;

public class Figura {
    private String nombreFigura;
    private int area;
    private double perimetro;
    
    public Figura(String nombre) {
        this.nombreFigura = nombre;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }
    
    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
    
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

}
