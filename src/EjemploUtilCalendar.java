import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploUtilCalendar {

    public static void main(String[] args) {


        Calendar calendar= Calendar.getInstance();


      //  calendar.set(2022, calendar.APRIL,3,19,2,3);
        calendar.set(Calendar.YEAR,2022);
        calendar.set(Calendar.MONTH,Calendar.JULY);
        calendar.set(Calendar.DAY_OF_MONTH,25);

        calendar.set(Calendar.HOUR,7);
        calendar.set(Calendar.AM_PM,Calendar.PM);
        calendar.set(Calendar.HOUR_OF_DAY,21);
        calendar.set(Calendar.MINUTE,20);
        calendar.set(Calendar.SECOND,10);
        calendar.set(Calendar.MILLISECOND,125);


        Date fecha = calendar.getTime();


        System.out.println("fecha = " + fecha) ;

        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");


        String fechaFormato = format.format(fecha);
        System.out.println("format = " + fechaFormato);



















    }
}
