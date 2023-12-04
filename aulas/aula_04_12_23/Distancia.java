
import java.text.DecimalFormat;

public class Distacia {
    public static void main(String[] args) {
        double kmph = 0.0, mps, mph, fps;
        System.out.println("kmph\tmsp\tmph\tfps");
        DecimalFormat formato = new DecimalFormat("00.00");
        while (kmph <= 50) {
            mps = kmph * 0.2778;
            mph = kmph * 0.6214;
            fps = kmph * 0.9113;
            System.out.println(formato.format(kmph) + "\t" + formato.format(mps) + "\t" + formato.format(mph) + "\t" + formato.format(fps)) ;
            kmph += 0.5;
        }
    }
}
