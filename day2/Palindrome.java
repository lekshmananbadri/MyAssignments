package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num =	34343;
		int Reverse = 0;
		System.out.println("Enter a number:");
		while(num!=0) {
			Reverse=Reverse*10 + num%10;
			num=num/10;
		}

	}

}
