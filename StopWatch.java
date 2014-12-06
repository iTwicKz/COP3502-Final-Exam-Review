import java.util.Scanner;
public class StopWatch {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String start = input.nextLine();
		if(start.equals("GO")){
			
		}
	}
}

class TimeStamp{
	
	private long startTime;
	private long endTime;
	
	public void setTime(long startTime, long endTime) {
		
		this.startTime = startTime;
		this.endTime = endTime;
	}
		
	public long getStartTime(){
		startTime = System.currentTimeMillis();
		return startTime;
	}
	
	public long getendTime(){
		endTime = System.currentTimeMillis();
		return endTime;
	}
	
	
		
	
	
}