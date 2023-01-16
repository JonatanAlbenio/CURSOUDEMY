import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);



        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(" Ingrese una fecha  ");
        try {
            Date fecha =format.parse(s.next());
            System.out.println("fecha = " + fecha);

            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fecha2 =new Date();

            if (fecha.after(fecha2)){
                System.out.println(" Fecha del usuario es después que fecha 2 ");
            } else if (fecha.before(fecha2)) {
                System.out.println(" Fecha es anterior que fecha 2");

            } else if (fecha.equals(fecha2)) {
                System.out.println("Igual perrito ");
            }


            if(fecha.compareTo(fecha2)>0){

                System.out.println(" Fecha del usuario es después que fecha 2 (actual) ");
            } else if (fecha.compareTo(fecha2)<0) {

                System.out.println(" Fecha es anterior que fecha 2 (actual)");

            } else if (fecha.compareTo(fecha2)==0) {

                System.out.println("Igual perrito ");

            }


        } catch (ParseException e) {
            System.out.println(" errorrrrrrr " +e);
            main(args);

        }


    }
}
