/*
Arrange Numbers in Array

You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2.
Note:
You need not print the array. You only need to populate it.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains an integer 'N'.
Output Format :
For each test case, print the elements of the arra/listy separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4

Time Limit: 1sec
Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2
Sample Input 2 :
2
9
3
Sample Output 2 :
1 3 5 7 9 8 6 4 2
1 3 2

*/

//1st Method (Time Optimised):


public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	int s=0,e=n-1,val=1;
		while(s<e) {
			arr[s]= val;
			val++;
            s++;
			arr[e]=val;
			val++;
			e--;
            if(e==s){
                arr[s]=n;
            }
		}
    }
}

//1st Method (Time not optimiesd):


public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	int s=0,e=n-1,val=1;
		while(s<e) {
			arr[s]= val;
			val++;
            s++;
			arr[e]=val;
			val++;
			e--;
            if(e==s){
                arr[s]=val;
            }
		}
    }
}

//2nd Method (not optimised):

public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	int start = 0 , end = n-1;

        while(start<=end) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    arr[start++] = i;
                }
                else{
                    arr[end--] = i;
                }
            }
        }
   }
}

