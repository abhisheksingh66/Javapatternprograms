public class SameCharacterPattern {
    public static void main(String[] args) {
        int n =5;

        for(int i =1;i<=n;i++){
            char ch = (char)(i+64);

            for(int j =1;j<=i;j++){
                System.out.print(ch + " ");
                
            }
            System.out.println();

        }
    }
}
