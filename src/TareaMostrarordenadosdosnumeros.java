import java.util.Scanner;

public class TareaMostrarordenadosdosnumeros {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        
        int num1 =0;
        int num2 =0;

        System.out.println("Ingrese el primer numero " );
        num1=scanner.nextInt();

        System.out.println(" Ingrese el segundo numero " );
        num2=scanner.nextInt();
        
        if(num1<num2){
            System.out.println("" + num2 +"  "+num1);
        }else{
            System.out.println(" " + num1+"  "+num2);
        }
            
                
        
    }
}
