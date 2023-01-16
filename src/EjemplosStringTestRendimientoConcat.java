public class EjemplosStringTestRendimientoConcat {
    public static void main(String[] args) {

     
        String a ="a";
        String b ="b";
        String c =a;
        
        
        for (int i=0;i<500;i++){
            
            c=c.concat(a).concat(b).concat("\n");
            
        }

        
        long inicio =System.currentTimeMillis();
        
        long fin =System.currentTimeMillis();


        System.out.println("c = " + c);
        System.out.println(fin-inicio);


        System.gc();






    }
}
