public class BibleBook extends Object
{
	private String name;
	private int number_of_chapters;
	private String summary;
	
	public BibleBook(String name, int number_of_chapters, String summary)
	{
		this.name = name;
		this.number_of_chapters = number_of_chapters;
		this.summary = summary;
	}
	
	public BibleBook(String s)
	{
		String[] parts = s.split(":");
		this.name = parts[0];
		this.number_of_chapters = Integer.parseInt(parts[1]);
		this.summary = parts[2];
	}
	
	//return true if the searchTerm is found in this books summary and false otherwise
	public boolean searchSummary(String searchTerm)
	{
		return this.summary.toLowerCase().indexOf(searchTerm.toLowerCase()) != -1;
	}
	
	public int getNumber_of_chapters() 
	{
		return number_of_chapters;
	}

	public String getSummary() 
	{
		return summary;
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setName(String newName)
	{
		if(newName.length() >= 5)
		{
			this.name = newName;
		}
	}
	
	public void display()
	{
		System.out.println(this.name + 
				"(" + this.number_of_chapters + " chapters) - " + this.summary);
	}
}