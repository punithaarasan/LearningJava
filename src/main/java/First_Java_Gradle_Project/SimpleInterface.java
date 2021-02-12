package First_Java_Gradle_Project;

interface simple
{
	void show();
}
interface simple1
{
	void display();
}
class simpleimpl implements simple,simple1
{
	public void show()
	{
		System.out.println("I am in show method");
	}
	public void display()
	{
		System.out.println("I am in display method");
	}
}
public class SimpleInterface {

	public static void main(String[] args) {
		
		simpleimpl obj = new simpleimpl();
		obj.show();
		obj.display();
		
		///or to can prevent visibility to all defined methods in simpleimpl we use reference of parent interface like below
		
		simple obj_simple = new simpleimpl();
				obj_simple.show();
				
		simple1 obj_simple1 = new simpleimpl();
				obj_simple1.display();
	}

}
