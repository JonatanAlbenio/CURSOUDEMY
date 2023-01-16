import java.util.Scanner;

public class Tarea12CalcularElAreaDeUnCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radio =0;
        double area =0;

        System.out.println(" Ingrese el radio del circulo" );
        radio=scanner.nextDouble();

        area=Math.PI*(Math.pow(radio,2));

        area=Math.round(area);
        System.out.println("El area es :  " + area +"m");











    }
}
