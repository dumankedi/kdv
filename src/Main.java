import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double para,kdv=0.18,kdvTutar,sonuc;
        System.out.print("Ücreti Giriniz: ");
        para= input.nextDouble();
        kdvTutar=para*kdv;
        System.out.println("KDV Tutarı: "+kdvTutar);
        sonuc=kdvTutar+para;
        System.out.println("KDV Tutar: "+sonuc);
        System.out.println("KDV'siz Turar: "+para);
    }
}