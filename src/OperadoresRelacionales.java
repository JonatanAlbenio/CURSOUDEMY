public class OperadoresRelacionales {
    public static void main(String[] args) {

        int i = 4;
        byte d = 7;
        float k = 127e-7f;
        double l = 2.123e3;
        boolean f = false;

        boolean f1 = i == d;

        System.out.println("f1 = " + f1);


        boolean b2 = !f1;
        System.out.println("b2 = " + b2);

        boolean b3 = i != d;
        System.out.println("b3 = " + b3);


        boolean b4 = f == true;

        boolean b6= i>d;

        System.out.println("b6 = " + b6);


       boolean b7 = i>d;
        System.out.println("b7 = " + b7);
       boolean b8 = i<d;

        System.out.println("b8 = " + b8);


        boolean b9 =l>=k;
        System.out.println("b9 = " + b9);


        boolean b10 = l<=k;

        System.out.println("b10 = " + b10);





    }




}
