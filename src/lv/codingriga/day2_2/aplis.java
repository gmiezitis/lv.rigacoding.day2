/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.codingriga.day2_2;

/**
 *
 * @author oscar
 */
public class aplis implements Geometriskafigura {
    private double radiuss;
    private String krasa;

    @Override
    public double laukums() {
       return radiuss * 3.14 * radiuss;
    }

    @Override
    public String krasa() {
        return krasa;
    }

    @Override
    public double perimetrs() {
        return 2*3.14*this.radiuss;
         
    }

    public double getRadiuss() {
        return radiuss;
    }

    public void setRadiuss(double radiuss) {
        this.radiuss = radiuss;
    }

    public String getKrasa() {
        return krasa;
    }

    public void setKrasa(String krasa) {
        this.krasa = krasa;
    }
    
    
    
}
