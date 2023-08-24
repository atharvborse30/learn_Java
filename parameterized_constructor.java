class parameterized_constructor {
    String languages;

    //constructor accepting single value
    parameterized_constructor(String lang) {
        languages = lang;
        System.out.println(languages + " Programming language");
    }

    public static void main(String[] args){
        //call constructor by passing a single value
        parameterized_constructor obj1 = new parameterized_constructor("Java");
        parameterized_constructor obj2 = new parameterized_constructor("Python");
        parameterized_constructor obj3 = new parameterized_constructor("C");
    }
}
