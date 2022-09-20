package collection;

public class Dog {
	String breed;
	String size;
	int age;
	String color;
	//method 1
	public String getInfo() {
		return ("Breed is:"+breed+"Size is:"+size+"Age is:"+age+"Color is:"+color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog maltese=new Dog();
		maltese.breed="Maltese";
		maltese.size="Small";
		maltese.age=2;
		maltese.color="white";
		System.out.println(maltese.getInfo());
	}

}
