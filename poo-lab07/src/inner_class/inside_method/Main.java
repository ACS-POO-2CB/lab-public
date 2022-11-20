/**
 * UPB, ACS, POO CB 2022-2023
 * @author Gabriel Gutu-Robu
 *
 * YOU MAY MODIFY THIS FILE TO RUN MORE TESTS
 */
package inner_class.inside_method;

public class Main {
    public static void main(String[] args) {
        InfluenzaDetector influenzaDetector = new InfluenzaDetector();

        Mucus fluA = new Mucus(Mucus.FluType.INFLUENZA_A, .7f);
        System.out.println("==========");
        System.out.println(fluA);
        influenzaDetector.checkAllFlyTypes(fluA);

        Mucus fluB = new Mucus(Mucus.FluType.INFLUENZA_B, 22f);
        System.out.println("==========");
        System.out.println(fluB);
        influenzaDetector.checkAllFlyTypes(fluB);

        Mucus covid = new Mucus(Mucus.FluType.COVID, 0.13f);
        System.out.println("==========");
        System.out.println(covid);
        influenzaDetector.checkAllFlyTypes(covid);
    }
}