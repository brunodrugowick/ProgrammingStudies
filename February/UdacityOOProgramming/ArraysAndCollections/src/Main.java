import java.util.*;

public class Main {

    public static void main (String[] args) {

        // Easy to create and add stuff.
        ArrayList grades = new ArrayList();
        grades.add(1);
        System.out.println("Added 1. ArrayList size: " + grades.size());

        // You can add other Objects also.
        grades.add("2");
        System.out.println("Added \"2\". ArrayList size: " + grades.size());

        // Although by the name you may infer that an ArrayList is a list of arrays, that's not the case.
        // And by "you" I mean "me".

        // Atention on the Object type
        System.out.println("contains 1? " + grades.contains(1));
        System.out.println("contains 1? " + grades.contains(2));

        // Atention on the Object type
        System.out.println("contains \"1\"? " + grades.contains("1"));
        System.out.println("contains \"1\"? " + grades.contains("2"));

        // Looping through
        for (Object item : grades)
            System.out.println("Loop print: " + item);

        // Looping using iterator()
        Iterator iterator = grades.iterator();
        while (iterator.hasNext()) {
            Object grade = iterator.next();
            System.out.println("Iterator print: " + grade);
        }

        // Trying to remove something...
        Iterator iterator2 = grades.iterator();
        while (iterator2.hasNext()) {
            Object grade = iterator2.next();
            if (grade.equals(1)) iterator2.remove();

            System.out.println("Iterator print: " + grade);
        }
        // Print to check... but you should debug it.
        for (Object item : grades)
            System.out.println("Loop print: " + item);


        //====================================Stacks=====
        // Creating a stack (already testing the <String> expression that I don't know the name yet)
        // Got the name... it's called Generics.
        //FILO
        Stack<String> stack1 = new Stack();
        stack1.push("1");
        stack1.push("2");
        stack1.push("3");

        System.out.println("Peeking the top of the stack: " + stack1.peek());
        Iterator stackIterator = stack1.iterator();
        while (stackIterator.hasNext())
            System.out.println("Popping stack: " + stack1.pop());
        System.out.println("Size of the stack: " + stack1.size());


        //====================================LinkedList (which is a queue)=====
        // Creating a stack (already testing the <String> expression that I don't know the name yet)
        // FIFO
        LinkedList<String> linkedList1 = new LinkedList();
        linkedList1.addLast("1");
        linkedList1.addLast("2");
        linkedList1.addLast("3");

        System.out.println("Peeking the front of the \"queue\" (LinkedList): " + linkedList1.peekFirst());
        System.out.println("Peeking the end of the \"queue\" (LinkedList): " + linkedList1.peekLast());
        Iterator queueIterator = linkedList1.iterator();
        while (queueIterator.hasNext())
            System.out.println("Getting the first: " + linkedList1.pollFirst());
        System.out.println("Size of the queue: " + linkedList1.size());



        //====================================Hashmaps, finally...=====
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");

        System.out.println("Created a Hashmap for numbers. Let's show it below.");
        for (String number : numbers.values()) // Notice how the foreach doesn't work for hasmaps, so I get the values.
            System.out.println(number);

        System.out.println("Instantly finding the number 2: " + numbers.get(2));
    }

}
