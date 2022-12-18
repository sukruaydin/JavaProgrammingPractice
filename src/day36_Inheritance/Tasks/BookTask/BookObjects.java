package day36_Inheritance.Tasks.BookTask;

public class BookObjects {

    public static void main(String[] args) {

        EBook eBook1 = new EBook();
        eBook1.setInfo("Shining","Thriller","Stephan King",15,"Medium",450);

        System.out.println("eBook1 = " + eBook1);

        System.out.println("------------------------------------");

        AudioBook audioBook1 = new AudioBook();
        audioBook1.setInfo("Katre-i Matem", "Macera", "İskender Pala",10,5,"Şükrü Aydın");

        System.out.println("audioBook1 = " + audioBook1);

    }


}
