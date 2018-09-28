package Day13;

public class ComparableStudentTest {

    public static void main(String[] args) {

        ComparableStudent comparableStudent01 = new ComparableStudent(1, "Yang", 20);
        ComparableStudent comparableStudent02 = new ComparableStudent(1, "Yang", 20);
        ComparableStudent comparableStudent03 = new ComparableStudent(2, "Yang", 20);
        ComparableStudent comparableStudent04 = new ComparableStudent(1, "Yang", 21);
        ComparableStudent comparableStudent05 = new ComparableStudent(1, "Gao", 20);


        int isCompared01_02 = comparableStudent01.compareTo(comparableStudent02);
        compareResult(isCompared01_02);

        int isCompared01_03 = comparableStudent01.compareTo(comparableStudent03);
        compareResult(isCompared01_03);

        int isCompared01_04 = comparableStudent01.compareTo(comparableStudent04);
        compareResult(isCompared01_04);

        int isCompared01_05 = comparableStudent01.compareTo(comparableStudent05);
        compareResult(isCompared01_05);

    }

    private static void compareResult(int value){
        System.out.println(value == 0? "comparableStudent01 is equal to comparableStudent02": value == -1? "comparableStudent01 is former": "comparableStudent02 is former");
    }

}




