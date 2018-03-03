package Day05;

class Dog {
    String name;
    String color;
    double weight;
    double height;

    public void protectHome(){
        System.out.println(name + " is protecting");
    }
    public void sleep(){
        System.out.println(name + " is Sleeping");
    }
}

class TestDog{
    public static void main(String args[]){
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "haha";
        dog1.color = "Yellow";
        dog1.weight = 11.11 ;
        dog1.height = 0.5;

        Dog dog3 = dog1;
        dog3.color = "White";

        System.out.println(" color " + dog1.color);
        dog2.protectHome();
    }

}
