package ch.juventus.se.problemstofix.calc;

import java.util.List;


public class Calculations {

    private double rountToTwoDecimals(double number){
        number *= 100;
        number = Math.round(number);
        return number / 100;
    }

    public double divide (double a, double b) {
        return rountToTwoDecimals(a/b);
    }

    public Double exponential(Double value, int exponent) {
        if(value == null || value == 0d){
            return 0d;
        }

        Double result = value;

        for(int i = 1; i < exponent; i++) {
            result = result*value;
        }

        return result;
    }

    public double countTotal(List<BankAccount> accounts) {
        double total = 0;
        int i = 0;

        while (i < accounts.size()) {
            total += accounts.get(i).getBalance();
            i++;
        }

        return total;
    }

    public int countErrors (List<String> data) {
        int errorCount = 0;

        for (int i = 0; i < data.size(); i++) {
            if(data.get(i).contains("error")) {
                errorCount++;
            }
        }

        return errorCount;
    }

}
