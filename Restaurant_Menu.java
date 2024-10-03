import java.util.Scanner;

class Dish{
    double price;
    String name;
    Dish(String name,double price){
        this.name=name;
        this.price=price;
    }
}
class Restaurant_list{
    Scanner sc=new Scanner(System.in);
    Dish array[]=new Dish[39];
    public void hasdish(){     //to check whether a particular dish is present in menu or not
        System.out.println("Enter the name of the dish that you want to search");
        String dish=sc.nextLine();
        for (Dish dishes:array){
            if (dishes != null &&dishes.equals(dish)){
                System.out.println("The dish is present in the menu");
            }
        }
        System.out.println("No, it is not present in the menu");
    }
    }
public class Restaurant_Menu{
    public static void main(String[] args){
        Dish obj1=new Dish("beef",1000);
        Dish obj2=new Dish("Mutton",1500);  
        Restaurant_list obj=new Restaurant_list();
        obj.hasdish();
    }
}