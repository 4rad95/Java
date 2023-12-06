public class Oper {

    public static void main(String[] args) {

    }
    public static int makeAdd(int num,int num1)
    {
        return num+num1;
    }
    public static void printAdd(int num, int num1 )
    {
        System.out.println("Summa : "+ num+" + " + num1+" = "+(num+num1));
    }
    public static int makeDiff(int num,int num1)
    {
        return num-num1;
    }
    public static void printDiff(int num, int num1 )
    {
        System.out.println("Difference : "+ num+" - " + num1+" = "+(num-num1));
    }
    public static int makeMult(int num,int num1)
    {
        return num*num1;
    }
    public static void printMult(int num, int num1 )
    {
        System.out.println("Multiplication: "+ num+" * " + num1+" = "+(num*num1));
    }
    public static int makeDiv(int num,int num1)
    {
        return num/num1;
    }
    public static void printDiv(int num, int num1 )
    {
        System.out.println("Division: "+ num+" / " + num1+" = "+(num/num1));
    }

}
