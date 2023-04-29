package week1.day2;

public class Primenumber {

	public static void main(String[] args) {
		int input =13;
		boolean flag = false;
		for(int i=13; i<input; i++) {
			if(input%i==0) {
				flag=true;
				break;
				
			}
	if(flag==false) {
		System.out.println(input+" is a prime number");
	}
	else {
		System.out.println(input+" is not a prime number");
	}
		}
	}
}