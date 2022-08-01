package phase_01_projects;

import  java.util.Scanner;

public class LongestIncresingSubsequence {
	
	private  static int length(int[] a){
		int[] LIST = new int[a.length];
		int num = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++){
			LIST[i] = 1;
			for(int j=0;j<i; j++){
				if(a[i]>a[j] && LIST[i]<LIST[j]+1){
					LIST[i]  =  LIST[j]+1;
					}
			}
		    if(num<LIST[i]){
			num=LIST[i];
			}
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the number of elements for Longest Increasing Subsequence:");
		int n = sc.nextInt();
		System.out.println("Enter the array of "+n+" elements to LIST:");
		int [] a= new int[n];
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Longest Increasing Subsequence= "+length(a));

	}

}
