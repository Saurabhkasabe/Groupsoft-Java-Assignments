package week2.day1;

public class PalindromeNumber {

	public static void main(String[] args) {
		int temp = 121;//121
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10; //1
			rev = rev*10+rem;//121
			temp=temp/10;//.0
		}
		if(121==rev) {
			System.out.println(121+" is Palindrome number");
		}
		else {
			System.out.println(121+" is not palindrome number");
		}
	}




	}


