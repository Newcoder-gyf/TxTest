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

        int idValue = this.id - o.id;
        if(idValue == 0){
            int ageValue = this.age - o.age;
            if(ageValue == 0){
                int nameValue = this.name.compareTo(o.name);
                if(this.name != null && o.name !=null){
                    if(nameValue == 0){
                        return 0;
                    }
                }
            }
        }
        return -1;
    }
}
