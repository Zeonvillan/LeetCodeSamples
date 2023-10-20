import java.util.Scanner;

class Main{
	public static void main(String[] args){
			Solution solution = new Solution();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number");
			int x = sc.nextInt();
			
			boolean isPalindrome = solution.isPalindrome(x);
			if (isPalindrome) {
            System.out.println(x + " is a palindrome");
			} else {
            System.out.println(x + " is not a palindrome");
        }
	}
}