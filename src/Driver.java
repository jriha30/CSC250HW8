import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		BibleBookCollection theNewTestament = new BibleBookCollection("data.dat");
		try
		{
			BibleBook answer = theNewTestament.getFirstBookGivenSearchTerm("Jesus");
			answer.display();
		}
		catch(Exception e)
		{
			System.out.println("No Book Found");
		}
		
	}
}