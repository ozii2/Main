public class Ders1{
    public static void main(String[] args) {
        // sınıfAdı objAdı = new sınıfAdı();
        HesapM makine1 = new HesapM(1,3,"mavi");
        System.out.println(makine1.sayi1 + "-" + makine1.sayi2);

        makine1.sayi1 = 10;
        System.out.println(makine1.sayi1 + "-" + makine1.sayi2);

        HesapM m1 = new HesapM(10,5,"kirmizi");
        System.out.println(m1.toplama());
        System.out.println(m1.cikart());
        System.out.println(m1.carpma());
        System.out.println(m1.bolme());

        HesapM m2 = new HesapM(1 ,2,"siyah");
        System.out.println(m2.toplama());

    }
}