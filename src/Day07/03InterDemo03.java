package Day07;

interface A03 {
    public void method1();
}

interface B03{
    void method2();
}
//java 1.7 之后接口可以多继承，可以多级继承，可以多实现
interface C03 extends A03{
    void method3();
}

class C03Implement implements C03,A03,B03{
    public void method1(){
        System.out.println("------------");
    }
    public void method3(){
        System.out.println("************");
    }
    public void method2(){
        System.out.println("@@@@@@@@@@@@");
    }
}

class InterDemo03{
    public static void main(String[] args){
        C03Implement CIP1 = new C03Implement();
        CIP1.method1();
        CIP1.method3();
    }
}