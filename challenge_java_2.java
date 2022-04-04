public class challenge_java_2 {
    public static void main(String[] args) {
        int baris = 6;
        for (int i=0; i<baris; i++){
            for (int j=0; j<=i; j++)
            System.out.print("*");
            System.out.println();
        }
        for (int i=0; i<baris; i++){
            for (int j=5; j>=i; j--)
            System.out.print("*");
            System.out.println();
        }
            
    }
    
}
