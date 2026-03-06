public class mathoperation{
    public static void main(String[] args){
        // For arithmetic operator\
        int a=5;
        int b=6;
        System.out.println("addition"+ (a+b));
        System.out.println("Substraction"+ (b-a));
        System.out.println("Multiplication"+(a*b));
        System.out.println("Division"+(a/b));
        System.out.println("Modulus Division"+(a%b));
        // unary
        System.out.println("The increment value of a is:"+(++a));
        System.out.println("The decrement value of b is :"+(--b));
        // Assignment operator
        int c=a+b;
        System.out.println(+c);
        // Relational 
        System.out.println("a==b"+(a==b));
        System.out.println("a>b"+(a>b));
        System.out.println("a<b"+(a<b));
        System.out.println("a!=b"+(a!=b));
        //ternary 
         int age = 20;
        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("\nTernaary Operator:");
        // logical operator
        int d=10;
        if(a>b&&a>c){
            System.out.println("A is greatest");
        }
        else if(b>a&&b>c)
        {
     System.out.println("B is greatest");
    }
    else{
         System.out.println("c is greatest");
    }
    
}  
}