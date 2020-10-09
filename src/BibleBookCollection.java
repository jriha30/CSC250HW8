import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BibleBookCollection 
{
	private ArrayList<BibleBook> theBooks;
	
	public BibleBookCollection()
	{
		this.theBooks = new ArrayList<BibleBook>();
	}
	public ArrayList<BibleBook> getTheBooks()
	{
		return this.theBooks;
	}
	
	public BibleBookCollection(String filename)
	{
		this();
		try
		{
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/" + filename));
			while(input.hasNext())
			{
				this.theBooks.add(new BibleBook(input.nextLine()));
			}
			input.close();
		}
		catch(Exception e) { e.printStackTrace();}
	}
	
	public void addBibleBook(BibleBook b)
	{
		this.theBooks.add(b);
	}
	
	public void addBibleBook(String colonDelimitedData)
	{
		this.theBooks.add(new BibleBook(colonDelimitedData));
	}
	
	public BibleBook getFirstBookGivenSearchTerm(String term) throws Exception
	{
		for(BibleBook aBook : this.theBooks)
		{
			if(aBook.searchSummary(term))
			{
				return aBook;
			}
		}
		throw new Exception("Term not found exception");
	}
	
	public void display()
	{
		for(BibleBook s: this.theBooks)
		{
			s.display();
		}
		System.out.println("\n\n");
	}
	public ArrayList<BibleBook> sortOnName(ArrayList<BibleBook> stringList)
	{
		int counter = 0;
		int lengthCounter = stringList.size();
		while(counter < stringList.size())
		{
			for(int i = 0; i < lengthCounter - 1; i++)
			{
				if(stringList.get(i).getName().compareToIgnoreCase(stringList.get(i + 1).getName()) >= 0)
				{
					BibleBook storedString = stringList.get(i);
					stringList.set(i, stringList.get(i + 1));
					stringList.set(i + 1, storedString);
				}
			}
			counter++;
			lengthCounter--;
		}
		return stringList;
	}
	public ArrayList<BibleBook> sortOnChapterCount(ArrayList<BibleBook> stringList)
	{
		int counter = 0;
		int lengthCounter = stringList.size();
		while(counter < stringList.size())
		{
			for(int i = 0; i < lengthCounter - 1; i++)
			{
				if(stringList.get(i).getNumber_of_chapters() >= stringList.get(i + 1).getNumber_of_chapters())
				{
					BibleBook storedString = stringList.get(i);
					stringList.set(i, stringList.get(i + 1));
					stringList.set(i + 1, storedString);
				}
			}
			counter++;
			lengthCounter--;
		}
		return stringList;
	}
}