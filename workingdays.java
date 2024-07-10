import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class workingdays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        LocalDate start=LocalDate.parse(str1,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String str2=sc.nextLine();
        int count=0;
        LocalDate end=LocalDate.parse(str2,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        for(LocalDate date=start; !date.isAfter(end);date=date.plusDays(1)){
            if(date.getDayOfWeek()!=DayOfWeek.SUNDAY && date.getDayOfWeek()!=DayOfWeek.SATURDAY){
                count++;
            }
        }
        System.out.println(count);
    }
}
