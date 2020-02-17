package finalkeyword.impl;

public class AutoMobile implements Company {
	private String companyName = " Automobile";
	@Override
	public String getCompanyName() {
		String companyDetails = parentCompany + companyName;
		return companyDetails;
	}

	@Override
	public void getCompanyLocation() {
		System.out.println("Detroit MI");
	}

}
