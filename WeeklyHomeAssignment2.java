package week2.day3;

public class WeeklyHomeAssignment2 {

	public static void main(String[] args) {
		 int nums[] = {1,2,3,1,2,3};
	        boolean b = false;
	        
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                int value = Math.abs(i - j);
	                if (nums[i] == nums[j] && value <= 2) {
	                	b = true;
	                     }
	            }
	        }

	        System.out.println(b);
	    }
	
	}


