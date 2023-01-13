import java.util.Scanner;

public class Tarea9MultiplicarDosNumeros {
    public static void main(String[] args) {


        int numero1=0;
        int numero2=0;
        int numerofinal=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un numero  ");
         numero1=scanner.nextInt();

        System.out.println("Ingresar un numero  ");
        numero2=scanner.nextInt();


        if(numero1<=-1){
            numero1=0-numero1;

        }



        for (int i  =0;i< numero1;i++){

            numerofinal+=numero2;
            
        }
        System.out.println("numerofinal = " + numerofinal);



       System.out.println("Ingrese el numero a: ");
    int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
    int b = scanner.nextInt();
    int resultado = 0;

    // verificamos los signos de cada uno, si es positivo o negativo
    boolean positivoB = b > -1;
    boolean positivoA = a > -1;

    // calculamos el valor absoluto de a
    int absolutoA = positivoA? a: -a; // equivalente a Math.abs(a);

    // sumamos tantas veces el valor de b, segun el valor de a.
        for(int i = 0; i < absolutoA; i++){
        resultado = resultado + b;
    }

    // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA){
        resultado = -resultado;
    }

        System.out.println("el resultado es " + resultado);
}

}
