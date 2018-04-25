package Day10;

public class ExceptionDemo09 {
    public static void main(String[] args) {
        buyItem();
    }

    public static void buyItem(){
        int stock = 0;
        if (stock == 0){
            //我们主动抛出异常
            throw new StockExceptionDemo01("There is not enough stock in shop");
        }
    }
}
