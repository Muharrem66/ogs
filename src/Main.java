import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Otomobil Ogs Geçiş için 1\n"
                +"Minübüs Ogs Geçiş için 2\n"
                + "Otobüs Ogs Geçiş için 3\n"
                + "Kaçak Geçiş için 4\n "
                +  "e' Basınız");
        int x = scanner.nextInt();
        switch (x){
            case 1: double n;
            Otomobil otomobil = new Otomobil();
            otomobil.aracadi();
                System.out.println("BWM 632 Plakalı Araç");
                n = scanner.nextDouble();
                otomobil.alınanogsfiyati(n);
                System.out.println("Alınan Ogs Ücreti = " + otomobil.alınanogsfiyati);
                break;
            case 2:{
                Minibus minibus = new Minibus();
                minibus.aracadi();
                System.out.println("BMC 123 Plakalı Araç");
                n = scanner.nextDouble();
                minibus.alınanogsfiyati(n);
                System.out.println("Alınan Ogs Ücreti = " + minibus.alınanogsfiyati);
                break;}
            case 3:{
                Otobus otobus = new Otobus();
                otobus.aracadi();
                System.out.println("Mercedes 52361 Plakalı Araç");
                n = scanner.nextDouble();
                otobus.alınanogsfiyati(n);
                System.out.println("Alınan Ogs Ücreti = " + otobus.alinanogsfiyati);
            }
            case 4:{
                KacakGecis kacakGecis = new KacakGecis();
                kacakGecis.aracadi();
                System.out.println("Sistemde Kayıtsız Araç");
                n = scanner.nextDouble();
                kacakGecis.alınanogsfiyati(n);
                System.out.println("Alınan Ceza Ücreti = " + kacakGecis.alinanceza);
            }
        }
    }
}
