/*
Nth Fibonacci Number

Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) = F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.
Input Format :
The first line of each test case contains a real number ‘N’.
Output Format :
For each test case, return its equivalent Fibonacci number.
Constraints:
1 <= N <= 10000     
Where ‘N’ represents the number for which we have to find its equivalent Fibonacci number.

Time Limit: 1 second
Sample Input 1:
6
Sample Output 1:
8

*/

import java.util.Scanner;

public class NthFibonacciNumber {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int fab1 = 1,fab2 = 1;
	        int nextTerm=0;
	        if(n==1 || n==2) {
				nextTerm=1;
			}
	        else {
	        	for (int i = 3; i<=n; i++) {
					nextTerm= fab1 + fab2;
					fab1=fab2;
		            fab2=nextTerm;
		        }
	        }
	        System.out.println(nextTerm);
		
	}

}
