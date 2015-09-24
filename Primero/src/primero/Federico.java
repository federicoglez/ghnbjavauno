/*
 * Herencia, interfaces, 
 */
package primero;



/**
 *
 * @author federico
 */


/**
 * 
 * Este enum ¿es público por defecto, es decir accesible desde otras partes del paquete?
 * Otra cosa para investigar: los valores que toma cada elemento del enum se pueden modificar?
 * En otro lenguaje el primer elemento es 0, y los demás toman valores enteros crecientes.
 */
enum modosImpresion{
    BLANCO_Y_NEGRO,
    ESCALA_DE_GRISES,
    COLOR    
}

/**
 * 
 * Las interfaces se emplean en cierto modo como una especie de molde al que debe ajustarse
 * las clases que las implementen. En este caso, la interface iImpresora será implementada
 * por las clases ImpresoraEnRed e ImpresoraLocal, obligando a ambas a implementar aquello
 * que se define en iImpresora. Se puede ver que la clase ImpresoraLocal se ciñe al modelo
 * de la interfaz, mientras que ImpresoraEnRed cuenta con algo más. Lo que está claro es que
 * ambas clases, al menos, implementan TODO lo que se define en iImpresora.
 */

interface iImpresora{
    void seleccionarImpresora(String s);
    void definirColores(modosImpresion modo);
    boolean imprimir(String s);
}
/**
 * Implementa iImpresora añadiendo algo de material para poder construir
 * automáticamente una cadena de conexión a la URI de la impresora de red.
 * Sólo es un ejemplo, sin uso práctico. Parece ser que para este cometido
 * la biblioteca estándar de java trae la funcionalidad apropiada. Véase
 * quizá PrintService.
 */
class ImpresoraEnRed implements iImpresora{
    //Sitúo aquí, para hacerlo más claro el material extra
    //que no está definido en iImpresora
    //----------------------------------------------------
    String ip;
    
    public void IP(String s){
        this.ip=s;
    }    
    //----------------------------------------------------
    
    String cual;
    modosImpresion modo;
    
    //Las anotaciones @Override indican que se trata de una función definida en una interface
    //En algún sitio he visto que se reclama por una anotación específica @Implements que no
    //existe en java, pero que ayudaría a distinguir cuando realmente se está "overriding"
    //y cuando "implementing".
    @Override 
    public void seleccionarImpresora(String s){
        this.cual=s;
    }

    @Override
    public void definirColores(modosImpresion modo) {
        //throw new UnsupportedOperationException("Not supported yet.");
        this.modo=modo;        
    }

    @Override
    public boolean imprimir(String s) {
        String str_conexion="ipp://"+this.ip+":631/printers/"+this.cual;
        return true;
    }
    
}

class ImpresoraLocal implements iImpresora{
    String cual;
    modosImpresion modo;

    @Override
    public void seleccionarImpresora(String s){
        this.cual=s;
    }

    @Override
    public void definirColores(modosImpresion modo) {
        //throw new UnsupportedOperationException("Not supported yet.");
        this.modo=modo;        
    }

    @Override
    public boolean imprimir(String s) {
        return true;
    }    
}

/**
 * 
 * 
 */
public class Federico {
    

    public Federico(){
        System.out.println(this.getClass().getSimpleName());
//Probando interface,implements
        String s_impresora;
        s_impresora="Común de contabilidad";
        String texto_a_imprimir="Hola";
        ImpresoraEnRed pLan;
        ImpresoraLocal pLocal;
        
        switch(s_impresora){
            case "HP Desject Secretaría":
                pLan=new ImpresoraEnRed();
                pLan.cual="HPDeskJet800";
                pLan.ip="192.168.2.130";
                pLan.modo=modosImpresion.ESCALA_DE_GRISES;
                if (!pLan.imprimir(texto_a_imprimir))
                    System.out.println("Falló la impresión");               
                break;
            case "Común de contabilidad":
                pLan=new ImpresoraEnRed();
                pLan.cual="BrotherK1000";
                pLan.ip="192.168.2.167";
                pLan.modo=modosImpresion.BLANCO_Y_NEGRO;
                if (!pLan.imprimir(texto_a_imprimir))
                    System.out.println("Falló la impresión");                               
                break;
            case "Láser Canon T9":
                pLocal=new ImpresoraLocal();
                pLocal.cual="CanonT9";
                pLocal.modo=modosImpresion.COLOR;
                if (!pLocal.imprimir(texto_a_imprimir))
                    System.out.println("Falló la impresión");                               
                break;
            default:
                System.out.println("Impresora no definida");                               
        }
//Probando herencia,extends
        FedericoExtra fedex=new FedericoExtra(12,40);
        fedex.nombreDelPlaneta("Paco");
        fedex.distanciaMediaAlSol(891004);
        fedex.Info();        
    }

}


class FedericoExtra extends Planeta {
    public FedericoExtra(int radio,long masa){
        this.radio=radio;
        this.masa=masa;
        
    }
    public void Info(){
        String s;
        s="Planeta: " + this.nombre_del_planeta + "\n"; //Si se va a ejecutar en windows, \r\n
        s+="Masa: "+this.masa + "\n";
        s+="Radio: "+this.radio + "\n";
        s+="Volumen: "+this.volumen() + "\n";
        s+="Distancia media al Sol: "+this.distancia_media_al_sol;
        System.out.println(s);
    }
}


class Planeta extends ObjetoSolar{
    long distancia_media_al_sol;
    String nombre_del_planeta;
    void distanciaMediaAlSol(long d){
        this.distancia_media_al_sol=d;
    }
    void nombreDelPlaneta(String s){
        this.nombre_del_planeta=s;
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