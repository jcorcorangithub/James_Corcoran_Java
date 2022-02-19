package myCompany;

public class ConverterIf implements Converter{
    @Override
    public String convertMonth(int number) {
        if( number < 1 || number > 12){
            System.out.println("error message");
            return "error message";
        };
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        System.out.println(months[number-1]);
        return months[number-1];
    }

    @Override
    public String convertDay(int number) {
        if( number < 1 || number > 7){
            System.out.println("error message");
            return "error message";
        };
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(days[number-1]);
        return days[number-1];
    }
};
