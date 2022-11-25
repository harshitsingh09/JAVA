public class fin {
    final int maxValue;
    Demo(){
        maxValue = 100;
    }
    void myMethod(){
        System.out.println(maxValue);
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.myMethod();
    }
}
