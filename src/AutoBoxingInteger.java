public class AutoBoxingInteger {
    public static void main(String[] args) {
        Integer[] enteros = {Integer.valueOf(1), 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int suma = 0;

        for (Integer i : enteros){
            if(i.intValue() % 2 ==0){

                suma +=i.intValue();

            }


        }
        System.out.println("suma = " + suma);



        for (Integer i : enteros){
            if(i % 2 ==0){

                suma +=i;

            }


        }
        System.out.println("suma = " + suma);


    }



}
