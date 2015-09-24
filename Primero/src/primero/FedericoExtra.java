/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primero;

/**
 *
 * @author federico
 */
public class FedericoExtra extends Planeta {
    public FedericoExtra(int radio,long masa){
        this.radio=radio;
        this.masa=masa;
    }
    void Info(){
        String s;
        s="Planeta: " + this.n + "\n"; //Si se va a ejecutar en windows, \r\n
        s+="Masa: "+this.masa + "\n";
        s+="Radio: "+this.radio + "\n";
        s+="Volumen: "+this.volumen() + "\n";
        s+="Distancia media al Sol: "+this.distancia_media_al_sol;
        System.out.println(s);
    }
}


class Planeta extends ObjetoSolar{
    long distancia_media_al_sol;
    String n;
    void distanciaMediaAlSol(long d){
        this.distancia_media_al_sol=d;
    }
    void nombre(String s){
        this.n=s;
    }    
    
}

class ObjetoSolar{
    int radio;
    long masa;
    private static final double pi=3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117;
    public void ObjetoSolar(int radio,long masa){
        this.radio=radio;
        this.masa=masa;
    }
    double volumen(){
        return 1.3333333333333333333333*pi*this.potencia(this.radio,3);
    }
    
    private double potencia(int base,int exponente){
        long r=base;
        for (int t=1;t<=exponente;r*=base,t++);
        return r;
    }
}
