package myCompany;

import static java.lang.Math.round;

public class Calculator {
    ///// add
    public int add(int a, int b){
        System.out.println(""+a+" + "+b+" = "+(a+b));
        return a+b;
    };

    public double add(double a, double b){
        double answer = Math.round((a+b)*100.0)/100.0;
        System.out.println(""+a+" + "+b+" = "+answer);
        return answer;
    };

    ///// subtract
    public int subtract(int a, int b){
        System.out.println(""+a+" - "+b+" = "+(a-b));
        return a-b;
    };

    public double subtract(double a, double b){
        System.out.println(""+a+" - "+b+" = "+(a-b));
        return a-b;
    };

    ///// multiply
    public int multiply(int a, int b){
        System.out.println(""+a+" * "+b+" = "+(a*b));
        return a*b;
    };

    public double multiply(double a, double b){
        double answer = Math.round((a*b)*100.0)/100.0;
        System.out.println(""+a+" * "+b+" = "+answer);
        return answer;

    };

    ///// divide
    public double divide(int a, int b){
        double num = (double) a/b;
        double answer = Math.round(num*100.0)/100.0;
        System.out.println(""+a+" / "+b+" = "+answer);
        return answer;
    };

    public double divide(double a, double b){
        double answer = Math.round((a/b)*100.0)/100.0;
        System.out.println(""+a+" / "+b+" = "+answer);
        return answer;
    };
}
