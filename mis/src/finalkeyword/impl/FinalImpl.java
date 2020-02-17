package finalkeyword.impl;

public class FinalImpl {
	
	final static String companyName	= "FORD MOTORS";
	final String founder;
	
	private FinalImpl() {
		founder = "Henry Ford";
	}
	
	final void getFounder() {
		System.out.println("Founder: "+ founder);
	}
	
	public static void main(String[] args) {
		System.out.println("Company name: "+ companyName);
		
		FinalImpl fc = new FinalImpl();
		fc.getFounder();
		
		Company ford = new AutoMobile();
		System.out.println(ford.getCompanyName());
		ford.getCompanyLocation();
		
		System.out.println();
		
	}

}
