public class Palindrome {

    static int rev = 0;

    static boolean IsPlalindrome(int num, int org,int reverse){
        if(num==0){
            if(org==reverse){
                return true;
            }
            else{
                return false;
            }
        }
        int digit = num%10;
        reverse = reverse * 10 + digit;
        return IsPlalindrome(num/10, org, reverse);
    }

    static int IsPalindrome(int num){
       if(num==0){
        return rev;
       }
       rev = rev * 10 + num%10;
       return IsPalindrome(num/10);
    }
    public static void main(String[] args) {
        int num = 152;
        rev = 0;
        int result = IsPalindrome(num);

        if(result==num){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome Number");
        }
        
    }
}
