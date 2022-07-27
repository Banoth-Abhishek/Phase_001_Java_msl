package phase_01_projects;

import java.util.Scanner;

public class EmailValidation_01 {
	
int count;
	
	public void search(String str,String arr[]){
		for(int i=0;i<arr.length;i++){
			if(str.equals(arr[i]))
				count++;		
		}
		if(count==1)
			System.out.println("The email_id is present in the array");
		else
			System.out.println("The email_id is not present in the array");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub        
				String arr[]=new String[5];
				arr[0]="Emp123@gmail.com";
				arr[1]="Emp456@Godaddy.com";
				arr[2]="Emp745@yahoocom";
				arr[3]="Emp789@gmail.com";
				arr[4]="Emp786@gmail.com";
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the email-id you want to search: ");
				String s;
				s=sc.next();
				EmailValidation_01 ob=new EmailValidation_01();
				ob.search(s,arr);
	}

}
