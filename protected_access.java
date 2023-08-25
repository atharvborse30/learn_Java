class Animal {
    //protected method
    protected void display(){
        System.out.println("I am an Animal");
    }
}

class protected_access extends Animal {
    public static void main(String[] args){
        //create an ojbect of class
        protected_access dog = new protected_access();
        //access protected method
        dog.display();
    }
}
