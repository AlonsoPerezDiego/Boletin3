/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg3.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author dalonsoperez
 */
public class Boletín31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Consumo centralita1 = new Consumo();
        
        centralita1.setKm(Float.parseFloat(JOptionPane.showInputDialog("Los kilometros recorridos son:")));
        centralita1.setT(Float.parseFloat(JOptionPane.showInputDialog("Las horas de viaje son:")), Float.parseFloat(JOptionPane.showInputDialog("Los minutos de viaje son:")), Float.parseFloat(JOptionPane.showInputDialog("Los segundos de viaje son:")));
        centralita1.setpGas((float)1.57);
        centralita1.setLitros(50);
        centralita1.setlTotales(55);
        centralita1.setCons();
        centralita1.setvMed();
        centralita1.mostrar();
        
        Consumo centralita2 = new Consumo();
        
        
        centralita2.setKm(Float.parseFloat(JOptionPane.showInputDialog("Los kilometros recorridos son:")));
        centralita2.setT(Float.parseFloat(JOptionPane.showInputDialog("Las horas de viaje son:")), Float.parseFloat(JOptionPane.showInputDialog("Los minutos de viaje son:")), Float.parseFloat(JOptionPane.showInputDialog("Los segundos de viaje son:")));
        centralita2.setpGas((float)1.49);
        centralita2.setLitros(49);
        centralita2.setlTotales(65);
        centralita2.setCons();
        centralita2.setvMed();
        centralita2.mostrar();
        
    }
    

        
        
    
}
