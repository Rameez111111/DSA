package Arrays;

import java.util.Scanner;
  // Delete a particular array element in the array program.
public class Deletion {

	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.print("Enter the number of elements: ");
				int n=s.nextInt();
				int arr[]=new int[n];
				System.out.print("Enter the array elements one by one: ");
		        for(int i=0;i<n;i++)
			    arr[i]=s.nextInt();
		        System.out.print("Enter the position you want to delete: ");
		        int pos =s.nextInt();
		      
		        int j=pos;
		        while(j<n){
		        	arr[j-1]=arr[j];
		        	j++;
		   }
		  
		        System.out.println("Array traverse: ");
		        for(int i=0;i<n-1;i++)
		        	System.out.print(arr[i]+" ");
			  s.close();
			}
}

