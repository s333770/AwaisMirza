public class IntLinkedList {
    private Node head;
    public IntLinkedList(int item){
        head=new Node(); //Oppretter node som heter head
        head.value=item;//verdien til head er item
        head.link=null;// linken til head er null, da vi ikke ahr noen verdi enda
    }
    public boolean insertItem(int item){
        Node n=new Node(); // Lager en node til
        n.value=item;
        n.link=head;// link linker til head
        head=n; // Gjør at når vi nå skal sette inn enda en node, er n det nye "head"
        return true;
    }
    public boolean deleteItem(int item){
        if(head.value==item){
            head=head.link; // Vi setter refereansen til det første objektet til å være head, dermed sletter vi head
            return true;
        }
        else{
            Node x=head;// Første element
            Node y=head.link; // Andre element
            while(true){
                if(y==null || y.value==item){ //Hvis y=null eller y sin verdi == item så breaker vi
                    break;
                }
                else{
                    x=y;
                    y=y.link;
                }
            }
            if(y!=null){
                x.link=y.link;
                return true;
            }
            else{
                return false;
            }

        }
    }


    public void printList(){
        Node z=head;
        while(z!=null){
            System.out.println(z.value);
            z=z.link;
        }
    }


    class Node{
        private int value;
        private Node link;
    }

}
