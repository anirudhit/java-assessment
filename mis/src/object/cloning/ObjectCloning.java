package object.cloning;

public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// Shallow copy. Here l2 will have reference of l1 i.e; l1 and l2 (from stack memory) will point to same object in heap memory
		Laptop l1 = new Laptop("Dell", 12, 800);
		Laptop l2 = l1;
		System.out.println("Shallow copy example: ");
		System.out.println("l1: "+l1);
		System.out.println("l2: "+l2);
		
		l1.setRam(16);
		System.out.println("After changing ram value in l1");
		System.out.println("l1: "+l1);
		System.out.println("l2: "+l2);
		
		// Deep copy
		Laptop l3 = new Laptop("Acer", 12, 800);
		Laptop l4 = new Laptop();
		l4.setBrand(l3.getBrand());
		l4.setRam(l3.getRam());
		l4.setPrice(l3.getPrice());
		System.out.println("\nDeep copy example: ");
		System.out.println("l3: "+l3);
		System.out.println("l4: "+l4);
		
		l4.setRam(8);
		System.out.println("After changing ram value in l4");
		System.out.println("l3: "+l3);
		System.out.println("l4: "+l4);
		
		// Clone functionality
		Laptop l5 = new Laptop("Apple", 8, 1100);
		Laptop l6 = (Laptop)l5.clone();
		System.out.println("\nCloning example: ");
		System.out.println("l5: "+l5);
		System.out.println("l6: "+l6);
		
		l5.setRam(12);
		System.out.println("After changing ram value in l5");
		System.out.println("l5: "+l5);
		System.out.println("l6: "+l6);
	}

}
