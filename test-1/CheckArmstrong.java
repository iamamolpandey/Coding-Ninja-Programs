/*
Check Armstrong

Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
Input Format :
Integer n
Output Format :
true or false
Sample Input 1 :
1
Sample Output 1 :
true
Sample Input 2 :
103
Sample Output 2 :
false
*/
import java.lang.Math;
import java.util.Scanner;
public class CheckArmstrong {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = String.valueOf(n); 
        int power = str.length();
        int digit = 0;
        int sum = 0;
        int num = n;
        while(num!=0){
            digit = num%10;
            sum+=Math.pow(digit,power);
            num = num/10;
        }
        if(sum==n)
		System.out.println("true");
        else
           	 System.out.println("false");

	}
}
