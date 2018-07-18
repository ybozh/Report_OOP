package MainClasses;

import java.sql.Date;

public class BusinessTrip {
	private String codeName, engineerName, city, customer;
	private Date dateOfStart, dateOfEnd;
	
	public BusinessTrip (String codeName, String engineerName, String city, String customer, Date dateOfStart, Date dateOfEnd) {
		this.codeName = codeName;
		this.city = city;
		this.engineerName = engineerName;
		this.customer = customer;
		this.dateOfStart = dateOfStart;
		this.dateOfEnd = dateOfEnd;
	}

	//getters / setters
	
}
