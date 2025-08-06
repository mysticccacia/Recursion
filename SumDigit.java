public class SumDigit {

    static void digitSum(int n,int sum){
        if(n==0){
            System.out.println("Sum of the digit is:" + sum);
            return;
        }
        

        int digit = n%10;
        sum+=digit;
        digitSum(n/10, sum);
    }

    static int digitSum(int n){
        if(n==0){
            return n;
        }

        int sum = digitSum(n/10);
        sum+=n%10;
        return sum;
    }
    public static void main(String[] args) {
        int sum = digitSum(5432);
        System.out.println(sum);
    }
}
