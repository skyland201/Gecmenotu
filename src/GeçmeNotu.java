import java.util.Scanner;

public class GeçmeNotu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Matematik notunuz:");
        int mt=input.nextInt();
        System.out.println("Türkçe notunuz: ");
        int tr=input.nextInt();
        System.out.println("Fizik notunuz: ");
        int fz=input.nextInt();
        System.out.println("Kimya notunuz: ");
        int km=input.nextInt();
        System.out.println("Müzik notunuz: ");
        int mz=input.nextInt();
        if(mt<0 ||mt>100){
            System.out.println("Bu notu giremezsiniz!");
            mt=0;
        }
        if(tr<0 ||tr>100){
            System.out.println("Bu notu giremezsiniz!");
            tr=0;
        }
        if(fz<0 ||fz>100){
            System.out.println("Bu notu giremezsiniz!");
            fz=0;
        }
        if(km<0 ||km>100){
            System.out.println("Bu notu giremezsiniz!");
            km=0;
        }
        if(mz<0 ||mz>100){
            System.out.println("Bu notu giremezsiniz!");
            mz=0;
        }
        double geçmeNotu=55;
        double ortalama=(mt+tr+fz+km+mz)/5;

        String mesaj=ortalama>=geçmeNotu?"Tebrikler sınıfı geçtiniz.":"Sınıfta Kaldınız.";
        System.out.println(mesaj);
        System.out.println(ortalama);
    }
}
