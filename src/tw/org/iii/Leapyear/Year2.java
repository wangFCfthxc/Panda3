
public class Year2 {

	public static void main(String[] args) {
		int Year = 1900;
		System.out.println("¦è¤¸"+Year+"¦~");
		int A = Year % 4;
		int B = Year % 100;
		int C = Year % 400;
		if (A > 0)
			System.out.println("«D¶|¦~");
		else if (B > 0)
			System.out.println("¶|¦~");
		else if (C > 0)
			System.out.println("«D¶|¦~");
		else
			System.out.println("¶|¦~");
		
			
	}

}
