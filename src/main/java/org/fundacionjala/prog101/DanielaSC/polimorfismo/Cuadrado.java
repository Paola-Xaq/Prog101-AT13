package org.fundacionjala.prog101.DanielaSC.polimorfismo;

public class Cuadrado extends Figura{
    private int lado;
    
    public Cuadrado(int l){
        super("cuadrado");
        this.lado = l;
    }
    
    @Override
    public int getArea() {
        return this.lado * this.lado;
    }
    
    @Override
     public double getPerimetro() {
        return 4 * this.lado;
    }

}
