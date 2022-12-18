package day36_Inheritance.Tasks.PhoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();
        iphone1.setInfo("Apple","Iphone13","5.5inch",20_000,"Black");
        iphone1.call(505975371);
        iphone1.faceTime("sukraydin29@gmail.com");

        Samsung samsung1 = new Samsung();
        samsung1.setInfo("Samsung","A10","7inch",15_000,"White");
        samsung1.text(505975371);
        samsung1.freeze();

        Nokia nokia1 = new Nokia();
        nokia1.setInfo("Nokia","3310","1inch",1_000,"Blue");
        nokia1.call(505975371);
        nokia1.selfDefense();

    }


}
