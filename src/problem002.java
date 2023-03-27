public class problem002 {

    public static void main(String []args){
        int x = 0;
        int y = 1;
        int maxv = 4000000;
        int evensum = 0;

        System.out.println(x);
        while(y < maxv && x < maxv){
            y += x;
            System.out.println(y);
            if(y % 2 == 0){
                evensum += y;
            }
            x += y;
            System.out.println(x);
            if(x % 2 == 0){
                evensum += x;
            }
        }
        System.out.println("The sum of the even fibonnaci numbers that do not exceed 4 million is: " + evensum);
    }
}
