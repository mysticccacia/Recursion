public class PrimeNo {
    static boolean isPrime(int n,int i){
        if(i*i>n){
            return true;
        }
        if(n%i==0){
            return false;
        }
        return isPrime(n, i+1);
        
    }

    // static void isPrime(int n){
    //     if(i*i>n){
    //         System.out.println('Prime Number');
    //     }
    // }
    public static void main(String[] args) {
        System.out.println(isPrime(9, 2));
    }
}
