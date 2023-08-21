class operators {
    public static void main(String[] args){
        //Arithmetic operators
        int a = 12, b = 5;
        
        System.out.println("Arithmetic operators :- ");
        //addition operator
        System.out.println("a + b = " + (a+b));

        //subtraction operator
        System.out.println("a - b = " + (a-b));

        //multiplication operator
        System.out.println("a * b = " + (a*b));

        //division operator
        System.out.println("a / b = " + (a/b));

        //modulo operator
        System.out.println("a % b = " + (a%b));

        System.out.println("Assignment operators :- ");

        //create variable
        int age = 4;
        int var;

        //assign value using =
        var = age;
        System.out.println("var using = "+var);

        //assign value using +=
        var+=age;
        System.out.println("var using += "+var);

        //assign value using =*
        var*=age;
        System.out.println("var using *= "+var);
        
        //Relational operators
        //create variables
        int num1 = 7, num2 = 11;

        //value of num1 and num2
        System.out.println("num1 is "+ num1 + " and num2 is "+num2);

        // ==operator
        System.out.println(num1==num2); //false
        // != operator
        System.out.println(num1!=num2); //true
        // > operator
        System.out.println(num1>num2); //false
        // < operator
        System.out.println(num1<num2); //true
        // >= operator
        System.out.println(num1>=num2); //false
        // <= operator
        System.out.println(num1<=num2); // true
        

        // logical operator
        // && operator
        System.out.println((5>3)&&(8>5)); //true
        System.out.println((5>3)&&(8<5)); //false

        // ||operator
        System.out.println((5>3)||(8>5)); //true
        System.out.println((5>3)||(8<5)); //true
        System.out.println((5<3)||(8<5)); //false

        // ! operator
        System.out.println(!(5==3)); //true
        System.out.println(!(5>3)); //false

        //Increment and Decrement operator

        int num3 = 12, num4 = 12;
        int result1,result2;

        //original value
        System.out.println("Value of num3: "+num3);

        //Increment operator
        result1 = ++num3;
        System.out.println("After increment: "+result1);
        System.out.println("Value of b: "+num4);

        //decrement operator
        result2 = --num4;
        System.out.println("After decrement: "+result2);

        // instanceof operator checks whether an object is an instanceof a particular class.
        String str1 = "Atharv";
        boolean result;

        //check if str is an instance of the String class
        result = str1 instanceof String;
        System.out.println("Is str1 an object of String? "+result);

        //Ternary Operator
        // it is a shorthand of if-then-else statement
        int februaryDays = 29;
        String resultoffeb;

        resultoffeb = (februaryDays == 28) ? "Not a leap year" : "Leap Year";
        System.out.println(resultoffeb);
    }
}
