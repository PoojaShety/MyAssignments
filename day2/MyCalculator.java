package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		int addNumbers = obj.addNumbers(9, 10, 15);
		System.out.println("Sum is:"+addNumbers);
		int subNumbers = obj.subNumbers(10, 5);
		System.out.println("Difference is:"+subNumbers);
		double mulNumbers = obj.mulNumbers(148888,15);
		System.out.println("Product is:"+mulNumbers);
		float divNumbers = obj.divNumbers(22222, 13);
		System.out.println("The value is:"+divNumbers);
	}

}
