class MethodOverriding{
    public int add(int a, int b){
        return a+b;
    }
}
public class MethodOverridingDemo extends MethodOverriding{
    public int add(int a, int b){
        return a-b;
    }
    public static void main(String[] args){
        MethodOverridingDemo obj = new MethodOverridingDemo();
        System.out.println(obj.add(10, 20));
    }
}