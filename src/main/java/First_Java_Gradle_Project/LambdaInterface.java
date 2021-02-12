package First_Java_Gradle_Project;

interface lambda
{
	void show();
}

public class LambdaInterface {
	
	public static void main(String [] args)
	{
		lambda obj = () -> System.out.println("In show");
		obj.show();
	}

}
