package day36_Inheritance.Tasks.PhoneTask;

public class Iphone extends Phone{

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber + " is calling on facetime");
    }
    public void faceTime(String email){
        System.out.println(email + " is calling on facetime");
    }

}
/*
Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */
