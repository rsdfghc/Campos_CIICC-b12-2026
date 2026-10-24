interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("// put gorilla food into cage");
            return true;
        }
        return false;
    }

    public void groom() {
        System.out.println("// lather, rinse, repeat");
    }

    public void pet() {
        System.out.println("// pet at your own risk");
    }
}