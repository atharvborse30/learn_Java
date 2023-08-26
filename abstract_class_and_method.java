abstract class Language {

    // method of abstract class
    public void display() {
      System.out.println("This is Java Programming");
    }
  }
  
  class abstract_class_and_method extends Language {
  
    public static void main(String[] args) {
      
      // create an object of Main
      abstract_class_and_method obj = new abstract_class_and_method();
  
      // access method of abstract class
      // using object of Main class
      obj.display();
    }
  }