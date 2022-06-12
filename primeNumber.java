package week1.day1.assignments;

public class primeNumber {
	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for(int i = 2;i <= input/2;i++) {
			if(input % i == 0) {
				flag = true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}
	}
}
