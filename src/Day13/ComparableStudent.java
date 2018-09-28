package Day13;

public class ComparableStudent implements Comparable<ComparableStudent> {

    private int id;
    private String name;
    private int age;

    public ComparableStudent() {
    }

    public ComparableStudent(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ComparableStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 实现比较两个Student对象
     * 比较规则：
     *  先比较id： 按id升序排列
     *  如果id相同，比较age：按age升序排列
     *  如果id，age相同， 比较name：按String比较方法比较
     * */
    @Override
    public int compareTo(ComparableStudent o) {

        int value = this.id - o.id;
        if(value == 0){
            value = this.age - o.age;
            if(value == 0){
                value = this.name.compareTo(o.name);
                if(this.name != null && o.name !=null){
                    if(value == 0){
                        return 0;
                    }
                }
            }
        }
        return value;
    }
}
