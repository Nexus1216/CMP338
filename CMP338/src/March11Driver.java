
public class March11Driver {

	public static void main(String[] args) {
		Sphere s1 = new Sphere(2.0);
		Sphere s2 = new Sphere(5.0);
		
		s1.Print();
		System.out.println();
		s2.Print();
		System.out.println();
		
		Ball b1 = new Ball("Baseball",2.0);
		Ball b2 = new Ball("Basketball",5.0);
		
		b1.Print();
		System.out.println();
		b2.Print();
		System.out.println(); 
		
		Sphere s = b1;
		s.Print();
		

	}

}

