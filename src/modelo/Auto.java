/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alumnos
 */
public class Auto {
    
    
    private String color =null; 
    private Integer NumeroPuertas = null;
    private Integer NumeroRuedas = 4;

    public String getColor() {
        return color;
    }

    public Integer getNumeroPuertas() {
        return NumeroPuertas;
    }

    public Integer getNumeroRuedas() {
        return NumeroRuedas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumeroPuertas(Integer NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }

    public void setNumeroRuedas(Integer NumeroRuedas) {
        this.NumeroRuedas = NumeroRuedas;
    }

    Auto autommovil = new Auto();
    
    
}
