public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {

        String frase ="tres tristes tigress traga trigo en un trigal ";

        String palabra ="trigo";

        int maxPalabra = palabra.length();
         int max = frase.length();
         int cantidad =0;
         for (int i =0; i<max;i++){

             for (int j =0;j<maxPalabra;j++){

                 if(frase.charAt(i)!= palabra.charAt(j)){
                     continue;
                 }

             }

             cantidad ++;



         }
        System.out.println("Encontrado  = " + cantidad+ " veces character 't' en la frase");


    }
}
