class copy_array {
    public static void main(String[] args){
        int [] numbers = {1,2,3,4,5,6};
        int [] positiveNumbers = numbers;

        //change value of first array
        numbers[0] = -1;

        //printing the second array
        for (int number: positiveNumbers){
            System.out.println(number + ", ");
        }
    }
}
