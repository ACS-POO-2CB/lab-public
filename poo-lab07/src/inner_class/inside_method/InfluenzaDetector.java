/**
 * UPB, ACS, POO CB 2022-2023
 * @author Gabriel Gutu-Robu
 *
 */
package inner_class.inside_method;

public class InfluenzaDetector {

    Mucus mucus;
    static float influenzaAThreshold = 0.6f;
    static float influenzaBThreshold = 0.4f;
    static float covidThreshold = 0.7f;

    void checkAllFlyTypes(Mucus mucus) {
        this.mucus = mucus;

        class InfluenzaA {
            // ... add your code here
        }

        class InfluenzaB {
            // ... add your code here
        }

        class COVID {
            // ... add your code here
        }

        InfluenzaA fluA = new InfluenzaA(mucus);
        System.out.println(fluA.getFluName() + " result: Mucus is " + (fluA.isInfected() ? "Positive" : "either Negative or Unknown"));

        InfluenzaB fluB = new InfluenzaB(mucus);
        System.out.println(fluB.getFluName() + " result: Mucus is " + (fluB.isInfected() ? "Positive" : "either Negative or Unknown"));

        COVID covid = new COVID(mucus);
        System.out.println(covid.getFluName() + " result: Mucus is " + (covid.isInfected() ? "Positive" : "either Negative or Unknown"));

    }

}
