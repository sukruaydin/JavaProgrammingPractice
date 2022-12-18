package day36_Inheritance.Tasks.PhoneTask;

public class Samsung extends Phone{

    public void freeze(){
        System.out.println(brand + "-" + model + " is frozen");
    }

}
/*
Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */
