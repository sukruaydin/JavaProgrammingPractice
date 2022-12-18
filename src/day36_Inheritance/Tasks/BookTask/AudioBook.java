package day36_Inheritance.Tasks.BookTask;

public class AudioBook extends Book{

    public double length;
    public String narrator;


    public void setInfo(String title, String type, String author, double price, double length, String narrator) {
        setInfo(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }


    public String toString() {
        return "AudioBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                " ,length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }



}
/*
Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()
 */