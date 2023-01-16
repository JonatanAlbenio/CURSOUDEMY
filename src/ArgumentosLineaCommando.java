public class ArgumentosLineaCommando {


    public static void main(String[] args) {


        if(args.length ==0){
            System.out.println(" debe ingresar un parametro");
            System.exit(-1);
        }
        for (int i=0;i<args.length;i++){

            System.out.println("i+\":\"+args[i] = " + i+":"+args[i]);
        }
    }

    //java c encoding -utf8 para las comillas


}
