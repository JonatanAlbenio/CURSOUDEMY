public class WrapperOperadoresRelacionales {

    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1028);

        Integer num2 = num1;

        System.out.println("num2 = " + num1);
        System.out.println("num2 = " + num2);


        System.out.println(" Son el mismo objeto ?  " +(num1==num2));

        num2=1028;


        System.out.println("num2 = " + num1);
        System.out.println("num2 = " + num2);


        System.out.println(" Son el mismo objeto ?  " +(num1==num2));


        System.out.println(" Tiene el mismo valor ?  " +(num1.equals(num2)));

        System.out.println(" Tiene el mismo valor ?  " +(num1.intValue()==num2.intValue()));


        boolean condicion =num1 >num2;

        System.out.println("condicion = " + condicion);






    }
}
