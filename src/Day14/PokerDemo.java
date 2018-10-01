package Day14;

/**
 * 一张扑克牌的封装
 *
 *属性：花色值，花色符号，点数值， 点数符号
 * */
public class PokerDemo implements Comparable<PokerDemo>{

    private int pokerColor;
    private String pokerColorText;
    private int pokerValue;
    private String pokerValueText;

    public PokerDemo() {
    }

    public PokerDemo(int pokerColor, String pokerColorText, int pokerValue, String pokerValueText) {
        this.pokerColor = pokerColor;
        this.pokerColorText = pokerColorText;
        this.pokerValue = pokerValue;
        this.pokerValueText = pokerValueText;
    }

    @Override
    public String toString() {
        return  "\n"+"PokerDemo{" +
                "pokerColor=" + pokerColor +
                ", pokerColorText='" + pokerColorText + '\'' +
                ", pokerValue=" + pokerValue +
                ", pokerValueText='" + pokerValueText + '\'' +
                '}';
    }

    public int getPokerColor() {
        return pokerColor;
    }

    public void setPokerColor(int pokerColor) {
        this.pokerColor = pokerColor;
    }

    public String getPokerColorText() {
        return pokerColorText;
    }

    public void setPokerColorText(String pokerColorText) {
        this.pokerColorText = pokerColorText;
    }

    public int getPokerValue() {
        return pokerValue;
    }

    public void setPokerValue(int pokerValue) {
        this.pokerValue = pokerValue;
    }

    public String getPokerValueText() {
        return pokerValueText;
    }

    public void setPokerValueText(String pokerValueText) {
        this.pokerValueText = pokerValueText;
    }


    @Override
    public int compareTo(PokerDemo o) {
        int value = this.pokerColor - o.pokerColor;
        if (value == 0){
            value = this.pokerValue - o.pokerValue;
        }
        return value;
    }
}
