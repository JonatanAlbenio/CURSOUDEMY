import java.util.Scanner;

public class EJemploStringMetodosArreglos {
    public static void main(String[] args) {


        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());


        char[] arreglo = trabalenguas.toCharArray();


        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {

            System.out.println("arreglo[i] = " + arreglo[i]);


        }
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");

        int largo2 = arreglo2.length;

        for (int i = 0; i < largo2; i++) {

            System.out.println("arreglo2[i] = " + arreglo2[i]);
        }
        String archivo = "alguna_imagen.pdf";
        String[] archivosArreglo = archivo.split("[.]");
        int largo3 = archivosArreglo.length;

        for (int i = 0; i < largo3; i++) {

            System.out.println("arreglo2[i] = " + archivosArreglo[i]);
        }
        System.out.println("archivosArreglo[largo3-1] = " + archivosArreglo[largo3 - 1]);


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ingrese el nombre ");
        String s =scanner.nextLine();


        System.out.println(" Ingrese el nombre " );
        String s2 = scanner.nextLine();

       System.out.println(" Ingrese el nombre " );
      String s3 = scanner.nextLine();


        String ws= String.valueOf(s.charAt(1)).toUpperCase();
        s=s.substring(4,6);

        System.out.println("ws = " + ws);



        String ws2= String.valueOf(s2.charAt(1)).toUpperCase();
        s2=s2.substring(3,5);
        System.out.println("ws2 = " + ws2);

       String ws1= String.valueOf(s3.charAt(1)).toUpperCase();
        s3=s3.substring(2);
       System.out.println("ws2 = " + ws1);





       System.out.println(  ws.concat(".").concat(s).concat("_")+ ws2.concat(".").concat(s2).concat("_")+ ws1.concat(".").concat(s3));










    }
}
