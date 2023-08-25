class Data {
    // private variable
    private String name;

    // getter method
    public String getName(){
        return this.name;
    }
    // setter method
    public void setName(String name){
        this.name = name;
    }
}

public class private_access {
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.setName("Atharv");
        System.out.println(d.getName());
    }
}
