import java.util.GregorianCalendar;

public class GregCalendar {
	public static void main(String[] args){
		
		
		GregorianCalendar calendar = new GregorianCalendar();		
		System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
		System.out.println("Month: " + calendar.get(GregorianCalendar.MONTH));
		System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		
		calendar.setTimeInMillis(1234567898765L);
		System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
		System.out.println("Month: " + calendar.get(GregorianCalendar.MONTH));
		System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		
	}
	
}
