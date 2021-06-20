import java.util.*;

class Test{

    public static boolean isPalindrom(int n){
        int origin = n;
        int rev = 0;
        while(n != 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n/=10;
        }
        if (rev == origin){
            return true;
        }
        return false;   
    }

    public static boolean isChildPalindrom(int n){
        int[] arr = new int[20];
        int index = 0;
        while(n != 0){
            int lastDigit = n % 10;
            arr[index++] = lastDigit;
            n/=10; 
        }
        System.out.println(index);
        int[] chidDigtis = new int[index/2];

        int index2 = 0;
        for(int i = index-1; i >=1;i-=2){
            chidDigtis[index2++] = arr[i] + arr[i-1];
        }
        System.out.println(Arrays.toString(chidDigtis));

        int mult = (int) Math.pow(10,chidDigtis.length -1);
        // System.out.println(mult);
        int num= 0;
        for(int i = 0; i < chidDigtis.length;i++){
            
            num = num + chidDigtis[i] * mult;
            mult = mult/10;
            System.out.println(num);
        }
        // System.out.println(num);

        boolean res  = isPalindrom(num);
        return res;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        boolean res = isPalindrom(n);
        boolean childPalindromRes = false;

        if(res){
            System.out.println("number is is Palindrom");
        }else{
              childPalindromRes = isChildPalindrom(n);

              if(childPalindromRes){
                System.out.println("child is Palindrom");
              }else{
                System.out.println("child is not Palindrom");
              }
        }
    }
}