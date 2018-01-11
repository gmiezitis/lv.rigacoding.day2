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
public class LvCodingrigaDay2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kvadrats kv1 = new kvadrats();
        kv1.setKrasa("melns");
        kv1.setMalasgarums(50);
        System.out.println("Kvadrata laukums ir " + kv1.laukums());
        
        aplis a1 = new aplis();
        a1.setKrasa("zils");
        a1.setRadiuss(5);
        System.out.println("Apļa radiuss ir " + a1.laukums());
        
        aplis a2 = new aplis();
        a1.setKrasa("zils");
        a1.setRadiuss(5);
        System.out.println("Apļa perimetrs ir " + a1.perimetrs());
        
    }
    
}
