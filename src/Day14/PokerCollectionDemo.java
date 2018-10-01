package Day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 一副扑克牌
 * 属性： 扑克张数，扑克花色数，扑克牌object
 * */
public class PokerCollectionDemo {

    private int pokerCount;
    private int colorCount;
    private ArrayList<PokerDemo> pokerCollection;

    public PokerCollectionDemo() {
    }

    public PokerCollectionDemo(int pokerCount, int colorCount, ArrayList<PokerDemo> pokerCollection) {
        this.pokerCount = pokerCount;
        this.colorCount = colorCount;
        this.pokerCollection = pokerCollection;
    }

    @Override
    public String toString() {
        return "PokerCollectionDemo{" +
                "pokerCount=" + pokerCount +
                ", colorCount=" + colorCount +
                ", pokerCollection=" + pokerCollection +
                '}';
    }

    public int getPokerCount() {
        return pokerCount;
    }

    public void setPokerCount(int pokerCount) {
        this.pokerCount = pokerCount;
    }

    public int getColorCount() {
        return colorCount;
    }

    public void setColorCount(int colorCount) {
        this.colorCount = colorCount;
    }

    public ArrayList<PokerDemo> getPokerCollection() {
        return pokerCollection;
    }

    public void setPokerCollection(ArrayList<PokerDemo> pokerCollection) {
        this.pokerCollection = pokerCollection;
    }




    //创建扑克牌的方法
    public ArrayList<PokerDemo> CreatePokerCollection(){
        //初始化pokerCount
        pokerCount = 54;

        //初始化colorCount
        colorCount = 5;

        //初始化扑克牌集合
        pokerCollection = new ArrayList<PokerDemo>();
        for (int color = 0; color < 5; color++){
            if (color ==0){
                pokerCollection.add(new PokerDemo(0, "Joker", 14, "big"));
                pokerCollection.add(new PokerDemo(0, "Joker", 15, "little"));
            }else{
                for (int value = 1; value <=13; value++){
                    pokerCollection.add(new PokerDemo(color, PokerMap.BuildPokerColorMap().get(color), value, PokerMap.BuildPokerValueMap().get(value)));
                }
            }
        }
        return pokerCollection;
    }

    //扑克牌洗牌方法
    public ArrayList<PokerDemo> PokerCollectionShuffle(){
        Collections.shuffle(this.pokerCollection);
        return this.pokerCollection;
    }

    //扑克牌排序方法（先按点数后按花色）
    public ArrayList<PokerDemo> PokerCollectionSort(){
        Collections.sort(this.pokerCollection);
        return this.pokerCollection;
    }

    //扑克牌分组方法（按花色分组，每组中按点数排序）
    //抽取一张扑克牌
    public PokerDemo getRandomPokerDemo(){
        Random randomNum = new Random();
        int index = randomNum.nextInt(this.pokerCount) + 1;
        return this.pokerCollection.get(index);
    }

}
