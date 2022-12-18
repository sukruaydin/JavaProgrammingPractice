package day31_CustomClass_Constructors.Tasks;

public class Address {

    public String buildingNumber, street, city, state;
    public int zipCode;

    public Address(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address{" +
                buildingNumber + " " + street + "\n" +
                "\t\t\t\t   " + city + " " + state + ", " + zipCode +
                '}';
    }
}

/*

2. Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

 */
