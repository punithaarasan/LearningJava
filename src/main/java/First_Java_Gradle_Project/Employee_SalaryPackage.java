package First_Java_Gradle_Project;

public class Employee_SalaryPackage {

	public static void main(String[] args) {
		Salary_With_Bonus obj = new Salary_With_Bonus();
		obj.BasicSal= 50000;	
		obj.DA = 8000;
		obj.YrsofService = 40;
		obj.bonus_percent = 20;
		System.out.println ("The Package details for the Employee");
		System.out.println ("====================================");
		obj.Netsal_Calculate();
		System.out.print ("Net Salary : ");
		System.out.println(obj.Net_salary);
		obj.Grat_Calculate();	
		System.out.print ("Gratuity : ");
		System.out.println(obj.Grat);
		obj.Bonus_Calculate();
		System.out.print ("Salary with Bonus : ");
		System.out.println(obj.Sal_bonus);

	}

}
class Gratuity
{
	float BasicSal,Grat,Net_Sal,GS,PT,PPF,IT,YrsofService,DA;
	
	
	 public float Grat_Calculate()
	{
		 //Gratuity = (BasicSal x Dearness Allowance) x 15/26 x Number of years of service;
		 //Grat = (BasicSal*DA)*(15/26)*YrsofService;
		 Grat = (15*BasicSal*YrsofService)/26;
		 return Grat;
				
	}
}

class Net_salary extends Gratuity 			///Single Inheritence
{
	float Net_salary,GrossSal;
	public float Netsal_Calculate()
	{
		GrossSal = BasicSal+DA;
		//Net Salary = Gross Salary – Professional Tax – Public Provident Fund – Income Tax;
		Net_salary = GrossSal-200-(12%GrossSal)-(20%GrossSal);
		return Net_salary;
	}
}

class Salary_With_Bonus extends Net_salary    ///Multilevel Inheritence
{
	float bonus_percent,Sal_bonus;
	public float Bonus_Calculate()
	{
				
		Sal_bonus = GrossSal + (bonus_percent % GrossSal);
		return Sal_bonus;
	}
}
