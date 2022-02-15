/*
Rotate array

You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
 Note:
Change in the input array/list itself. You don't need to return or print the elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains the value of 'D' by which the array/list needs to be rotated.
Output Format :
For each test case, print the rotated array/list in a row separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^4
0 <= N <= 10^6
0 <= D <= N
Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7
2
Sample Output 1:
3 4 5 6 7 1 2
Sample Input 2:
2
7
1 2 3 4 5 6 7
0
4
1 2 3 4
2
Sample Output 2:
1 2 3 4 5 6 7
3 4 1 2

*/


public class RotateArray {  
    
    public static void swap(int[] arr, int i,int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
	} 
    
    public static void reverse(int[] arr, int low, int high) {
        for (int i =low,j=high;i<j;i++,j--){
            swap(arr,i,j);
        }
	} 

    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
	} 
    
}  


     // 1st method   
//         int temp = 0,n=arr.length;
//         for (int i = 0; i < d; i++){
//             temp = arr[0];
//             for (int j = 0; j < n - 1; j++){
//                 arr[j] = arr[j + 1];
            	
//     		}
//             arr[n-1] = temp;
//     	

	// 2nd method
//         for(int i = 0; i < d; i++){  
//             int j, first;  
//             //Stores the first element of the array  
//             first = arr[0];  
          
//             for(j = 0; j < arr.length-1; j++){  
//                 //Shift element of array by one  
//                 arr[j] = arr[j+1];  
//             }  
//             //First element of array will be added to the end  
//             arr[j] = first;  
//         }  
