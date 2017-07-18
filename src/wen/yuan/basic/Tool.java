package wen.yuan.basic;

public class Tool {
	
	/*
	 * 5 3 5 2 8

			3 5 5 2 8
			3 5 5 2 8
			2 5 5 3 8
			2 5 5 3 8
			
			2 5 5 3 8
			2 3 5 5 8
			2 3 5 5 8
			
			2 3 5 5 8
			2 3 5 5 8
			
			2 3 5 5 8
	 * 
	 * 
	 * 
	 */
	public static void loopDouble(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = i; j < a; j++) {
				System.out.println(i + "-" + j);
			}
		}
	}
	
	public static void loopDoubleReverse(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = i; j > 0; j--) {
				System.out.println(i + "-" + j);
			}
		}
	}
	
	public static void loopDouble(int a, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = b; j > 0; j--) {
				System.out.println(i + "-" + j);
			}
		}
	}
	
	public static void swap(int a, int b) {
		System.out.print(a + "-" + b + ">");
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a + "-" + b);
	}
	
	public static void main(String[] args) {
		//Tool.loopDouble(4);
		Tool.swap(4, 3);
	}

}
