import java.util.Date;  

public class reservation {
	
	  private Date dateArrive;  
	  private Date dateDepart;  
	  
		public reservation() {}  
		public reservation(Date dateArrive, Date dateDepart) {  
			this.dateArrive = dateArrive;                                                          
		     this.dateDepart = dateDepart;
		}
		public Date getDateArrive() {
			return dateArrive;
		}
		public void setDateArrive(Date dateArrive) {
			this.dateArrive = dateArrive;
		}
		public Date getDateDepart() {
			return dateDepart;
		}
		public void setDateDepart(Date dateDepart) {
			this.dateDepart = dateDepart;
		} 


}


