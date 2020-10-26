import java.security.Timestamp;
import java.util.Date;

public class Kapitel4Demo {

    public static void main(String[] args) {

        double PI = Math.PI;

    //    Math.sin(Math.toRadians(180));

        double vinklenRadian = Math.toRadians(180);
        double sinafVinklen = Math.sin(vinklenRadian);
        double cosafVinklen = Math.cos(sinafVinklen);

        for (int i = 0; i < 100; i++) {


        long unixTime = System.currentTimeMillis();
        System.out.println(unixTime);
        }
    }
}
