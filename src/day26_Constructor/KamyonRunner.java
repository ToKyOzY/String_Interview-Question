package day26_Constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 ozellikleri :"+kamyon1.toString());



        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,500000);
        System.out.println("Kamyon2 bilgileri "+ kamyon2);

        Kamyon kamyon3=new Kamyon("MAN","as900",2007,500000);
        System.out.println("Kamyon3 bilgileri "+ kamyon3);

        Kamyon kamyon4=new Kamyon("Scania","s540");
        System.out.println("Kamyon4 bilgileri "+ kamyon4);

        Kamyon kamyon5=new Kamyon("zey");
        System.out.println("Kamyon5 bilgileri "+ kamyon5);


    }
}
