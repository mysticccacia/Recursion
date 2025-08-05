public class PrintName {

    static void show(int n){
        if(n==0){  //base case
            return;
        }
        show(n-1);  //recurrence relation
        System.out.println("Abhishek " + n); // pre-logic
        //post Logic - BackTracking
        // System.out.println("kushwaha "  + n);
    }
    public static void main(String[] args) {
        show(5);
    }
}
