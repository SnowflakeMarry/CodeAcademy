package demo;

public class Dog {
	
	private String breed;
	private String size;
	private Integer age;
	private String color;
	
	
	public String getInfo() {
		return "Dog breed: " + breed + " Dog color: " + color;
	}

	public static void main(String[] args) {
		Dog maltese = new Dog();
		
		maltese.age = 11;
		maltese.size = "medium";
		maltese.breed = "maltese";
		maltese.color = "white";
		
		String res = maltese.getInfo();
		
		System.out.println(res);
		
		System.out.println(maltese.getInfo());
		
		//1. napravete main method vo nova klasa
		//2. iskucajte go kodot za Doctor i Surgeon
		//3. testirajte overriding na metodite vo Doctor i Surgeon
	}



}
