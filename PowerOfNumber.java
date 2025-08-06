public class PowerOfNumber {

    static void getPower(int num,int pow,int res){
        if(pow==0){
            System.out.println(res);
            return;
        }
        res*=num;
        getPower(num, --pow,res);
    }
    public static void main(String[] args) {
        getPower(2, 3, 1);
    }
}
