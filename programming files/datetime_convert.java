import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_convert {
    public static void main(String[] args) {
        //initalize dateStr
        String dateStr = "2022-03-17 10:45:30";
        //initalize formatter as a DateTimeFormatter object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       
        //initalize dateObj as a localDateTime object;
        //Missing a semi colon, syntax error
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);
       
        //initalize and define formattedDate as a string that is the formatted date
        //Missing a semi colon, syntax error
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"))

        //print out formattedDate
        System.out.println(date);
    }
}
