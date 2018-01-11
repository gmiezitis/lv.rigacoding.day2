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
public class kvadrats implements Geometriskafigura {
private double malasgarums;
private String krasa;


    @Override
    public double laukums() {
       return malasgarums * malasgarums;
       
    }

    @Override
    public String krasa() {
        return this.krasa;
        
      
    }

    @Override
    public double perimetrs() {
        return malasgarums * 4;
     
    }

    public double getMalasgarums() {
        return malasgarums;
    }

    public void setMalasgarums(double malasgarums) {
        this.malasgarums = malasgarums;
    }

    public String getKrasa() {
        return krasa;
    }

    public void setKrasa(String krasa) {
        this.krasa = krasa;
    }
    
    
    
}
