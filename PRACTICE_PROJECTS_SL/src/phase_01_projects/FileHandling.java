package phase_01_projects;

import java.util.*;
import java.io.*;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		try{
			
			//Creates the empty file if not exists
			//The Boolean parameter is set as TRUE because it append the content into the file
			FileWriter fw = new FileWriter("C://Users//ABHISHEK BANOTH//Documents//JAVA SL//File_Handling.txt",true);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the contet into the your file:");
			//Write the content you want to store in the given file
			s = sc.nextLine();
			fw.write(s);
			fw.close();
			
			//Read the content from the file
			FileReader fr = new FileReader("C://Users//ABHISHEK BANOTH//Documents//JAVA SL//File_Handling.txt");
			char  c[] = new char[65];
			fr.read(c);
			System.out.println(c);
			System.out.println("The above content is present in your file.");
			fr.close();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}

	}

}
