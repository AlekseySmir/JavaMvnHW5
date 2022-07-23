import ru.netology.sqr.SQRService;


public class Main {

    public static void main(String[] args) {
        SQRService calcSqr = new SQRService();
        int x = 200;
        int y = 300;
        int z = calcSqr.calcSqr(x, y);
        System.out.println(z);
    }
}
