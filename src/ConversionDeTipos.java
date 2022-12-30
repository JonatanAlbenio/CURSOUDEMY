public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String real ="123123.2";

        double realDoble =Double.parseDouble(real);

        System.out.println("realDoble = " + realDoble);

        String logicoStr = "true";

        boolean logicoBool =Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBool = " + logicoBool);

        int otroNumeroInt =100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr=Integer.toString(otroNumeroInt);
        otroNumeroStr =String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble =123.33e2;
        String otroRealStr =Double.toString(otroRealDouble);

        System.out.println("otroRealStr = " + otroRealStr);

        otroNumeroStr=String.valueOf(1.34555e3F);
        System.out.println("otroRealStr = " + otroRealStr);


        int i =500000;
        short s =(short)i;
        System.out.println("s = " + s);
        char b = (char) i;
        System.out.println("b = " + b);
    }
}
