class second {
    int a = 9;
    int b = 10;
    void display(){
        System.out.println("Second class method");
    }
}

class multiple_classes{
    public static void main(String[] args){
        System.out.println("In main");
        second s = new second();
        s.display();
    }
}