/*
Total Salary

Write a program to calculate the total salary of a person. 
The user has to enter the basic salary (an integer) and the grade (an uppercase character), 
and depending upon which the total salary is calculated as -

    totalSalary = basic + hra + da + allow – pf
    
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.

Round off the total salary and then print the integral part only.
[Note: Try finding out a function on the internet to do so]

Input format :
Basic salary & Grade (separated by space)
Output Format :
Total Salary
Constraints :
0 <= Basic Salary <= 7,500,000
Sample Input 1 :
10000 A
Sample Output 1 :
17600
Sample Input 2 :
4567 B
Sample Output 2 :
8762
*/

import java.util.Scanner;
import java.lang.Math;
public class TotalSalary {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s =new Scanner(System.in);
		float basicSalary = s.nextInt();
		String str = s.next();
		char grade = str.charAt(0);
		float allow=0;
		if(grade == 'A') {
			allow = 1700;
		}
		else if(grade == 'B') {
			allow = 1500;
		}
		else {
			allow = 1300;
		}

	   float hra = (20*basicSalary)/100;
	   float da = (50*basicSalary)/100;
	   float pf = (11*basicSalary)/100;
		
	   float totalSalary = (basicSalary+hra+da+allow-pf);
		
	   System.out.println(Math.round(totalSalary));
	}
}

