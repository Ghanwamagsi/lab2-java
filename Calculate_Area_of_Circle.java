class Shape{
    String Color="black";
}
class Circle extends Shape{
  double radius=2.5;   
  public void Area(){
    System.out.println("The color of circle is "+Color);
    System.out.println("The Area of circle is "+(radius*radius*3.14159));
  }   
}
public class Calculate_Area_of_Circle{
    public static void main(String[] args){
        Circle obj=new Circle();
        obj.Area();

    }
}
