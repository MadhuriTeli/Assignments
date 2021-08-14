
public class TEstRecurtion {

	
	public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);//9+8+7+6+....+1
	    } else {
	      return 0;
	    }
	}
	public static void main(String[] args) {
		
	    int result = sum(10);
	    System.out.println(result);

	}

}
