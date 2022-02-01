/*
Code : Diamond of stars

Print the following pattern for the given number of rows.
Note: N is always odd.

Pattern for N = 5
The dots represent spaces.

Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
 */
 import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s =  new Scanner(System.in);
		 int n = s.nextInt();
		 int i=1;
		 int mid = n/2+1;
		 while(i<=mid) {
			 int j=1;
			 while(j<=mid-i) {		//for spaces
				 System.out.print(" ");
				 j++;
			 }
			 j=1;
			 while(j<=2*i-1) {		//for inc. star.
				 System.out.print("*");
				 j++;
			 }
			 System.out.println();
		     i++;
		 }
		 
	     int k = 1;
		 while(k<=mid-1) {
			 int j=1;
			 while(j<=k) {		//for space
				 System.out.print(" ");
				 j++;
			 }
			 j = 1;
			 while(j<=2*(mid-k)-1) {
				 System.out.print("*");
				 j++;
			 }
			 System.out.println();
		     k++;
		 }
	     
        
    }
}
