import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int adet,enk=1,enb=-1,sayi1;
        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        adet=inp.nextInt();
        for(int i=1; i<=adet; i++){
            System.out.print(i+". Sayıyı Giriniz : ");
            sayi1=inp.nextInt();
            if(sayi1<enk) {
                enk = sayi1;
            }if(sayi1>enb){
                enb=sayi1;
            }
        }
        System.out.println("En Büyük Sayı: "+enb);
        System.out.println("En Küçük Sayı: "+enk);



      }

    }


