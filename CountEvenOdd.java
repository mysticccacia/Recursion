public class CountEvenOdd {
    static void count(int n, int even, int odd){
        if(n==0){
            System.out.println("Count even:" + even);
            System.out.println("Count odd:" + odd);
            return;
        }

            if(n%2==0){
                even++;
            }
            else{
                odd++;
            }
            count(n-1,even,odd);
            
    }

    static int[] count(int n){
        if(n==0){
            return new int[2];
        }
        int[] arr = count(n-1);
        //backtracking
        if(n%2==0) arr[0]++;
        else arr[1]++;
        return arr;
        
    }

    
    public static void main(String[] args) {
        // count(5,0,0);
       int arr[] = count(100);
       for(int data:arr){
        System.out.print(data + " ");
       }
    }
}
