public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double screen1 = service.calculate(1000000, 12, 9.99);
        double screen2 = service.calculate(1000000, 24, 9.99);
        double screen3 = service.calculate(1000000, 36, 9.99);
        System.out.printf("%.0f", screen1);
        System.out.println();
        System.out.printf("%.0f", screen2);
        System.out.println();
        System.out.printf("%.0f", screen3);
        System.out.println();
    }
}
