class AbstractDEmo{
    public static void main(String[] args) {
        Calc1 C = new ImplementCalc();
       
    }

}
abstract class Calc1 {
    abstract void calculate(int a, int b); 
    void add(int a, int b){
        System.out.println(a + b);
    }

}
class ImplementCalc extends Calc1{
    void calculate(int a , int b ){
        System.out.println(a + b);
    }

}
