
public class reservation {
	
	  private int dateArrive;  
	  private int dateDepart;  
	  
		public reservation() {}  
		public reservation(int dateArrive, int dateDepart) {  
			this.dateArrive = dateArrive;                                                          
		     this.dateDepart = dateDepart;
		}
		public int getDateArrive() {
			return dateArrive;
		}
		public void setDateArrive(int dateArrive) {
			this.dateArrive = dateArrive;
		}
		public int getDateDepart() {
			return dateDepart;
		}
		public void setDateDepart(int dateDepart) {
			this.dateDepart = dateDepart;
		} 


}


