public class WrapperInteger {
    public static void main(String[] args) {

        int primitivo =1234;
        Integer intObjeto=Integer.valueOf(primitivo);
        Integer intObjeto2=312312;

        System.out.println("intObjeto2 = " + intObjeto2);
        int num =intObjeto;
        System.out.println("num = " + num);
        int num2=intObjeto2.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd ="6700";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shorObjecto =intObjeto.shortValue();

        System.out.println("shorObjecto = " + shorObjecto);


        Byte bytObjecto = intObjeto.byteValue();
        System.out.println("bytObjecto = " + bytObjecto);





    }
}
