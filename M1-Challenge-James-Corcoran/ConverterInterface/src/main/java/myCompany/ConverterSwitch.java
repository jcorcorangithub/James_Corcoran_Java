package myCompany;

public class ConverterSwitch implements Converter{
    @Override
    public String convertMonth(int number) {
        String month = null;
        switch (number) {
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
            default: month = "error message"; break;
        };
        System.out.println(month);
        return month;
    }

    @Override
    public String convertDay(int number) {
        String day = null;
        switch (number) {
            case 1: day = "Sunday"; break;
            case 2: day = "Monday"; break;
            case 3: day = "Tuesday"; break;
            case 4: day = "Wednesday"; break;
            case 5: day = "Thursday"; break;
            case 6: day = "Friday"; break;
            case 7: day = "Saturday"; break;
            default: day = "error message";
        };
        System.out.println(day);
        return day;
    }
};
