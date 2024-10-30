import java.util.Scanner;

public class RataNilai08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float totalNilai, j = 1, nilaiMhs = 0, rataNilai;

        int i = 1;
        while (i<=5) {
            totalNilai=0;
            System.out.println("Nilai Mahasiswa ke-" +i);
        for (j=1;j<=5;j++) {
            System.out.print("Nilai ke-" +j + " = ");
            nilaiMhs = sc.nextInt();
            totalNilai += nilaiMhs;
        }
        rataNilai = totalNilai/5;
        System.out.println("Rata-rata Nilai Mahasiswa ke " +i +" adalah " +rataNilai);
        i++;
    }
}
}
