package my.movie;

public class BollywoodMovie extends Movie
{
	int bollywood_id;
	public BollywoodMovie(String name,double budget,String cast_crew,float duration,int bollywood_id)
	{
		super(name,budget,cast_crew,duration);
		this.bollywood_id=bollywood_id;
		System.out.println(name);
		System.out.println(budget);
		System.out.println(cast_crew);
		System.out.println(duration);
	}
	public void start()
	{
		System.out.println("3AM");
	}
	public void stop()
	{
		System.out.println("6AM");
	}

	

}
