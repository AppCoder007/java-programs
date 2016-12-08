// test program

/* Dona varghese
 * Problem no: 10.1
 * Input	 :  none
 * Algorithm : long totalMillis = System.currentTimeMillis();
				long totalSeconds = totalMillis/1000;
				second =  (totalSeconds % 60);
				long totalMinute = totalSeconds/60;
				minute =  (totalMinute % 60);
				long totalHour = totalMinute/ 60;
				hour =  (totalHour % 24);
        		
        		
 * Output	 : current time = 4:45:3
				Elapsed time is 10:19:10

 */

package testTime;

public class testTime {

	public static void main(String[] args) {
		
Time time = new Time();

System.out.println("current time is "  + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());

Time time2 = new Time(555550000);
System.out.println("Elapsed time is " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());	

 
	} // end of main

}// end of TestTime Class

_________________________________________________________________________________________________


package testTime;


public class Time {
	  long hour;
	  long minute;
	  long second;

	 public Time() {
		
			long totalMillis = System.currentTimeMillis();
			long totalSeconds = totalMillis/1000;
			second =  (totalSeconds % 60);
			long totalMinute = totalSeconds/60;
			minute =  (totalMinute % 60);
			long totalHour = totalMinute/ 60;
			hour =  (totalHour % 24);
		
	 }// end of construct
	 
 public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}// end of construct
	 
	

	public Time(long elapseTime) {
		setTime(elapseTime);
		// TODO Auto-generated constructor stub
	}

	public int getHour() {
		
		return (int)hour;
	}

	
	

	public int getMinute() {
		
		return (int)minute;
	}


	

	public int getSecond() {
		
		return (int)second;
	}


	void setTime(long elapseTime){
		long totalMillis = elapseTime;
		long totalSeconds = totalMillis/1000;
		second = totalSeconds % 60;
		long totalMinute = totalSeconds/60;
		minute = totalMinute % 60;
		long totalHour = totalMinute/ 60;
		hour = totalHour % 24;

		
		 
	 }
}

_______________________________________________________________________________________________________________


// output

current time is 17:45:33
Elapsed time is 10:19:10
