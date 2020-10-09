public class Driver 
{
	public static void main(String[] args)
	{
		BibleBookCollection theNewTestament = new BibleBookCollection("data.dat");
		theNewTestament.display();
		
		theNewTestament.sortOnName(theNewTestament.getTheBooks());
		theNewTestament.display();
		
		theNewTestament.sortOnChapterCount(theNewTestament.getTheBooks());
		theNewTestament.display();
	}
}