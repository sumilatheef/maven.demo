package FIRSTPACKAGE;
public class Calculation //calculate two numbers
{
    int Addition;
    int Multiplication;
    float Division;
    int Subtraction;
public void sum(int a,int b)
{
    Addition=a+b;
    System.out.println("Addition of " +a +" and " +b+ " is: "+Addition);

}
public void sub(int a, int b)
{
    Subtraction=a-b;
    System.out.println("Subtraction of " +a+" and "+b+ " is: " +Subtraction);

}
public void mul(int a, int b)
{
    Multiplication=a*b;
    System.out.println("Multiplication of " +a+" and "+b+ " is: "+Multiplication);
}
public void div(float a,float b)
{
    Division=a/b;
    System.out.println("Division of " +a+ " and " +b+" is: "+Division);
}
}
