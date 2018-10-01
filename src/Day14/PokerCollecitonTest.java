package Day14;

public class PokerCollecitonTest {

    public static void main(String[] args) {

        PokerCollectionDemo pokerCollectionTest = new PokerCollectionDemo();
        pokerCollectionTest.CreatePokerCollection();
        //System.out.println(pokerCollectionTest);
        //System.out.println("--------------------------");

        pokerCollectionTest.PokerCollectionShuffle();
        //System.out.println(pokerCollectionTest);
        //System.out.println("--------------------------");

        PokerDemo randomDemo = pokerCollectionTest.getRandomPokerDemo();
        //System.out.println(randomDemo);
        //System.out.println("--------------------------");

        pokerCollectionTest.PokerCollectionSort();
        System.out.println(pokerCollectionTest);



    }
}
