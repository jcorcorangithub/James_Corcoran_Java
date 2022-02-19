package myCompany;

public class ConverterApplication {

    public static void main(String[] args) {
        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();

        converterIf.convertDay(2);
        converterIf.convertMonth(11);
        converterSwitch.convertDay(6);
        converterSwitch.convertMonth(10);

        converterIf.convertDay(0);
        converterIf.convertMonth(13);
        converterSwitch.convertDay(0);
        converterSwitch.convertMonth(13);


    };
};

;