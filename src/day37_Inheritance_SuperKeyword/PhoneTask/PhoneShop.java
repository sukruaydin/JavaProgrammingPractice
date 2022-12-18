package day37_Inheritance_SuperKeyword.PhoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone13","5inch",21_999,"Black");
        System.out.println("iphone = " + iphone);

        iphone.call(123);
        iphone.text(456);
        iphone.faceTime("abc@gmail.com");

        System.out.println("--------------------------------------------------------");

        Samsung samsung = new Samsung("A10","7inch",15_999,"White");
        System.out.println("samsung = " + samsung);

        samsung.call(789);
        samsung.freeze();

        System.out.println("--------------------------------------------------------");

        Nokia nokia = new Nokia("3310","1inch",1_999,"Blue");
        System.out.println("nokia = " + nokia);

        nokia.text(456);
        nokia.selfDefense();

        System.out.println("--------------------------------------------------------");

        //that static variable is inherited too
        //we can call static variables through class name
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);






    }

}
