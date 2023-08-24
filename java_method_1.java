class java_method_1 {
    
    //create a method
    public int addNumbers(int a,int b) {
        int sum = a + b;
        //return value
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;

        //create an object of java_method_1
        java_method_1 obj = new java_method_1();
        //calling method
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);
    }
}
