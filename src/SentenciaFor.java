public class SentenciaFor {

    public static void main(String[] args) {

        for(int i =0;i<=5;i++){


            System.out.println("i = " + i);


        }

        int j=0;
        for(;;){

            if(j>=5){
            break;
            }

            System.out.println("i = " + j);


        }

        for(int i =10;i>=0;i--){


            System.out.println("i = " + i);


        }

        for(int i =1,k=10;   i<=k;  i++,k--){


            System.out.println( k+"  = " + i);


        }


        for(int i =0;i<=5;i++){


            System.out.println("i = " + i);


        }

        for(int i =0;i<=10;i++){

            if(i%2 ==0){
                continue;
            }

            System.out.println("i = " + i);


        }

    }
}
