public class problem001 {

    public static void main(String[] args){
        System.out.println("Hello World! Project Euler 001.");
        int x = 3;
        int y = 5;
        int sum = 0;

        for(int i = 0; i < 1000;i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of the multiples of " + x + " and " + y + " is: " + sum);
    }
}
