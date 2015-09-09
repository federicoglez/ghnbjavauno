package primero;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Atlantico {
    public Atlantico(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date fecha = new Date();
        System.out.println(dateFormat.format(fecha));
        System.out.println(this.getClass().getSimpleName());        
    }
}
