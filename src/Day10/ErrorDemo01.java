package Day10;

public class ErrorDemo01 {
    public static void main(String[] args){
        //由于数组过大，占用内存过量，产生了OutOfMemoryError 错误
        int[] array = new int[1024*1024*1024];
    }
}
