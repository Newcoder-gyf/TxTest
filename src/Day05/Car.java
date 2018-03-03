package Day05;

class Car {

    int carNo;
    String name;
    String color;

    public void run(){
        //System.out.println(name + " is Running");
        System.out.println("run-------"+this.name  );
    }

    public void introduce(){
        System.out.println(" This is " + this.name+ " Color is "+ this.color +" No. is "+ this.carNo);
    }
}

class TestCar{
    public static void main(String args[]){
        Car car1 = new Car();
        car1.carNo = 8888;
        car1.name = "New Car";
        car1.color = "Yellow";
        System.out.println("main------" + car1.name);
        car1.run();
        car1.introduce();
    }

}
