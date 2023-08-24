class java_constructor {
    private String name;

    //constructor
    java_constructor() {
        System.out.println("Constructor called: ");
        name = "Atharv";
    }

    public static void main(String[] args){
        //constructor is invoked while
        // creating an object of the Main class
        java_constructor obj = new java_constructor();
        System.out.println("The name is " + obj.name);
    }
}
