import java.util.Scanner;

class Item {
    double total_price=0.0;
    String item_name;
    int quantity;
    double price;

    Item(String item, int quantity, double price) {
        this.item_name = item;
        this.quantity = quantity;
        this.price = price;
        System.out.println("item:"+item_name+" \nitem price:"+price+" \nitem quantity: "+quantity);
     }
     
}

class ShoppingCart {
    Item[] array = new Item[10000000];

    public void addProduct(Item product, int index) {
        if (index >= 0 && index < array.length) {
            array[index] = product;
        } else {
            System.out.println("Error: Invalid index");
        }
    }
    public void updatequantity(String productName,int updatedquantity) {
        for (Item item : array) {
            if (item != null && item.item_name.equalsIgnoreCase(productName)) {
                if (item.quantity >0 && updatedquantity<item.quantity) {
                    item.quantity += updatedquantity;
                    System.out.println("Increased "+updatedquantity +" "+productName+"s");
                } else {
                    System.out.println("The product is out of stock");
                }
                return;
            }
        }
        System.out.println("The product is not available");
    }
    public void RemoveItem(String productName) {
        for (Item item : array) {
            if (item != null && item.item_name.equalsIgnoreCase(productName)) {
                if (item.quantity > 0) {
                    item.quantity -= 1;
                    System.out.println("Reduced 1 " + productName);
                } else {
                    System.out.println("The product is out of stock");
                }
                return;
            }
        }
        System.out.println("The product is not available");
    }
    public boolean isProductInCart(String productName) {
        for (Item item : array) {
            if (item != null && item.item_name.equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }
}
public class Online_Shopping_Cart {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        while (true){
            int objectnumber=1;
            System.out.print("\n1:To add an item\n2:Exit\nEnter 1 or 2:");
            String choice=Sc.nextLine();
            if (choice.equals("1")){
                System.out.println("Enter the name of the item to add in shopping cart");
                String item_name=Sc.nextLine();
                if (cart.isProductInCart(item_name)){
                    System.out.println("The product is already present:");
                }
                else{
                System.out.println("Enter the price of "+item_name);
                double price=Sc.nextDouble();
                System.out.println("Enter the quantity of "+item_name);
                int quantity=Sc.nextInt();
                Item obj=new Item(item_name,quantity,price);
                cart.addProduct(obj, 3);
                objectnumber++;
            }}
            else if (choice.equals("2")){
                break;
            }


        }
        Item obj1 = new Item("book", 23, 10);
        Item obj2 = new Item("pen", 10, 123);
        Item obj3 = new Item("pencil", 50, 5);
        double total_price=0.0;
        total_price=obj1.quantity*obj1.price+obj2.quantity*obj2.price+obj3.quantity*obj3.price;
        System.out.println("total price of items is "+total_price);
        cart.addProduct(obj1, 0);
        cart.addProduct(obj2, 1);
        cart.addProduct(obj3, 2);
        cart.updatequantity("book", 3);
        cart.RemoveItem("book");
        System.out.println("Product list in cart:");
        for (Item item : cart.array) {
            if (item != null) {
                System.out.println("Product: " + item.item_name + ", Quantity: " + item.quantity + ", Price: " + item.price);
            }
        }
    }
}
