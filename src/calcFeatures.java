import java.io.IOException;
import java.util.Scanner;

public class calcFeatures {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер кредита: ");
        int loanAmount = scanner.nextInt();
        System.out.println("Введите срок кредита в годах: ");
        int numberOfYears = scanner.nextInt();
        System.out.println("Введите проценты: в месяц ");
        double annualInterestRate = scanner.nextDouble();
        System.out.println("Введите доход: ");
        int totalIncome = scanner.nextInt();
        System.out.println("Введите количество членов семьи: ");
        int numberOfFamilyMembers = scanner.nextInt();
        int extraPayment = 100;

        Calculator calculator = new Calculator(loanAmount, numberOfYears, annualInterestRate, extraPayment);
        double monthlyPayment = calculator.calcMonthlyPayment(loanAmount, annualInterestRate / 12);
        System.out.println("Monthly payment: "+monthlyPayment);
        double incomeRatio;
        switch (numberOfFamilyMembers) {
            case 1:
                incomeRatio = 0.50;
                break;
            case 2:
                incomeRatio = 0.45;
                break;
            case 3:
                incomeRatio = 0.35;
                break;
            case 4:
                incomeRatio = 0.30;
                break;
            case 5:
                incomeRatio = 0.25;
                break;
            default:
                incomeRatio = 0.0;
        }
        if (monthlyPayment / totalIncome < incomeRatio) {
            System.out.println("Кредит одобрен. Ваш  граффик платежей: ");
            calculator.calculateAndPrint();
        } else {
            System.out.println("К сожалению, Вам отказано в кредите.");
        }
    }
}

