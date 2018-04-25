package Day10;

// 自定义异常
// 自定义的异常直接调用继承父类的方法（构造器 ）即可

public class StockExceptionDemo01 extends RuntimeException  {
    public StockExceptionDemo01() {
    }

    public StockExceptionDemo01(String message) {
        super(message);
    }

    public StockExceptionDemo01(String message, Throwable cause) {
        super(message, cause);
    }

    public StockExceptionDemo01(Throwable cause) {
        super(cause);
    }
}
