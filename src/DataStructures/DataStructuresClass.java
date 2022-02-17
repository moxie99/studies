package DataStructures;

import java.util.*;

public class DataStructuresClass {

    /*
    Database
    This is a way to store data for easy access and manipulation. It involves storing large
    data in such a way that the algorithm can make efficient use of the data.Types of data structure are:
    1. Linear Data Structure: elements are sequentially arranged and ordered.
        a. Stack
        b. LinkdedList
        c.Queue
    2. Non-Linear/Hierarchical data structure
     */

    /*
    1. Arrays: size is defined and fixed. No direct delete method and implementation can be very hard
     */

    public static void main(String[] args) {
         /*
    Array Declaration: the codes below shows an array of Strings with five elements
     */

        String[] computerBrands = new String[5];
        int[] multiplesOfTwo = {2, 4, 6, 8, 9, 10, 12};
        /*
        Inserting elements: using a dot notation, call the array name with the indices of the elements starting from zero for
        first element and down to the last element which is usually the size minus one(5-1)
         */
        computerBrands[0] = "Dell";
        computerBrands[1] = "Hp";
        computerBrands[2] = "Lenovo";
        computerBrands[3] = "Asus";
        computerBrands[4] = "Acer";
        computerBrands[5] = "Apple";

        /*
        Printing out arrays: printing the name out directly would only print out the memory location being a collection. To print out,
        use the arrays to strings method to stringify the arrays
         */

        System.out.println(Arrays.toString(computerBrands));
        System.out.println(multiplesOfTwo[3]);
//
//        /*
//        Looping through an array
//         */
        for (int i = 0; i < computerBrands.length; i++) {
            System.out.println(computerBrands[i]);
        }

        for (int i = multiplesOfTwo.length - 1; i >= 0; i--) {
            System.out.println(multiplesOfTwo[i]);
        }
        for (String computer : computerBrands) {
            System.out.println(computer);
        }

        Arrays.stream(computerBrands).forEach(System.out::println);

        /*
    One utility class when dealing with arrays is the class arrays
    as it has lots of utility methods.
     */

    /*
    2. 2D Arrays: 2 dimensional arrays, this is most effective for grids. It is arrays in an
    array
     */

        char[][] boards = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boards[i][j] = '-';
                if (i == j){
                    boards[i][j] = 'o';
                }
            }
        }
        System.out.println(Arrays.deepToString(boards));

        /*
        LIST: allows duplicates and not fixed in size. A list is backed by an array
         */

        List<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");



        List<String> stacks = List.of(
                "Android",
                "Golang",
                "Python",
                "Node",
                "Java",
                ".Net",
                "IOS"
        );


        System.out.println(stacks.get(4));
        System.out.println(stacks.get(1));
        System.out.println(colors.size());
        System.out.println(colors.get(3));
        System.out.println(colors.contains("Yellow"));


        for (String color: colors){
            System.out.println("The color is " +  color);
        }

        /*
        3. Stacks: it follows a LIFO(last in, first out) approach. The methods are push:
        allows to push an element into the stack. Pop: to remove the top element.
        Peek: to see the element at the top. It is a recursive data structure with reference
        to the top element. In this cas
         */

        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(1);
        myStack.push(3);
        myStack.push(7);
        myStack.push(9);
        myStack.peek();
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack.empty());
        myStack.search(1);

        Queue<Paper> printing = new LinkedList<Paper>();

        printing.add(new Paper("Olaoluwa", 22));
        printing.add(new Paper("GodsPower", 25));
        printing.add(new Paper("Kunle", 21));
        printing.add(new Paper("Ekene", 29));
        printing.add(new Paper("Isaac", 25));
        printing.add(new Paper("Smith", 27));

        System.out.println(printing.size());
        System.out.println(printing.peek());
        System.out.println(printing.poll());
        System.out.println(printing.size());

         /*
    4. LinkedList: These consist of multiples nodes. Each node contains a data item, a reference
    to the next and previous nodes. The head is a special node as it points
    to null for previous. Also, the tail points to null for next.
    Types of linkedlist: 1. Unidirectional(singly linked list)
    2. Doubly Linkedlist  3. Circular Linkedlists

     */


        LinkedList<Paper> printerShop = new LinkedList<>();
        printerShop.add(new Paper("Adekola", 24));
        printerShop.add(new Paper("Afolabi", 78));
        ListIterator<Paper> paperListIterator = printerShop.listIterator();
        while(paperListIterator.hasNext()){
            System.out.println(paperListIterator.next());
        }

        while(paperListIterator.hasPrevious()){
            System.out.println(paperListIterator.previous());
        }

        /*
        5. SET: a collection that does not permit any duplicates. It is useful when
        no duplicate is wanted. In set, the order is not guaranteed. Hence, it is not
        guaranteed that as the elements are added is the same way they would be placed.
        Therefore, there is no get method.
         */

        Set<House>myHouse = new HashSet<House>();
        myHouse.add(new House("Bungalow", 12000, "Red"));
        myHouse.add(new House("Block of Flats", 1200, "Brown"));
        myHouse.add(new House("Duplex", 1400, "Blue"));

        myHouse.forEach(System.out::println);


        /*
        6. MAP: This uses a key and value pairs. The keys must always be unique.
        When keys are duplicated, the current value of the key overrides the previous
        value of the key.
         */

        Map<Integer, House> map = new HashMap<>();
        map.put(1,new House("Bungalow", 1200, "Green"));
        map.put(2,new House("Terrace", 1200, "Green"));
        map.put(3,new House("Flat", 1200, "Green"));
        map.put(4,new House("Storey Building", 1200, "Green"));

        System.out.println(map.size());
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("House"));
        map.entrySet().forEach(System.out::println);

        map.put(5,new House("Barrack", 120, "White"));
        map.get(5);
        map.replace(3,new House("Flat", 1200, "Green"),
                new House("Bar", 230, "Golden"));

        System.out.println(map);

    }

    record House(String type, int cost, String color){

    }
    static record Paper(String owner, int numberOfPages){

    }







}

