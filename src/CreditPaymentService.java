public class CreditPaymentService {
    public double calculate(double sum, double mon, double rate) {
        double rateMon = rate / 12 / 100;  //Ставка в месяц
        double result = ((rateMon * Math.pow(rateMon + 1, mon)) / (Math.pow(rateMon + 1, mon) - 1)) * sum;
        return result;
    }
}
