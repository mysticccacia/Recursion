public class NaturalNumber {
    static void SumNatural(int n,int sum){
        if(n==0){
            System.out.println("Sum of n Natural Number:"+sum);
            return;
        }
        sum+=n;
        SumNatural(n-1, sum);
    }

    static int SumNatural(int n){
        if(n==0){
            return 0;
        }
        int sum = SumNatural(n-1);
        sum+=n;
        return sum;
    }
    public static void main(String[] args) {
       System.out.println( SumNatural(10));
    }
}
