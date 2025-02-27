public class HesapM{
    public int sayi1;
    public int sayi2;
    public String color;
    HesapM(int sayi1,int sayi2,String color){
        this.color=color;
        this.sayi1=sayi1;
        this.sayi2=sayi2;
    }
    public int toplama(){
        System.out.println(color);
        return this.sayi1 + this.sayi2;
    }
    public int cikart(){
        return this.sayi1 - this.sayi2;
    }
    public int carpma(){
        return this.sayi1 * this.sayi2;
    }
    public int bolme(){
        return this.sayi1 / this.sayi2;
    }

}