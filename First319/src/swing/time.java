package swing;

public class time {
	private int hours;
	private int minutes;
	private int seconds;
	
	public void setTime(int h, int min, int sec){
		hours = ((h >= 0 && h<24) ? h : 0);
		minutes = ((min >= 0 && min < 60) ? h : 0);
		seconds = ((sec >= 0 && sec < 60) ? sec : 0);	
	}
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}
	
	public String regularTime(){
		return String.format("%d:%02d:%02d %s", ((hours == 0 || hours==12)? 12 : (hours % 12)),
				minutes, seconds, ((hours > 11) ? "pm" : "am"));
	}
}
