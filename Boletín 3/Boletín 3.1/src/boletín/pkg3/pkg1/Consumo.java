
package boletín.pkg3.pkg1;

import javax.swing.JOptionPane;

public class Consumo {
    
    private float km, t, litros, vMed, pGas, cons, lTotales;
    
    public Consumo (){
        km = 0;
        t = 0;
        litros = 0;
        vMed = 0;
        pGas = 0;
        cons = 0;
        lTotales = 0;
    }
    
    public Consumo(float kilometros, float tiempo, float l, float media, float precio, float consumo, float lT){
        km = kilometros;
        t = tiempo;
        litros = l;
        vMed = media;
        pGas = precio;
        cons = consumo;
        lTotales = lT;
    }

    public float getKm() {
        return km;
    }
    
    public void setKm(float kilometros) {
        km = kilometros;
    }
    
    public float getT() {
        return t;
    }
    
    public void setT(float tiempoH, float tiempoM, float tiempoS) {
        t = tiempoH + tiempoM/60 + tiempoS/3600;
    }
        
    public float getLitros() {
        return litros;
    }

    public void setLitros(float l) {
       litros = l;        
    }

    public float getvMed() {
        return vMed;
    }

    public void setvMed() {
        vMed = km/t;
    }

    public float getpGas() {
        return pGas;
    }

    public void setpGas(float price) {
        pGas = price;
    }

    public float getlTotales() {
        return lTotales;
    }

    public void setlTotales(float lTot) {
        lTotales = lTot;
    }

    public float getCons() {
        return cons;
    }

    public void setCons() {
        cons = (lTotales - litros)/km;
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, km + "km " + vMed + "km/h medios " + litros + "l restantes " + cons + "l/km de consumo medio " + pGas + "€/l por la gasolina.");
    }

}
