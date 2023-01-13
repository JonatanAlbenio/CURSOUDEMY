public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {

        String frase ="tres tristes tigress traga trigo en un trigal ";

        String palabra ="trigo";

        int maxPalabra = palabra.length();
         int max = frase.length();
         int cantidad =0;
         buscar:
         for (int i =0; i<max;i++){
            int k=i;
             for (int j =0;j<maxPalabra;j++){

                 if(frase.charAt(k++)!= palabra.charAt(j)){
                     continue buscar;
                 }

             }

             cantidad ++;



         }
        System.out.println("Encontrado  = " + cantidad+ " veces character"+frase+" en la frase");


    }
}
