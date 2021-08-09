public class TestPrimTypes {
    public static void main(String[] args) {
        int data = 100;
        if (data == 100)
            System.out.println("Yesss");
        else
            System.out.println("NO");
        System.out.println("Max Int " + Integer.MAX_VALUE);
        System.out.println("Min Int " + Integer.MIN_VALUE);
        // byte b1=128;
        byte b1 = 10;
        byte b2 = 5;
        byte b3 = (byte) (b1 + b2);
        b1 += 10;// b1 =(byte) (b1+10);
        int i = b1;
        long l1 = 1353425454;
        float f = l1;// no javac err : long ---> float : auto promotion
        // f=123.456;//double ---> float : is not an auto promotion
        double d = 12345.567F;

    }

}
