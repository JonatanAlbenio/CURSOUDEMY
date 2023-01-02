public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso =null;
        boolean esNUll = curso == null;

        System.out.println("esNUll = " + esNUll);

        if(esNUll){
            curso="java programación";
        }

        boolean esVacio =curso.length()==0;
        boolean esVacio2 =curso.isEmpty();
        boolean esBlanco =curso.isBlank();

        if(esVacio==false){

            System.out.println(curso.toUpperCase());

            System.out.println(" Bienvenido al curso ".concat(curso) );

        }



















    }
}
