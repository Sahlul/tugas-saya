import java.util.Scanner;

public class challenge_java_1 {
    static int nilai;
    static String stat;
    public static void main(String[] args) {
        System.out.print("Masukkan nilai angka: ");
        Scanner sc = new Scanner(System.in);
        nilai = sc.nextInt();
        if (nilai>=90 & nilai <= 100){
            stat = "Grade A";
        } else if (nilai >= 80 & nilai <= 89){
            stat = "Grade B";
        } else if (nilai >= 70 & nilai <= 79){
            stat = "Grade c";
        } else if (nilai >= 60 & nilai <= 69){
            stat = "Grade D";
        } else if (nilai >= 0 & nilai <= 59){
            stat = "Grade E";
        } else{
            stat = "Error";
        }

        if (stat == "Error"){
            System.out.println("Masukkan nilai dari angka 0 - 100");
        } else {
            System.out.println("Nilai huruf: " + stat);
        }
    }
    
}
