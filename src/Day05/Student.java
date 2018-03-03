package Day05;

class Student {

    private String name;
    private char gender;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void study(){
        System.out.println(this.name + " is study");
    }

    public void  introduce(){
        System.out.println(" My name is: " + this.name + " My gender is: " + this.gender );
    }
}

class TestStudent{
    public static void main(String args[]){
         Student Yang = new Student();
         Yang.setName("Yang");
         Yang.setGender('M' );
         Yang.setAge(20);
         String nameY = Yang.getName();
         Yang.introduce();
         System.out.println(nameY);
    }
}
