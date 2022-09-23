class A{
    int data = 50;
    static int m = 100;
    public static void main(String[] args) {
        A a1 = new A();
        int n = 90;
        System.out.println("Local variable ="+n);
        System.out.println("Instance variable ="+a1.data);
        System.out.println("Static variable ="+m);
    }
}