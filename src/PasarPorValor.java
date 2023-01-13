public class PasarPorValor {

    public static void main(String[] args) {

        int i =10;

        System.out.println("Iniciamos el método main con i  " + i);

        test(i);
        System.out.println("Termina el método main con valor de i  " + i);


    }

    public static void test(int i){
        System.out.println(" iniciamos el método test i  por parameter  " + i);
        i =34;
        System.out.println("NUEVO VALOR DE I " + i);
    }
}
