package week1.day1asgnmnt;

public class TwoWheeler {
	
	// Declare variables globally
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=2021882989888L;
	boolean isPunctured=false;
	String bikeName="KTM DUKE";
	double runningKM=1500.87;
	
	public static void main(String[] args) {
	
		//create object
		TwoWheeler bikeinfo=new TwoWheeler();
		//call all the variables inside main method and print the values
		System.out.println("No of Wheels:"+bikeinfo.noOfWheels);
		System.out.println("No of Mirrors:"+bikeinfo.noOfMirrors);
		System.out.println("Chasis Number:"+bikeinfo.chassisNumber);
		System.out.println("Is the bike Punctured:"+bikeinfo.isPunctured);
		System.out.println("Bike Name:"+bikeinfo.bikeName);
		System.out.println("Running KM:"+bikeinfo.runningKM);

	}

}
