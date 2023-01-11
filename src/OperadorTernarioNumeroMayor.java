import java.util.Scanner;

public class OperadorTernarioNumeroMayor {

    public static void main(String[] args) {

        int max =0;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese un dato " );
        int numero=scanner.nextInt();


        System.out.println("Ingrese un dato 1 " );
        int numero2=scanner.nextInt();


        System.out.println("Ingrese un dato 2 " );
        int numero3=scanner.nextInt();



        System.out.println("Ingrese un dato 3 " );
        int numero4=scanner.nextInt();


        max=(numero>numero2)? numero :numero2;
        max=(max>numero3)?max:numero3;
        max=(max>numero4)?max:numero4;




        System.out.println("numero = " + numero);
        System.out.println("numero2 = " + numero2);
        System.out.println("numero3 = " + numero3);

        System.out.println("max = " + max);







    }
}
