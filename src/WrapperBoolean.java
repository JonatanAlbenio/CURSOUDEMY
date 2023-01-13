public class WrapperBoolean  {

    public static void main(String[] args) {


        Integer num1,num2;

        num1=1;
        num2=2;

        boolean primBoolean = num1>num2;

        Boolean objetoBoolean = Boolean.valueOf(primBoolean);

        Boolean objetoBoolean2 = Boolean.valueOf("false");

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);
        System.out.println("objetoBoolean = " + objetoBoolean);

        Boolean obBoolean3 =false;


        System.out.println("Comparando dos objetos boolean" + (objetoBoolean2==objetoBoolean) );

        System.out.println("Comparando dos objetos boolean" + (objetoBoolean2.equals(objetoBoolean)) );
        System.out.println("Comparando dos objetos boolean" + (objetoBoolean.equals(obBoolean3)) );

        boolean primBoolean2 = objetoBoolean2.booleanValue();













    }
}
