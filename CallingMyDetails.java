package FaffingAbout;


import java.util.Scanner;

public class CallingMyDetails {

    public static void main(String[] args) {
        System.out.println(MyName.getMyName("Selcuk Sami Baris"));
        System.out.println(MyAddress.getMyAddress(10, "Amber Wharf",  + 3, "Nursery Lane","E2 8AU"));
        System.out.println(FavouriteFoods.getMyFood("Pizza"));
        System.out.println("I was born in " + MyAge.getDateOfBirth(1984));
        System.out.println("I am " + MyAge.getAge(36) + " years old");
        System.out.println("I am " + MyHeight.getHeight(5.7) + " tall");
    }
}









