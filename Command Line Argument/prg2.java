//Accepting input from user - CommandLine Argument
//java prg2 1 2 3 pass 3 argument .

class prg2
{
    public static void main(String[] args)
    {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int d=a+b+c;
        System.out.println("Addition of All Element = "+d);
    }   
}
