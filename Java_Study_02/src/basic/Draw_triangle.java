package basic;

public class Draw_triangle {
	public static void main(String[] args) {
		triangle2();
	}

	public static void triangle1(){
		for(int i = 10; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");	
			}
			System.out.print("\n");
		}
	}
	
	public static void triangle2(){
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");	
			}
			System.out.print("\n");
		}
	}
	
	
}

