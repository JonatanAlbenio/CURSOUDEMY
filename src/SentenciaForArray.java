import javax.swing.*;

public class SentenciaForArray {
    public static void main(String[] args) {


        String[] nombres={"jonatan","pepe","maria","paco","bea","pepa"};
        int count = nombres.length;
        for (int i =0;i< count;i++){
            if(nombres[i].equalsIgnoreCase("maria")||
                    nombres[i].equalsIgnoreCase("pepa")){
                continue;
            }
            System.out.println(nombres[i]);
        }


        String buscar = JOptionPane.showInputDialog("INGRESE UN NOMBRE \"pepe\" ");

        boolean encontrado =false;
        for (int i =0;i<count;i++){


            if (nombres[i].equalsIgnoreCase(buscar)){

                encontrado=true;
                break;

            }





        }
        if (encontrado){
            JOptionPane.showMessageDialog(null,buscar+"  Fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null,"No encontrado joven ");
        }














    }
}
