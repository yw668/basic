package wen.yuan.basic;

public class Sort {
	public static void main(String[] args) {
//		int[] i = new int[5];
//		i[0] = 5;
//		i[1] = 3;
//		i[2] = 5;
//		i[3] = 2;
//		i[4] = 8;
//		int index = 0;
//		for (int j : i) {
//			System.out.println(j);
//			
//		}
		int[] i = {5, 3, 5, 2, 8};
		int a = 0;
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j]);
			if(i[j] > i[j+1]) {
				a = i[j];
				i[j] = i[j+1];
				i[j+1] = a;
			}
			System.out.println("--" + i[j]);
		}	
	}

}
