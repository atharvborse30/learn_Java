class lamp_class{
    boolean isOn;

    //method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Light on? "+isOn);
    }

    public static void main(String[] args) {
        //create an object of lamp_class
        lamp_class led = new lamp_class();

        // access method using object
        led.turnOn();
    }
}

