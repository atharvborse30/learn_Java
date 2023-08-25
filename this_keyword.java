class this_keyword {
    int instVar;

    this_keyword(int instVar) {
        this.instVar = instVar;
        System.out.println("this reference = "+this);
    }

    public static void main(String[] args) {
        this_keyword obj = new this_keyword(8);
        System.out.println("object reference = "+obj);
    }
}

