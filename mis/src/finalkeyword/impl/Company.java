/*
 * The member variables declared in interface are final
 */

package finalkeyword.impl;

public interface Company {
	
	String parentCompany = "FORD";
	String getCompanyName();
	abstract void getCompanyLocation();

}
