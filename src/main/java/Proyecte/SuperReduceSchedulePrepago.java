package Proyecte;

public class SuperReduceSchedulePrepago implements IRateCalculatorBySchedule {

	private float ratePerMinute = (float) 0.70 ;

	    
	@Override
	public Float calculateRate() 
	{
		
		return ratePerMinute;
	}
	
	@Override
	public Float getRatePerMinute() {
		return ratePerMinute;
	}
	

   

	
}
