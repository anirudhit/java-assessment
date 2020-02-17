package string.handling;

public class StringHandling {

	public static void main(String[] args)throws java.lang.Exception {
		// This will be stored in the string pool
		String str1 = "Anirudh";
		String str2 = "Anirudh";
		
		System.out.println("Display str1 and str2: ");
		str1.concat("Bellamkonda");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("Address of str1 and str2: ");
		System.out.println(Integer.toHexString(str1.hashCode()));
		System.out.println(Integer.toHexString(str2.hashCode()));
		
		// This will be stored in the heap memory
		String st1 = new String("Abhijith");
		String st2 = new String("Anirudh");
		
		System.out.println("Display st1 and st2: ");
		System.out.println(st1);
		System.out.println(st2);
		
		System.out.println("Address of st1 and st2: ");
		System.out.println(Integer.toHexString(st1.hashCode()));
		System.out.println(Integer.toHexString(st2.hashCode()));
		
		//String buffer
		StringBuffer sb1;
		sb1 = new StringBuffer("Anirudh");
		System.out.println(sb1);
		System.out.println(Integer.toHexString(sb1.hashCode()));
		sb1.append(" Bellamkonda");
		System.out.println(sb1);
		System.out.println(Integer.toHexString(sb1.hashCode()));
		
		StringBuffer sb2 = new StringBuffer("Anirudh");
		System.out.println(sb2);
		System.out.println(Integer.toHexString(sb2.hashCode()));
		
		sb2.deleteCharAt(0);
		System.out.println(sb2);
		
		//String builder
		StringBuilder sbd1 = new StringBuilder("Bellamkonda");
		System.out.println(sbd1.toString().toLowerCase());
		System.out.println(sbd1.length());
		
		// Equality check
		String ss1 = "Ani";
		String ss2 = "Ani";
		System.out.println("Equality check 1: ");
		System.out.println(ss1 == ss2);
		
		String ss3 = new String("Ani");
		String ss4 = new String("Ani");
		System.out.println("Equality check 2: ");
		System.out.println(ss3 == ss4);
		
		System.out.println("Equality check 3: ");
		System.out.println(ss2 == ss3);
		
		// Used intern to map ss5 from heap memory to String pool
		String ss5 = new String("Ani").intern();
		System.out.println("Equality check 4: ");
		System.out.println(ss2 == ss5);
		
		System.out.println("Equality check 5: ");
		System.out.println(ss3 == ss5);
		
	}

}
