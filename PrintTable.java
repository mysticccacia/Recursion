public class PrintTable {

     static void printtable(int num,int i){
            if(i==0){
                return;
            }
            printtable(num,i-1);
            System.out.println(num * i);
        }

        static String printTable2(int num,int i){
            if(i==11){
                return "";
            }
            String str = printTable2(num, i+1);
            str =   num + " x " +i+ " = "+ num*i + "\n" + str;
            return str;
            
            
        }

    public static void main(String[] args) {
        // printtable(5, 10);
        String str = printTable2(5,1);
        System.out.println(str);
       
    }
}
