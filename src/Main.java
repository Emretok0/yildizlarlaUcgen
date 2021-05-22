import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        int basamakSayisi = in.nextInt();


        // Basmak sayısı: 5
        // İlk basmakta         5-1 tane boşluk ve  1 tane yıldız.
        // İkinci basamakta     5-2 tane boşluk ve  3 tane yıldız.
        // Üçüncü basamakta     5-3 tane boşluk ve  5 tane yıldız.
        // Dördüncü basamakta   5-4 tane boşluk ve  7 tane yıldız.
        // Beşinci basamakta    5-5 tane boşluk ve  9 tane yıldız.
        int ilkBosluk = basamakSayisi-1;
        int ilkYildiz = 1;
        int basamakX = basamakSayisi;
        while (basamakX>0){
            for (int i = 0; i<ilkBosluk; i++){
                System.out.print(" ");
            }
            for (int a =0; a<ilkYildiz; a++){
                System.out.print("*");
            }
            System.out.println();
            ilkBosluk--;
            ilkYildiz+=2;
            basamakX--;
        }


    }
}
