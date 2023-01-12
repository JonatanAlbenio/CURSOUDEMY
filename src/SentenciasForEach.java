public class SentenciasForEach {
    public static void main(String[] args) {

        String[] nombres={"jonatan","pepe","maria","paco","bea","pepa"};

        int [] numeros ={1,2,3,4,5,6,7,5};
        for(int num : numeros){

            System.out.println("num = " + num);
        }


        for (String nombre:nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
