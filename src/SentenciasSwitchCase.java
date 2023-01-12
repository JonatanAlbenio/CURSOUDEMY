import java.util.Scanner;

public class SentenciasSwitchCase {
    public static void main(String[] args) {


        int num=3;
        switch (num){

            case 0:
                System.out.println(" el legendario" );
                break;
            case 1:
                System.out.println(" master ");
                break;

            case 3:

                System.out.println("SIN PALABRAS " );

                break;
            default:
                System.out.println(" NO EXISTE MI PERRO OJO MANITO " );

        }
        String nombre ="Andres";

        switch (nombre){

            case "Admin":
                System.out.println("crakc");

                break;
            case "Leguen":

                    System.out.println("yo te conoci");
                    break;
            case "Andres":
                System.out.println(" Mono" );
                break;
            default:
                System.out.println(" No perro no existe ");
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el numero del mes 1-12 ffff" );
        int mes =scanner.nextInt();
        String nombreMes=null;

        switch (mes){
            case 1:
                nombreMes="enero";
                break;

            case 2:
                nombreMes="febrero";
                break;

            case 3:
                nombreMes="Marzo";
                break;

            case 4:
                nombreMes="Abril";
                break;

            case 5:
                nombreMes="Mayo";
                break;

            case 6:
                nombreMes="Junio";
                break;
            case 7:
                nombreMes="Julio";
                break;

            case 8:
                nombreMes="Agosto";
                break;

            case 9:
                nombreMes="Septiembre";
                break;
            default:
                System.out.println(" Se equivoco rey" );
        }
        System.out.println("nombreMes = " + nombreMes);
    }
}
