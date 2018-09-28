package Day12;

import java.util.Arrays;

//自定义泛型
public class ElementsGenerate<T> {

    private T[] newArray;

    public T[] getNewArray() {
        return newArray;
    }

    public void setNewArray(T[] newArray) {
        this.newArray = newArray;
    }

    public T getByIndex(int index){
        return newArray[index];
    }

    @Override
    public String toString() {
        return "ElementsGenerate{" +
                "newArray=" + Arrays.toString(newArray) +
                '}';
    }
}
