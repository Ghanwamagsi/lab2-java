class Calculator{
    public int Addition(int num1, int num2){
        return num1+num2;
    }
    public int Subtraction(int num1, int num2){
        return num1-num2;
    }
    public int Multiplication(int num1, int num2){
        return num1*num2;
    }
    public int Divison(int num1, int num2){
        return num1/num2;
    }
}
public class Create_Calculator{
    public static void main(String[] args){
        Calculator obj=new Calculator();
        System.out.println(obj.Addition(7,8));
        System.out.println(obj.Addition(17,8));
        System.out.println(obj.Addition(2,8));
        System.out.println(obj.Addition(8,2));

    }
}