import java.io.*;
import javax.swing.*;

public class scooter extends owner { 
    public static final double tGroesse=8.4;
    public static double tInhalt=8.4;
    public static double kStand=2352;
    
    public static void fahre() {
        kStand++;
        tInhalt=tInhalt-0.1;
        if(tInhalt < 1) {
            System.out.println("Fahren nicht möglich. Bitte tanken!");
        }
    }
    
    public void tanken() {
        if(tInhalt >= 8.4 ) {
            System.out.println("Der Tank ist bereits voll.");
        }
        while(tInhalt < 8.4) {
            tInhalt++;
            owner.Money--;
        }
    }
}