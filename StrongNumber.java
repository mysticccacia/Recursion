public class StrongNumber {


    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    static void strongDigit(int n,int org,int sum){
        if(n==0){
            if(sum==org){
                System.out.println("Strong Number");
                return;
            }
            else{
                System.out.println("Not a Strong Number");
                return;
            }
        }

        int lastDigit = n%10;
        sum+=factorial(lastDigit);
        strongDigit(n/10, org, sum);
    }
    static int strongDigit(int n){
        if(n==0){
            return 0;
        }
        int sum = strongDigit(n/10);
        int lastDigit = n%10;
        sum+=factorial(lastDigit);
        return sum;
    }
    public static void main(String[] args) {
        // strongDigit(146, 146, 0);
      int StrongNumber =  strongDigit(145);
      if(StrongNumber == 145){
        System.out.println("Strong Number");
      }
      else{
        System.out.println("Not a Strong NUmber");
      }

    }
}
