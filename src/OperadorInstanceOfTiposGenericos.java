public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object nombre ="creando un objeto cualquiera";


        Number num =12;

        Number num2 = Integer.valueOf(8);


        boolean b1 =nombre instanceof  String;

        System.out.println("b1 = " + b1);

        b1 = nombre instanceof Integer;
        System.out.println("b1 = " + b1);


        b1 =nombre instanceof  Object;

        System.out.println("b1 = " + b1);


        b1 = num instanceof Object;

        System.out.println("b1 = " + b1);



        b1 = num instanceof Integer;

        System.out.println("b1 = " + b1);

        b1=num instanceof Long;

        System.out.println("b1 = " + b1);


        Double decimal = 54.34;
        b1 = decimal instanceof Number;
        System.out.println("decimal = " + decimal);

        Float decimal1 = 54.34f;
        b1 = decimal1 instanceof Number;
        System.out.println("decimal = " + decimal1);
    }
}
