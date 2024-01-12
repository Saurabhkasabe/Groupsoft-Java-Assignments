package week2.day2;

public class PrintDublicates {

	public static void main(String[] args) {
		 int[] num = {12,14,15,14,12,17,15 };

		 for (int i = 0; i < num.length - 1; i++) {
	            for (int j = i + 1; j < num.length; j++) {
	                if (num[i] == num[j]) {
	                    System.out.println("The Duplicate Value is: " + num[i]);
}
	                
}
	            
}
}
}
	


