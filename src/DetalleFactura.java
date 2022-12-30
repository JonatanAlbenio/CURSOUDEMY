import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double precioFactura=0;
        double [] precioFacturaFinal=new double[2];
        double total=0;
        System.out.println("Por favor registre el nombre de la factura : ");
        String nombreFactura=scanner.nextLine();


        for (int i=0;i<2;i++){

            try {
                System.out.println("Ingrese el valor de la factura");
                precioFactura=scanner.nextDouble();
                precioFacturaFinal[i]=precioFactura;

                System.out.println(" = \n"+precioFacturaFinal[i]);
            }catch (Exception e){
                System.out.println("Error no es un numero valido   "+precioFactura);

                main(args);
                System.exit(0);

            }



        }

        total= precioFacturaFinal[0]+precioFacturaFinal[1];
       // System.out.println("total = " + total);
       double total2=0;
        total2=total*0.19;
       // System.out.println("total con el 19% = " + total);

        String mensaje ="La factura "+nombreFactura+"  tiene un total bruto de :" +total+" con un impuesto de  19 % " +
                "y el monto despues de impuesto es de :" + total2;


        System.out.println( mensaje);


    }
}
