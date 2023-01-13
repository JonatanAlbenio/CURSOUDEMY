import java.util.Calendar;
import java.util.Date;

public class EjemploUtilCalendar {

    public static void main(String[] args) {


        Calendar calendar= Calendar.getInstance();


        calendar.set(2022, calendar.APRIL,3,19,2,3);
        Date fecha = calendar.getTime();

        System.out.println("fecha = " + fecha) ;














    }
}
