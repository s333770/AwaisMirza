public class PersonStack {
    private Person [] stack;
    private int top;
    private int size;

    public PersonStack(){ //Konstruktor
        top= -1;
        this.size=size;
        stack= new Person [50]; // lager en ny stack
    }
    public boolean push(Person item){
        if(!isFull()){
            top++; //Øker top til 0;
            stack[top]=item; //Legger Item inn
            return true;
        }
        else{
            return false;
        }

    }
    public Person pop(){
        return stack[top--];
    }
    public boolean isEmpty(){
        return(top==-1);
    }
    public boolean isFull(){
        return(top==stack.length-1); //Returnerer true dersom top er lik full
    }

}
