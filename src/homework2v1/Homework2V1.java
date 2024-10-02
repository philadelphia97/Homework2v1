package homework2v1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework2V1 {
	
	static Scanner get = new Scanner(System.in);
	static String input = "";
	static int Answer = 0;
	static int Age = 0; 
	static DecimalFormat DF = new DecimalFormat("####0.00");


	public static void main(String[] args) {
		
		//declarations
		String FirstName = ""; 
		String LastName = ""; 
		String DetermineRisk = "";
		String WeightString = "";
		int WeightClass = 0;
		int Age = 0;
		double Lbs = 0.00;
		double Inches = 0.00;
		double HeartRate = 0.00;
		double BMI  = 0.00;
	
		// TODO Auto-generated method stub
		System.out.println("Hello, welcome to the BMI calvulator 3000!");
		ContinueProgram();
		while(Answer == 1) {
		FirstName = GetFirstName();
		LastName = GetLastName();
		Age = GetAge();
		Lbs = GetWeightInLbs();
		Inches = GetInches();
		HeartRate = GetHeartRate();
		BMI = BMICalculator(Lbs, Inches);
		WeightClass = DetermineStatus(BMI);
		WeightString = WeightStringify(WeightClass);
		DetermineRisk = CardiovascularRisk(HeartRate, WeightClass);
		Recipt(FirstName, LastName, Age, Lbs, Inches ,HeartRate, BMI, WeightString, DetermineRisk);
		ContinueProgram();
		}
		System.out.println("Thanks for using the program");

	}//end main
	
//==================CONTINUE PROGRAM METHOD===================
	
	public static void  ContinueProgram() {
		System.out.println("Would you like to continue on with the program\n1 for yes \n2 for no ");
		input = get.nextLine();
		Answer = Integer.parseInt(input);
		while(Answer != 1 && Answer != 2) {
		System.out.println("Please enter\n1 for yes \n2 for no ");
			input = get.nextLine();
			Answer = Integer.parseInt(input);
				}
			}
			
//===============END CONTINUE PROGRAM METHOD===================
	
	
//==================GET FIRST NAME METHOD===================
	
	public static String GetFirstName() {
		String FirstName = "";
		System.out.println("Please tell us your first name");
		FirstName = get.nextLine();
		return FirstName;
	}
	
//===============END GET FIRST NAME METHOD===================
	
//==================GET LAST NAME METHOD===================
	
	public static String GetLastName() {
		String LastName = "";
		System.out.println("Please tell us your last name");
		LastName = get.nextLine();
		return LastName;
	}
		
//===============END GET LAST NAME METHOD===================
		
//==================GET AGE METHOD===================
		
	public static int GetAge() {
		int Age = 0;
		System.out.println("Please tell us your age:");
		input = get.nextLine();
		Age = Integer.parseInt(input);
		return Age;
	
	}
//===============END GET AGE METHOD===================
	
//==================GET AGE METHOD===================
	
	public static double GetWeightInLbs() {
		double Lbs = 0.00;
		System.out.println("Please tell us your weight :");
		input = get.nextLine();
		Lbs = Double.parseDouble(input);
		return Lbs;
	
	}
//===============END GET AGE METHOD===================
	
//==================GET AGE METHOD===================
	
	public static double GetInches() {
		double Inches = 0.00;
		System.out.println("Please tell us your Height In Inches :");
		input = get.nextLine();
		Inches = Double.parseDouble(input);
		return Inches;
	
	}
//===============END GET AGE METHOD===================
	
//==================GET AGE METHOD===================
	
	public static double GetHeartRate() {
		double HeartRate = 0.00;
		System.out.println("Please tell us your Heart Rate :");
		input = get.nextLine();
		HeartRate = Double.parseDouble(input);
		return HeartRate;
		
	}
//===============END GET AGE METHOD===================
	
//==================BMI CALC METHOD===================
	
	public static double BMICalculator(double Lbs, double Inches) {
		double BMI = ((Lbs / (Inches * Inches)) * 703);
		return BMI;
			
	}
//===============END BMI CALC METHOD===================
	
//==================DETERMINE STATUS METHOD===================
	
	public static int DetermineStatus(double BMI) {
		int WeightClass = 0;
		if (BMI < 18.5) {
			WeightClass = 0;
			System.out.println("You are underweight");
		} if (BMI >= 18.5 && BMI < 25) {
			WeightClass = 1;
			System.out.println("You are healthy");
		} if (BMI >= 25 && BMI < 30) {
			WeightClass = 2;
			System.out.println("You are overweight");
		} if (BMI >= 30) {
			WeightClass = 3;
			System.out.println("You are obese");
		}
		return WeightClass;
				
	}
//===============END DETERMINE STATUS METHOD===================
	
//==================DETERMINE STATUS METHOD===================
	
	public static String WeightStringify(int WeightClass) {
		String WeightString = "";
		if(WeightClass == 0) {
			WeightString = "Underweight";
		} else if(WeightClass == 1) {
			WeightString = "Healthy";
		} else if(WeightClass == 2) {
			WeightString = "Overweight";
		} else if(WeightClass == 3) {
			WeightString = "Obese";
		} 
		return WeightString; 
		
	}
//===============END DETERMINE STATUS METHOD===================
	
//==================CARDIOVASCULAR RISK METHOD===================
	
	public static String CardiovascularRisk(double HeartRate, int WeightClass) {
		String DetermineRisk = "";
		if (WeightClass == 0 && HeartRate <= 78.0) {
			DetermineRisk = "Low or no risk";
		}  else if (WeightClass == 1 && HeartRate <= 81.0) {
			DetermineRisk = "Low or no risk";
		} else if (WeightClass == 2 && HeartRate <= 76.0) {
			DetermineRisk = "Low or no risk";
		}  else if (WeightClass == 3 && HeartRate <= 84.6) {
			DetermineRisk = "Low or no risk";
		} else {
			DetermineRisk = "Risk is High";
		}
		return DetermineRisk;
					
	}
//===============END CARDIOVASCULAR RISK METHOD===================
	
//==================CARDIOVASCULAR RISK METHOD===================
	
	public static void Recipt(String FirstName, String LastName, int Age,double Lbs,double Inches,double HeartRate, double BMI, String WeightString,String DetermineRisk ) {
		System.out.println("Patient : " + FirstName + " " + LastName);
		System.out.println("Age : " + Age);
		System.out.println("Weight : " + DF.format(Lbs));
		System.out.println("Height : " + DF.format(Inches));
		System.out.println("Heart Rate : " + DF.format(HeartRate));
		System.out.println("BMI : " + DF.format(BMI));
		System.out.println("Weight Class : " + WeightString);
		System.out.println("Disease Risk : " + DetermineRisk);
						
	}
	//===============END CARDIOVASCULAR RISK METHOD===================


}
//end class

