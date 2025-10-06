public class varArgsSum {
    public static void main(String[] args) {
        
        System.out.println(add(1,2,3)); // prints value returned by add()
    }

    static int add(int ...arr){ // ...(ellipsis) is used to take variable number of arguments

        int sum=0;

        for(int num: arr){ // enhanced for loop
            sum+=num;

        }
        return sum; // gives sum to add()
    }
}
