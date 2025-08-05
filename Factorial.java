public class Factorial {
    static void fact(int num,int result){
        if(num==1){
            System.out.println("Fact is:" + result);
            return;
        }
        fact(num-1,result * num);   
    }

    static int fact(int n){                     
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int result = fact(5);
        // fact(5,result);
        System.out.println(result);
    }
}
