package day15_ForWhileLoop.Class;

public class ForLoopPractices {
    public static void main(String[] args) {
        //display the numbers between 15~45, in the same line, with parenthesis between them
        for(int i = 15; i <= 45; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        //display the numbers between 100~50, in the same line, with parenthesis between them
        for(int i = 100; i >= 50; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        //print all the even numbers between 1~55
        for(int i = 1; i <= 55; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        //print letters A-Z
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        //print letters a-z
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        //print letters Z-A
        for(char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        //print letters z-a
        for(char ch = 'z'; ch >= 'a'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        //print letters A-Z
        for(char ch = 65; ch <= 90; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        //print letters A-Z
        for(int i = 65; i <= 90; i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        //print first 100 characters
        for(char ch = 1; ch <= 100; ch++){
            System.out.print(ch+" ");
        }

    }
}
