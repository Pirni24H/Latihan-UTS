import java.util.Scanner;

public class Gajiupah{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Masukan gaji Bulanan : ");
        double gajiBulanan = scanner.nextDouble();

        System.out.print("Masukan jam lembur : ");
        int jamlembur = scanner.nextInt();

        double upahLemburPerjam = (gajiBulanan / 173);
        double totalUpahLembur;

        if (jamlembur > 4) {
            totalUpahLembur = (4 * upahLemburPerjam) + ((jamlembur - 4) * 2 * upahLemburPerjam);
        }else {
            totalUpahLembur = jamlembur * upahLemburPerjam;
        }
        double totalgaji = jamlembur + upahLemburPerjam;

        System.out.println("Upah Lembur Per Jam : " + (int) totalUpahLembur);
        System.out.println("Total gaji : " + (int) totalgaji);
        scanner.close();
    }

}