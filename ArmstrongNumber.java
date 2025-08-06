public class ArmstrongNumber {

    static void armstrong(int n,int len ,int org,int sum){
        if(org==sum && n==0){
            System.out.println("Armstrong Number");
            return;
        }
        else if(n==0){
            System.out.println("Not Armstrong Number");
            return;
        }
        int Lastdigit = n%10;
        sum +=  (int)Math.pow(Lastdigit, len);
        armstrong(n/10, len, org, sum);
    }
    static int armstrong(int n,int len){
        if(n==0){
            return 0;
        }
        int sum = armstrong(n/10,len);
        sum+=(int)Math.pow(n%10, len);
        return sum;
    }
    public static void main(String[] args) {
        // armstrong(9474, 4, 9474, 0);
        int number = armstrong(9425, 4);
        if(number==9474){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not");
        }
    }
}
