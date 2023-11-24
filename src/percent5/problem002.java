package percent5;

public class problem002 {

    static void Fibonacci(int a){
        int sum = 0;
        int i = 0;
        int j = 1;
        while(i<a && j<a){
            System.out.println(i);
            System.out.println(j);
            if(i%2==0){
                sum += i;
            }
            if(j%2==0){
                sum += j;
            }
            i += j;
            j += i;
        }
        System.out.println("The sum of the even-valued terms that don't exceed "+ a + " is: " + sum);
    }

    public static void main(String []args){
        int x = 4000000;
        Fibonacci(x);
    }
}
