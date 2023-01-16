import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Tarea11CalcularEdad {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        Calendar fechaNacimiento = Calendar.getInstance();
        Calendar fechaActual = Calendar.getInstance();


        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(" Escribe tu fecha de nacimiento " );

        try {
            Date fecha =format.parse(scanner.next());

            fechaNacimiento.setTime(fecha);

            int ano = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
            int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
            int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);


            System.out.println(" Edad " + ano );




        } catch (ParseException e) {
            throw new RuntimeException(e);
        }



        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fechaNacimiento1 = df.parse(fechaStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Date actual = new Date();

        // creamos un patron de fecha numérico con el año mes y día
        df = new SimpleDateFormat("yyyyMMdd");

        // luego convertimos ambas fechas la actual y la fecha de nacimiento
        // en enteros que contiene el año mes y día
        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));

        // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
        // dejar la fecha en decenas o centenas
        int edad = (hasta - desde) / 10000;
        System.out.println("La edad es: " + edad);
    }



}
