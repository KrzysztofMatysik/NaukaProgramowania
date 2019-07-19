import java.util.Scanner;

public class StringBuilderTest {

    private Scanner inputData = new Scanner(System.in);
    private int numberTest;
    private String stringVariable = "";
    private StringBuilderTest builderVariable;

    public int getNumberTest() {
        return numberTest;
    }

    void NumberOfTests() {
        System.out.print("Enter the number of repetitions: ");
        numberTest = inputData.nextInt();
    }


    void testString() {
        long a = System.currentTimeMillis();
        for (int i = 0; i < numberTest; i++) {
        }
    }

    public static void main(String[] args) {
        StringBuilderTest stringBuilderTest = new StringBuilderTest();
        stringBuilderTest.NumberOfTests();
        System.out.println(stringBuilderTest.getNumberTest());
    }

}
