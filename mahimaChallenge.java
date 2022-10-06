public class mahimaChallenge {
    public static void main(String[] args) {
        System.out.println("Butterfly using asterisks!");
        char[][] arr = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" ");
                if(i == j){
                    arr[i][j] = '*';
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
}
