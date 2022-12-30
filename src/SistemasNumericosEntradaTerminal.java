
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaTerminal {
    public static void main(String[] args) {


        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingrese el numero entero:");
       // String numeroStr =scanner.nextLine();

        int numeroDecimal = 500;

        int numeroBinario=0;
        try {
            numeroBinario = scanner.nextInt();

        }catch (InputMismatchException e){
            System.out.println(" ERRROR NO ES UN NUMERO " +e  );
            main(args);
            System.exit(0);
        }





        int numeroOctal =0767;

        

        int numeroHex=0x1f4;


        String mensaje=  "Integer.toBinaryString(numeroDecimal) = " + numeroDecimal+"="+ Integer.toBinaryString(numeroDecimal)
                + "\n Numero hexadecimal de "+numeroDecimal +"="+ Integer.toHexString(numeroDecimal);
        mensaje +="\n Numero octal = " + numeroBinario+ "="+Integer.toOctalString(numeroDecimal);
        System.out.println("mensaje = " + mensaje);


    }
}
