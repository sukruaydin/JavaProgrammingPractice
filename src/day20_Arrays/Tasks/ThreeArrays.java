package day20_Arrays.Tasks;

public class ThreeArrays {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs   = {12345 ,     12346,  12347,    12348,     12349,    12350};


        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Gloves")){
                System.out.println("First index number of Gloves: " + i);
                break;
            }
        }
        System.out.println("-------------------------------------------------------------");

        boolean isExist = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("iPad")){
                isExist = true;
                break;
            }
        }
        System.out.println(isExist);

        System.out.println("-------------------------------------------------------------");

        String result = "";
        for (int i = 0; i < items.length; i++) {
            result += "Name: "+ items[i] + " Price: $"+prices[i]+ " ID: "+ itemIDs[i]+ ", ";
        }
        System.out.println(result.substring(0,result.length()-2));





    }
}
