package my.run;
import my.movie.*;
public class Main
{
	public static void main(String[] args)
	{
		TollywoodMovie t=new TollywoodMovie("Arundathi",145350.32,"ABC",2.0f,1);
		t.start();
		t.stop();
		BollywoodMovie b=new BollywoodMovie("HumptySharmaKiDulhania",21988544.56,"DEF",3.0f,2);
		b.start();
		b.stop();
		HollywoodMovie h=new HollywoodMovie("IceAge",3133561.42,"XYZ",3.0f,2);
		h.start();
		h.stop();
		
	}

}
