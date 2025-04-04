import java.text.SimpleDateFormat;
import java.util.Date;
public class PrintTimeStamp {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:MM:ssss");
		String timestamp = simpleDateFormat.format(date);
		System.out.println(timestamp);
	}
}
