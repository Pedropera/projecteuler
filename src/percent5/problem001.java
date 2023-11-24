package percent5;

public class problem001 {

    public static void main(String []args){
        // multiples of 3 or 5
        int x = 1000;
        int  soma = 0;
        for(int i = 0; i < x; i++){
            if(i%3==0 || i%5==0){
                System.out.println(i);
                soma += i;
            }
        }
        System.out.println("The sum of multiples of 3 or 5 are: " + soma);
    }

}