


public class Calculator {
    private final int loanAmount;
    private final int years;
    public static final int MONTH =12;
    private final double monthlyInterestRate;
    private int extraMonthlyPayment;

    public Calculator(final int loanAmount, final int numberOfYears, final double interestRatePerYear, int extraMonthlyPayment){
        this.loanAmount = loanAmount;
        this.years = numberOfYears;
        this.extraMonthlyPayment = extraMonthlyPayment;
        this.monthlyInterestRate = interestRatePerYear / MONTH;
    }
    public static void CalcAndPrint(){


    }

}
