public class Person {
    public static int staticCounter = 0;
    public int counter = 0;

    public Person(){
        this.staticCounter++;
        this.counter++;
    }

    public static void main (String[] args) {
        long nano = System.nanoTime();
        System.out.println(nano);
        while (true) {
             Person p1 = new Person();
             System.out.println(p1.counter);
             System.out.println(Person.staticCounter);
        }
    }
}