package Basic;

public class Overload {
    public static void main(String[] args){
        int[] x = new int[3];
        int[] y = x;
        y[1] = 4;
        System.out.println(x[1]);
        Car c = new Car();
        Car cc = new RedCar();

/**
 * final 可以修饰类，变量和函数，被final类修饰不可以被继承； 被final修饰的方法不能被覆盖
 */



    }
    public void add(int x, int y){

    }
    public void add(int x, int y, int z){

    }


}
class Car{

    private String type;
    /**
     * private 方法私有，子类无法知道，所以不能重写
     */
    private void noShow(){

    }

    /**
     * 可以被子类继承，可以被重写
     */
    public void show(){

    }
}

class RedCar extends Car{
    public void noShow(){

    }

    /**
     * 重写show方法
     */



}
