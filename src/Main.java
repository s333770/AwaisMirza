public class Main {
    public static void main(String[] args) {
        /*
        IntStack intStack=new IntStack(20);
        if(!intStack.isFull()){ // Hvis ikke full, add 2
            intStack.push(2);
            intStack.push(4);
            intStack.push(5);
            intStack.push(9);
        }
        System.out.println(intStack.pop()); // Tar ut verdier fra stack, viser 9
        System.out.println(intStack.pop());// Tar ut verdier fra stack, viser 5
*/
        Person person1 =new Person("Umair","123");
        Person person2=new Person("Ali", "321");
        PersonStack stack= new PersonStack();
        stack.push(person1);
        stack.push(person2);
        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());

        //Tester så queue metoden
        Personq q=new Personq();
        q.enqueue(new Person("Andreas","123"));
        q.enqueue(new Person("ALi","234"));
        q.showAll();

        //LinkedList
        IntLinkedList list=new IntLinkedList(2);
        list.insertItem(5);
        list.insertItem(8);
        list.printList();






    }
}
