import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numeroDecimal+\"=\"+ Integer.toBinaryString(numeroDecimal) = " + numeroDecimal+"="+ Integer.toBinaryString(numeroDecimal));
        int numeroBinario=0;
        try {
            numeroBinario = Integer.parseInt( JOptionPane.showInputDialog(null,"Ingrese un numero entero"));

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"error no es un numero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("Numero octal = " + numeroBinario+ "="+Integer.toOctalString(numeroBinario));
    
        int numeroOctal =0767;
        System.out.println("numeroOctal = " + numeroOctal);

        
        System.out.println("Numero hexadecimal de "+numeroDecimal +"="+ Integer.toHexString(numeroDecimal));
        
        int numeroHex=0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje=  "Integer.toBinaryString(numeroDecimal) = " + numeroDecimal+"="+ Integer.toBinaryString(numeroDecimal)
                + "\n Numero hexadecimal de "+numeroDecimal +"="+ Integer.toHexString(numeroDecimal);
        mensaje +="\n Numero hexadecimal de "+numeroDecimal +"="+ Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null,mensaje);


    }
}
