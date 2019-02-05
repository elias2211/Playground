package clock;

public class PlayGroud {
	public static void main(String[] args) {
		int i = 5; 
		int j = 0;
		int k;
		
		try {
			k = i / j;
		}
		
		catch (Exception e) {
			System.out.println("You can not devide by 0");
		}
		
		System.out.println(j);
	}
}
