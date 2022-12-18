package day27_WrapperClasses.Tasks;

public class UpperLowerEqual {

    public static void main(String[] args) {

        String s = "JAVA javae";

        int upperCount = 0;
        int lowerCount = 0;
        for (char each : s.toCharArray()) {
            if (Character.isUpperCase(each)){
                upperCount++;
            }
            if (Character.isLowerCase(each)){
                lowerCount++;
            }
        }

        boolean result = (lowerCount == upperCount);
        System.out.println("result = " + result);

    }

}
