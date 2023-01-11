import java.util.Scanner;

public class TareaEstanque {
    public static void main(String[] args) {


        int litros =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese la cantidad de litros disponibles" );
        litros=scanner.nextInt();

            if (litros == 70) {
                System.out.println("  Estanque lleno");
            } else if (litros >= 60 && litros <= 69) {
                System.out.println("  casi lleno ");
            } else if (litros >= 40 && litros <= 59) {
                System.out.println("Estanque  3/4");
            } else if (litros >= 35 && litros <= 39) {
                System.out.println("Medio Estanque  ");
            } else if (litros >= 20 && litros <= 34) {
                System.out.println(" Suficiente ");
            } else {
                System.out.println(" Insuficiente ");
            }




        double capacidadActual; // la capacidad a ingresar

        System.out.println("Introduzca la capacidad actual del estanque (máx 70 litros): ");
        capacidadActual = scanner.nextDouble();

        if (capacidadActual >= 0 && capacidadActual < 20) {
            System.out.println("Insuficiente");
        } else if (capacidadActual >= 20 && capacidadActual < 35) {
            System.out.println("Suficiente");
        } else if (capacidadActual >= 35 && capacidadActual < 40) {
            System.out.println("Medio Estanque");
        } else if (capacidadActual >= 40 && capacidadActual < 60) {
            System.out.println("Estanque  3/4");
        } else if (capacidadActual >= 60 && capacidadActual < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidadActual == 70) {
            System.out.println("Estanque lleno");
        }


    }
}
