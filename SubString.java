package polymorphism;
import java.util.*;
import java.io.*;
public class SubString {
	public static void main(String args[]) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		str=sc.nextLine();
		System.out.println(str.substring(3,13));
	}

}
