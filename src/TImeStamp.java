import java.text.SimpleDateFormat;
import java.util.*;

public class TImeStamp{
	public static void main(String args[]){
	  Date date= new Date();
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd:MM:yyyy hh:MM:ssss");
	String timeStamp = simpleDateFormat.format(date);
	System.out.println("Current date is: " +timeStamp);
	}
	

}