
public abstract class Report {
	
	//private String userID;
	//private String bugID;
	private String reportTitle;
	private String reportContent;

   public Report(final String aReportTitle, final String aReportContent )
	{
		//this.userID=aUserID;
		//this.bugID=aBugID;
	   this.reportTitle=aReportTitle;
	   this.reportContent=aReportContent;
	}
   
   
	
   public String getReportTitle() {
	return reportTitle;
}



public void setReportTitle(final String reportTitle) {
	this.reportTitle = reportTitle;
}



public String getReportContent() {
	return reportContent;
}



public void setReportContent(final String reportContent) {
	this.reportContent = reportContent;
}




public void viewReportByRole(User.UserRole aRole )
   {
	   
   }
   
}
