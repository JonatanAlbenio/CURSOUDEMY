import java.util.Scanner;

public class Taller3 {
    public static void main(String[] args) {

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
