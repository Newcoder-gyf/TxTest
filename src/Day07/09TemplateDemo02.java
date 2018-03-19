package Day07;
/*
 * 抽象模版
 * （里面有三个方法 ）
 *
 * */
abstract class CalculateTimeAbstractTemplate{

    /*
     * 必须要实现的业务方法
     * */
    public abstract void doJob();

    /*
     * 定义一个可以重写也可以不重写的方法
     * */
    public void hookMethod02(){
        System.out.println("Progess is beginning");
    };

    //定义一个必须不能被重写的方法
    public final long concreteMethod02(){
        long currentTime = System.currentTimeMillis();
        return currentTime;
    }

    //模版方法
    public long templateMethod02(){
        //获得dojob 执行前的时间
        long starTime = concreteMethod02();
        doJob();
        //获得dojob 执行后的时间
        long endTime = concreteMethod02();
        return endTime - starTime;
    }
}

/*
 * 具体的模版
 * */
class concreteTemplate02 extends CalculateTimeAbstractTemplate{

    /*
     * 实现具体的业务逻辑
     * */
    public void doJob(){
        System.out.println("concrete logic");
        for(int i = 0; i < 100; i ++){
            System.out.println("The project is in progress " + i + " % ");
        }
    }
}

class TemplateDemo02{
    public static void main (String []args){
        //创建具体的模版对象
        concreteTemplate02 ct = new concreteTemplate02();
        //获得具体模版对象中的dojob运行时间
        long jobTime = ct.templateMethod02();
        System.out.println(" the Progress time is " + jobTime);
    }
}

