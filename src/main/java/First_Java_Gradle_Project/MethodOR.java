package First_Java_Gradle_Project;

public class MethodOR {
	
	public void display()
	{
		System.out.println("In super Class");
	}

}
class MethodORsub extends MethodOR
{
	public void display()
	{
		System.out.println("In sub Class");
	}
}
