public class split {
    public static void main(String[] args) {
        String s1 = "REVA_Universe_east_or_west_best";
        String [] s2 = s1.split("_", 3);
        for (String w : s2){
            System.out.println(w);
        }
    }
}