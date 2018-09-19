package my.movie;

public class TollywoodMovie extends Movie
{
	
	int tollywood_id;
	
	public TollywoodMovie(String name, double budget, String cast_crew, float duration, int tollywood_id) {
		super(name,budget,cast_crew,duration);
		this.tollywood_id=tollywood_id;
System.out.println(name);
System.out.println(budget);
System.out.println(cast_crew);
System.out.println(duration);
	}



	public void start()
	{
		System.out.println("12AM");
	}
	public void stop()
	{
		System.out.println("2AM");
	}
	
}
