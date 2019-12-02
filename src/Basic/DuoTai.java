package Basic;

public class DuoTai {
    public static void main(String[] args){

        int[] arr = new int[5];
        int[] y = arr;



        Student s = new Student();
//        s.method1();
//        s.method2();
//        s.method3();

        /**
         * 父类的引用指向子类的对象
         */
        Person p = new Student();
        p.method1(); // son 1，因为子类重写父类的方法，所以输出子类的值
        p.method3(); // fu 3  子类没有重写，但是具有父类的方法，自动向上转型，所以输出父类的值
        ((Student) p).method2(); // 子类的自有方法，使用时需要进行手动向下转型




    }
}
class Person{
    void method1(){
        System.out.println("fu 1");
    }
    void method3(){
        System.out.println("fu 3");
    }
}
class Student extends Person{
    @Override
    void method1() {
        System.out.println("son 1");
    }
    int method2(){
        return 1;
    }
}