package doctorExample;

public class Hospital {

	public static void main(String[] args) {
		
		Surgeon s = new Surgeon();
		
		//method from Surgeon class
		s.getDoctorDetails();
		
		//overridden method
		s.getSurgeonDetails();
		
		Doctor d = new Surgeon();
		d.getDoctorDetails();
		
		Doctor doc = new Doctor();
		doc.getDoctorDetails();

//		this will not work due private fields in Doctor class
//		doc.name = "Sam";
		
		//setter example
		doc.setName("Sam");
		
		//getter example
		System.out.println(doc.getName());
		
		//call method with parameter
		System.out.println(doc.getInfo("Tom"));
	}

}
