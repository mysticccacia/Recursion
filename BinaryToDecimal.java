public class BinaryToDecimal {

    static void convert(int n,int decimal,int i){
        if(n==0){
            System.out.println(decimal);
            return;
        }
        int last = n%10;
        decimal+= last * (int)Math.pow(2,i);
        convert(n/10, decimal, ++i);
    }
    
    public static void main(String[] args) {
        convert(1011, 0, 0);
    }
}
