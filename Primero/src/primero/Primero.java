package primero;

public class Primero {

    public static void main(String[] args) {
        separador("Federico");
        Federico federico=new Federico();
        separador("Atlántico");
        Atlantico atlantico=new Atlantico();
    }
    
    private static void separador(String autor){
        String c="*";
        int cuantos=60;
        String s=c;
        while(s.length()<cuantos) s+="*";
        System.out.println(s+" "+autor);
    }
    
}
