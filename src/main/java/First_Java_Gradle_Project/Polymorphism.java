package First_Java_Gradle_Project;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method Overloading
		MethodOL OL = new MethodOL();
		OL.show();
		OL.show("Punitha");
		OL.show("Punitha",8365974);
		
		//Method Overriding
		MethodOR OR = new MethodOR();
		OR.display();
		
		MethodORsub ORs = new MethodORsub();
		ORs.display();
	}

}
