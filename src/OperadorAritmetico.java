import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i=5,j=4, suma =i+j;


        System.out.println("suma = " + suma);

        int resta  =i-j;
        System.out.println("resta = " + resta);

        int mult = i*j;

        System.out.println("mult = " + mult);

        double div =(double) i/j;

        System.out.println("div = " + div);

        int resto =i%j;
        
        System.out.println("resto = " + resto);

        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero f"));
        
        if (numero %2 ==0){
            System.out.println("par = ");
        }
        else {
            System.out.println("impart = ");
        }


    }
}
