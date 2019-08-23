public class IntStack {
    private int[] stack;
    private int top;
    private int size;

    public IntStack(int size){ //Konstruktor
        top= -1;
        this.size=size;
        stack= new int [50]; // lager en ny stack
    }
    public boolean push(int item){
        if(!isFull()){
            top++; //Øker top til 0;
            stack[top]=item; //Legger Item inn
            return true;
        }
        else{
            return false;
        }

    }
    public int pop(){
        return stack[top--];
    }
    public boolean isEmpty(){
        return(top==-1);
    }
    public boolean isFull(){
        return(top==stack.length-1); //Returnerer true dersom top er lik full
    }

}
