package javaBook;

import java.util.List;

public class PrintA {
    public static void main(String[] args){
            List<String> items = List.of("1","a","2","a","3","a");

            items.forEach(item -> {
                if(item.equals("a")){
                    System.out.println("This is a");
                }else{
                    System.out.println("this is not a");
                }
            });
    }
}
