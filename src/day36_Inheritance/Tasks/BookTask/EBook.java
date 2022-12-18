package day36_Inheritance.Tasks.BookTask;

public class EBook extends Book{

    public String size;
    public int pages;


    public void setInfo(String title, String type, String author, double price, String size, int pages) {
        setInfo(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("you can read E-Book");
    }
    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }


}

/*
Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */
