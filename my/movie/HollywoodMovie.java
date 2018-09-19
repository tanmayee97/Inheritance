package my.movie;

public class HollywoodMovie extends Movie {

	int hollywood_id;
	public HollywoodMovie(String name,double budget,String cast_crew,float duration,int hollywood_id)
	{
		super(name,budget,cast_crew,duration);
		this.hollywood_id=hollywood_id;
		System.out.println(name);
		System.out.println(budget);
		System.out.println(cast_crew);
		System.out.println(duration);
	}
	public void start()
	{
		System.out.println("10AM");
	}
	public void stop()
	{
		System.out.println("12AM");
	}
	
}
