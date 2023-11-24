package percent5;

public class problem003 {
    static void largestPF(long a){
        int greater = 0; // armazenates the greater Prime Factor
        for(int i=1; i<a/2; i++){ // to be compared
            int counter = 0;
            System.out.println("1");
            for(int j=1; j<=i; j++){ // to compare
                if(i%j==0){
                    counter++;
                }
                if(counter <= 2){
                    greater = (int)i;
                }
            }
        }
        System.out.println(greater);;
    }

    public static void main(String []args){
        long x = 600851475143l;
        largestPF(x);
    }
}
