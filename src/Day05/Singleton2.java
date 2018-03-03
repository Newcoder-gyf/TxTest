package Day05;

class Singleton2 {
    private String name;
    private int number;
    private static Singleton2 s;
    private Singleton2(String name, int number){
        this.name = name;
        this.number = number;
    }
    public static String getSingleton(){
        if (s == null){
            s = new Singleton2("Yang",10);
        }
        return s.name;
    }
}

class TestSingleton2{
    public static void main(String[] args){
        String s1 = Singleton2.getSingleton();
        System.out.println(s1);

        String s2 = Singleton2.getSingleton();
        System.out.println(s2);
    }
}