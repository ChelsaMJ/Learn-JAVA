public class varArgsAvg {
    public static void main(String[] args) {
        
        System.out.println(avg(1,2,3,4));
    }

    static double avg(double... arr){

        double sum=0;

        if(arr.length==0) return 0;

        for(double num: arr){
            sum+=num;
        }
        return sum/arr.length;
    }
}
