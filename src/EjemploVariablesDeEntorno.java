import java.util.Map;

public class EjemploVariablesDeEntorno {

    public static void main(String[] args) {

        Map<String,String>varEnv=System.getenv();
        System.out.println("variable ambiente o de entorno del sistema \n = " + varEnv);

        String username =System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);


        String tempDir =System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 =varEnv.get("Path");
        System.out.println("path2 = " + path2);

        String appEnv =varEnv.get("SALUDAR_HOLA");
        System.out.println("appEnv = " + appEnv);


        System.out.println("----------------------LISTANDO VARIABLES DE ENTORNO ... -------------------------------" );

        for (String key : varEnv.keySet()){
            System.out.println(key +"=>"+varEnv.get(key));

        }
        //Crear variables de entorno a traves del terminal
        //  setx SALUDAR_HOLA "HOLA AMIGOS"


    }
}
