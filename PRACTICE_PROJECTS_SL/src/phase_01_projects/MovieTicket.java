package phase_01_projects;


import java.util.*;

public class MovieTicket {
	
	static int count=0; 
	static int times=1;
	static int timecount=0;
	static int daycount=0;
	//creating the rows from A to E (Five rows)
	static LinkedList<Integer> A = new LinkedList<Integer>();
	static LinkedList<Integer> B = new LinkedList<Integer>();
	static LinkedList<Integer> C = new LinkedList<Integer>();
	static LinkedList<Integer> D = new LinkedList<Integer>();
	static LinkedList<Integer> E = new LinkedList<Integer>();
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Are you the Customer or an Admin of the Front Desk ");
		System.out.println("If you are Admin then type 'Y' otherwise type 'N':");
		   //Taking character input from the user
		Scanner sc=new Scanner(System.in);
		char i=sc.next().charAt(0);
		if(i=='y' || i=='Y')
		{
			System.out.println("Do you want to change the password, if YES then type Y else type N");
			char c= sc.next().charAt(0);
			if(c=='y' || c=='Y'){
				System.out.println("Please enter new password:");
				String PW=sc.next();
				System.out.println("The password has been changed successfully...");
			}
			if(c=='n' || c=='N')
				System.out.println("Exited...");
		}
		for(int c=0;c<10;c++)
		{
			A.add(0);
			B.add(0);
			C.add(0);
			D.add(0);
			E.add(0);
		}
		bookingProcess();
	
}

private static void bookingProcess(){
		String[] opt={"1. Select the date",
        "2. select the show time",
        "3. select the row and seat number",
        "4. Exit  "}; 
	//displaying all the available options 
	for(int j=0;j<4;j++)
		System.out.println(opt[j]);
	 Scanner input =new Scanner(System.in);
	 System.out.println("\nEnter your choice: ");
     int option=input.nextInt();
     switch (option){
     case 1:
           System.out.println("Enter the date from the below list of options:");
           System.out.println("1. 16-08-22\n2. 17-08-22\n3. 18-08-22");
           String d=input.next();
           System.out.println("The selected date is : "+d);
           daycount++;
           if(daycount>1){
        	   for(int c=0;c<10;c++)
				{
        		   A.set(c,0);
        		   B.set(c,0);
        		   C.set(c,0);
        		   C.set(c,0);
        		   C.set(c,0);
				}
        	   count=0;
           }
           
           bookingProcess();
           break;
     case 2:
           System.out.println("Available show timings are: \n");
           System.out.println("1. 9:00AM-12:00PM (Morning Show)\n2. 1:00PM-5:00PM (Matinee Show)\n3. 6:00PM-9:00PM (First Show)\n4. 9:15PM-12:00AM (Second Show)");
           String t=input.next();		           
           System.out.println("The selected show time is: "+t);
           timecount++;
           if(timecount>1){
        	   for(int c=0;c<10;c++)
				{
        		   A.set(c,0);
        		   B.set(c,0);
        		   C.set(c,0);
        		   C.set(c,0);
        		   C.set(c,0);
				}
        	   count=0;
           }
           
           
           bookingProcess();
           break;
     case 3:
    	   
           System.out.println("Choose the rows from A to E");
           char r=input.next().charAt(0);
           System.out.println("User: You have selected "+r+" row\n");
    	   System.out.println("Please select the seat number from 1 to 10");
    	   int s=input.nextInt();
    	   System.out.println("User:You have selected seat number "+s);
    	   rowFilling(r,s);
    	   if(times==1){
    
    		   System.out.println("Closing your booking process... \nThank you!!!");
    	   }
    	   break;
     case 4:
    	   System.out.println("Thank you!!!");
    	   break;
     default:
           System.out.println("You have selected an invalid option!");
           break;
     }
    
}
     
           

private static void rowFilling(char row,int seat){
 
 char A1;
 int c=0;
 do{
	 
	 c++;
	 if(c>1){
	 bookingProcess();
	 times++;
	 break;
	 }
 if(row=='A'){
	 if(A.get(seat-1)==0){
	 System.out.println("Available..");
	 A.set(seat-1, 1);
	 System.out.println("Seats information of row A: "+A);
	 count++;
	 
	 System.out.println("Total Payment: "+count*250);
	 System.out.println("Your seat is booked...");
	 
	 
	 }
	 else
		 System.out.println("Already filled: Choose another seat in A row");
 }
 if(row=='B'){
	 if(B.get(seat-1)==0){
	 System.out.println("Available..");
	 B.set(seat-1, 1);
	 System.out.println("Seats information of row B: "+B);
	 count++;
	 System.out.println("Total Payment: "+count*250);
	 System.out.println("Your seat is booked..."); 
	 }
	 else
		 System.out.println("Already filled: Choose another seat in B row");
 }
 if(row=='C'){
	 if(C.get(seat-1)==0){
	 System.out.println("Available..");
	 C.set(seat-1, 1);
	 System.out.println("Seats information of row C: "+C);
	 count++;
	 System.out.println("Total Payment: "+count*250);
	 System.out.println("Your seat is booked...");
	 
	 }
	 else
		 System.out.println("Already filled: Choose another seat in C row");
 }
 if(row=='D'){
	 if(D.get(seat-1)==0){
	 System.out.println("Available..");
	 D.set(seat-1, 1);
	 System.out.println("Seats information of row D: "+D);
	 count++;
	 
	 System.out.println("Total Payment: "+count*250);
	 System.out.println("Your seat is booked...");
	 
	 
	 }
	 else
		 System.out.println("Already filled: Choose another seat in D row");
 }
 if(row=='E'){
	 if(E.get(seat-1)==0){
	 System.out.println("Available..");
	 E.set(seat-1, 1);
	 System.out.println("Seats information of row E: "+E);
	 count++;
	 
	 System.out.println("Total Payment: "+count*250);
	 System.out.println("Your seat is booked...");
	 
	 
	 }
	 else
		 System.out.println("Already filled: Choose another seat in E row");
 }
 System.out.println("If you want to book another seat then type 'Y' else type 'N'");
 Scanner W=new Scanner(System.in);
 A1=W.next().charAt(0);

 }
 while(A1=='y' || A1=='Y');
 
		
        }
}

