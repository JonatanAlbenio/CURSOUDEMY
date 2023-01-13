import java.util.Scanner;

public class Tarea7CalcularElnumeroMenor {

    public static void main(String[] args) {
        int mayor1,menor1 =0;

         int [] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);


        for (int i =0;i<10;i++){

            System.out.println("Ingrese un numero = "+(i+1)+": ");
            numeros[i]=scanner.nextInt();



        }

        mayor1=numeros[0];
        menor1=numeros[0];



        for (int i = 0; i < numeros.length; i++) {
            if(numeros [i] > mayor1) {
                mayor1 = numeros[i];
            }
            if(numeros[i]<menor1) {
                menor1 = numeros[i];
            }
        }



        System.out.println("El número "+ menor1+" es menor que ="+mayor1);


        System.out.println("Ingrese la cantidad de números a comparar: ");
        int cantidad = scanner.nextInt();

        // preguntamos si es menor a 10, ya que el mínimo según la letra de la tarea es 10 (buscar el número menor de minimo 10 valores enteros).
        if (cantidad < 10) {
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        } else {
            int menor = Integer.MAX_VALUE; // asignamos un valor máximo por defecto como numero menor para comenzar
            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if (menor < 10) {
                System.out.println("El número " + menor + " es menor que 10!");
            } else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }

    }
}
