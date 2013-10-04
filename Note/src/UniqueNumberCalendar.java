import java.util.Calendar;


public class UniqueNumberCalendar {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();  
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND));
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(c.get(Calendar.YEAR))
		  .append(c.get(Calendar.MONTH) + 1)
		  .append(c.get(Calendar.DATE))
		  .append(c.get(Calendar.HOUR_OF_DAY))
		  .append(c.get(Calendar.MINUTE))
		  .append(c.get(Calendar.SECOND))
		  .append(c.get(Calendar.MILLISECOND));
		
		System.out.println(sb.toString());	
	}
}
