import javax.swing.*;
import java.util.Arrays;

public class Tarea6ObtenerElNombreMasLargo {
    public static void main(String[] args) {

      String nombres1=JOptionPane.showInputDialog("Ingrese el nombre + el apellido ") ;
      String nombres2=JOptionPane.showInputDialog("Ingrese el nombre + el apellido ") ;
      String nombres3=JOptionPane.showInputDialog("Ingrese el nombre + el apellido ") ;


        String[] nombres= new String[3];
      nombres[0]=nombres1;
      nombres[1]=nombres2;
      nombres[2]=nombres3;



    int validacion = nombres[0].length();
    int validacion1 = nombres[1].length();
    int validacion2 = nombres[2].length();

     JOptionPane.showMessageDialog(null,validacion);
        JOptionPane.showMessageDialog(null,validacion1);
        JOptionPane.showMessageDialog(null,validacion2);

        if (validacion> validacion1 && validacion>validacion2){

            JOptionPane.showMessageDialog(null,nombres1+" tiene el nombre más largo.");

        } else if (validacion1>validacion && validacion1>validacion2) {
            JOptionPane.showMessageDialog(null,nombres2+" tiene el nombre más largo.");


        } else if (validacion2>validacion && validacion2>validacion1) {
            JOptionPane.showMessageDialog(null,nombres3+" tiene el nombre más largo.");

        }

        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");

        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

        System.out.println("La persona con el nombre mas largo es " + max);
    }
}
