public class compareToExample {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "meklo";
        String s4 = "hemlo";
        String s5 = "flag";
        String s6 = "Hello";
        String s7 = "!#@%$";
        System.out.println(s1.compareTo(s2)); // 0 : there is no difference in character position
        System.out.println(s1.compareTo(s3)); // -5 : 'h' is 5 positions lower than 'm'
        System.out.println(s1.compareTo(s4)); // -1 : 'l' is 1 position lower than 'm'
        System.out.println(s1.compareTo(s5)); // 2 : 'h' is 2 positions above 'm'
        System.out.println(s1.compareTo(s6));
        System.out.println(s1.compareTo(s7));
    }
}
