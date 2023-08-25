class instanceof_operator {
    public static void main(String[] args){
        //create a variable of string type
        String name = "Atharv";

        //checks if name is instance of String
        boolean result1 = name instanceof String;
        System.out.println("name is an instance of String: "+result1);

        //create an object of Main
        instanceof_operator obj = new instanceof_operator();

        //check if obj is an instance of instanceof_operator
        boolean result2 = obj instanceof instanceof_operator;
        System.out.println("ojb is an instance of instanceof_operator: "+result2);
    }
}
