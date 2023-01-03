import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {


        String[] usernames = new String[2];
        String[] password = new String[2];
        usernames[0] = "andres";
        password[0] = "1234";


        usernames[1] = "admin";
        password[1] = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ingrese el username");
        String u = scanner.next();

        System.out.println(" Ingrese el password ");
        String p = scanner.next();

        boolean esAutenticado = false;
        for (int i = 0; i < usernames.length; i++) {

            if (usernames[i].equalsIgnoreCase(u) && password[i].equalsIgnoreCase(p)) {

                esAutenticado = true;

                break;

            }
        }

        if (esAutenticado) {


            System.out.println("Login success");


        } else {
            System.out.println("Por favor ingrese los campos requeridos ");
            System.out.println("password o username incorrect");

        }

    }

}
