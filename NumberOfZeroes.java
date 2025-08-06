public class NumberOfZeroes {

    static void countZoroes(int n,int sum){
        if(n==0){
            System.out.println("Number of Zoroes:" + sum);
            return;
        }
        int Lastdigit = n%10;
        if(Lastdigit==0){
            sum++;
        }
        countZoroes(n/10, sum);
    }

    static int countZoroes(int n){
        if(n==0){
            return 0;
        }
        int sum = countZoroes(n/10);
        if(n%10==0){
            sum++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(countZoroes(1000500));
    }
}
