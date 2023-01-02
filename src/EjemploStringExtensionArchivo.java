public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo ="Alguna_imagen.json";
        int i=archivo.indexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));



    }
}
