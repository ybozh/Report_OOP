package MainClasses;

public class TripReportAvance {
	
	int reportId;
	public String codeName, dateOfReport, nameOfEngineer;
	//public Payment p = new Payment(costDate, costDescription, costSum, costPayCorpCard)
	
	public TripReportAvance (int reportId, String codeName, String dateOfReport, String nameOfEngineer) {
		this.reportId = reportId;
		this.codeName = codeName;
		this.dateOfReport = dateOfReport;
		this.nameOfEngineer = nameOfEngineer;
		
	}
	
	class Payment {
		public int costId;					
		public String costDate;				//Date of payment
		public String costDescription;		//Description of payment
		public Double costSum;				//Sum of payment
		public Boolean costPayCorpCard;		// true is paid by corporate credit card
		
		Payment(int costId, String costDate, String costDescription, Double costSum, Boolean costPayCorpCard) {
			// TODO Auto-generated constructor stub
			this.costId = costId;
			this.costDate = costDate;
			this.costDescription = costDescription;
			this.costSum = costSum;
			this.costPayCorpCard = costPayCorpCard;
		}
	}
	
	public int getReportId () {
		return reportId;
	}

}
