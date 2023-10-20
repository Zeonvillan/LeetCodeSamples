class Solution {
    public boolean isPalindrome(int x) {
        int reverseNumber = 0;
        int tempOriginal = x;

        while(tempOriginal > 0){
            int lastDigit = tempOriginal % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
			tempOriginal = tempOriginal / 10;
        }
		if(x == reverseNumber){
			return true;
		}
		else
			return false;
    }
}