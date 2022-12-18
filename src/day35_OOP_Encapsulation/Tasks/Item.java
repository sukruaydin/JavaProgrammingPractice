package day35_OOP_Encapsulation.Tasks;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;


    public String getName() {
        return name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        //if name is empty or blank -->return
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Name can NOT be empty or blank");
            System.exit(0);
        }
       ///if name includes special chars apart from space -->return
        char[] ch = name.toCharArray();
        int count = 0;
        for (char each : ch) {
            if ( !(Character.isLetter(each) || Character.isDigit(each) || each == ' ') ){
                count++;
            }
        }
        if (count > 0){
            System.err.println("Name can NOT include special char other than space");
            System.exit(0);
        }
        //if name doesn't start with letter -->return
        if ( !(Character.isLetter(ch[0]))){
            System.err.println("Name MUST start with a letter");
            System.exit(0);
        }
        //otherwise set the name as given
        this.name = name;
    }
    public void setUnitPrice(double unitPrice) {
        if (unitPrice<=0){
            System.err.println("Unit price can NOT be less than 0");
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }
    public void setQuantity(int quantity) {
        if (quantity<=0){
            System.err.println("Quantity can NOT be less than 0");
            System.exit(0);
        }
        if (name.equalsIgnoreCase("toilet paper")){
            this.quantity = 1;
            return;
        }

        this.quantity = quantity;
    }


    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calcCost(){
        return unitPrice * quantity;
    }
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }


}

/*
4. Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */
