public class OperadorInstanceOf {
    public static void main(String[] args) {

        String nombre ="creando un objeto cualquiera";


        Integer num =12;


        boolean b1 =nombre instanceof  String;

        System.out.println("b1 = " + b1);



        b1 =nombre instanceof  Object;

        System.out.println("b1 = " + b1);


        b1 = num instanceof Object;

        System.out.println("b1 = " + b1);



        b1 = num instanceof Integer;

        System.out.println("b1 = " + b1);



    }
}
