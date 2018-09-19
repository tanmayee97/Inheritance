package my.movie;

public class Movie
{
	String name;
	double budget;
	String cast_crew;
	float duration;
	
	public void start()
	{
		System.out.println("6AM");
	}
	public void stop()
	{
		System.out.println("9AM");
	}
	public Movie(String name,double budget,String cast_crew,float duration)
	{
		this.name=name;
		this.budget=budget;
		this.cast_crew=cast_crew;
		this.duration=duration;
	}
	

}
