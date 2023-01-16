public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);

        System.out.println("absoluto = " + absoluto);

        absoluto=Math.abs(3);
        
        double max = Math.max(3.1,1.2);

        System.out.println("max = " + max);
        
        double min =Math.min(3.5,1.2);
        System.out.println("min = " + min);
        
        double techo = Math.ceil(3.4);

        System.out.println("techo = " + techo);
        
        
        double piso =Math.floor(4.3);

        System.out.println("piso = " + piso);
        
        
        Long entero = Math.round(3.4);

        System.out.println("entero = " + entero);
        
        entero=Math.round(Math.PI);
        System.out.println("entero = " + entero);
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);

        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.32);
        grados=Math.round(grados);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(98.00);
        System.out.println("radianes = " + radianes);

        System.out.println(" seno " + Math.sin(radianes));
        System.out.println(" coseno " + Math.cos(radianes));

        radianes = Math.toRadians(100);
        System.out.println("Math.cos(radianes) = " + Math.cos(radianes));



    }


}


