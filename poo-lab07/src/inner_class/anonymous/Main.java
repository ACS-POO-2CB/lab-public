/**
 * UPB, ACS, POO CB 2022-2023
 * @author Gabriel Gutu-Robu
 *
 */
package inner_class.anonymous;

public class Main {

    public static void main(String[] args) {

        IDatabase mysql; // ... add your code here

        StudentManager studentManager = new StudentManager(mysql);
        studentManager.runSomeTests();
    }
}
