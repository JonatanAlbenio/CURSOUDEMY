import java.util.Calendar;
import java.util.Date;

public class EjemploUtilCalendar {

    public static void main(String[] args) {


        Calendar calendar= Calendar.getInstance();


        calendar.set(2022, calendar.APRIL,3,19,2,3);
        calendar.set(Calendar.MONTH,Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH,25);

        calendar.set(Calendar.HOUR_OF_DAY,21);

        Date fecha = calendar.getTime();


        System.out.println("fecha = " + fecha) ;














    }
}
