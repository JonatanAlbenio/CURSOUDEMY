import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha =new Date();


        System.out.println("fecha = " + fecha);


        SimpleDateFormat df = new SimpleDateFormat(" EEEE dd-MM-yyyy HH:mm:ss:zz");
        
        String fechaStr = df.format(fecha);


        System.out.println("fechaStr = " + fechaStr);


        Date fecha2 = new Date();



        long j =0;

        for (int i=0; i<1000000000;i++){

            j+=i;


        }

        Long tiempoFinal = fecha2.getTime()-fecha.getTime();

        System.out.println("j = " + j);
        System.out.println("tiempoFinal = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);










    }
}
