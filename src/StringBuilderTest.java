import java.util.Scanner;

public class StringBuilderTest {

    private Scanner inputData = new Scanner(System.in);
    private int numberTest;
    private String stringVariable = "";
    private StringBuilder builderVariable = new StringBuilder();

    public int getNumberTest() {
        return numberTest;
    }

    void NumberOfTests() {
        System.out.print("Enter the number of repetitions: ");
        numberTest = inputData.nextInt();
    }

    void testString() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < numberTest; i++) {
            stringVariable+="a";
        }

        long end = (System.currentTimeMillis() - start)/1000;
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        testTime(name,numberTest,end);
    }

    void testStringBuilder(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < numberTest; i++) {
            builderVariable.append("a");
        }

        long end = (System.currentTimeMillis() - start);
        String name = new Object(){}.getClass().getEnclosingMethod().getName();
        testTime(name,numberTest,end);
        testString();
    }

    void testTime(String name,int numberTest,long time){

        System.out.printf("W funkcji %s, przy %d dodanych znaków, czas wykonania operacji był równy %d ms. \n",name,numberTest,time);
    }

    void conclusions(){

        // W zależności w jakiej koejności zostają puszczone testy. testy należy wykonywać osobno.
    }

    public static void main(String[] args) {
        StringBuilderTest stringBuilderTest = new StringBuilderTest();
        stringBuilderTest.NumberOfTests();
//        System.out.println(stringBuilderTest.getNumberTest());
        stringBuilderTest.testStringBuilder();
    }

}
