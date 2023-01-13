public class PasarPorReferencia {
    public static void main(String[] args) {


        int [] edad ={10,11,23};

        System.out.println("edad = " + edad);

        for (int i =0;i<edad.length;i++){

            System.out.println("edad[i] = " + edad[i]);

        }
        System.out.println("antes de llamar  = ");

        System.out.println(" después de llamar " );

        test(edad);
        for (int i=0;i<edad.length;i++){
            System.out.println("edad[i] = " + edad[i]);

        }


    }
    public static void test(int [] edadarr){

        for (int i=0;i<edadarr.length;i++){

            edadarr[i]=edadarr[i]+20;
        }


    }
}
