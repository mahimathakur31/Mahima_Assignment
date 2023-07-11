package pack1;

import java.time.Month;
import java.time.YearMonth;

public class CurrentYear {
    public static void main(String[] args) {
        
        Month currentMonth = YearMonth.now().getMonth();

        
        int monthValue = currentMonth.getValue();
        int monthLength = currentMonth.length(false);
        int maxMonthLength = currentMonth.maxLength();

        
        Month firstMonthOfQuarter = currentMonth.firstMonthOfQuarter();

        
        System.out.println("Integer value of the current month: " + monthValue);
        System.out.println("Length of the month: " + monthLength);
        System.out.println("Maximum length of the month: " + maxMonthLength);
        System.out.println("First month of the Quarter: " + firstMonthOfQuarter);
    }
}

