package Stack.Array;

public class Stack {
    int[] stack;
    int top = -1;

    Stack(int size){
        stack = new int[size];
        top = -1;
    }

    public void push(int a){
        if (top == stack.length -1)
            System.out.println("Stack full");
        else
            stack[++top] = a;
    }

    public void pop(){
        if (top == -1)
            System.out.println("Stack empty");
        else
            --top;
    }

    public void show(){
        if (top == -1)
            System.out.println("stack empty");
        for (int i=0; i<=top; i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Stack newstack = new Stack(5);
        newstack.show();
        newstack.push(34);
        newstack.push(11);
        newstack.push(12);
        newstack.push(3);
        newstack.push(56);
        newstack.show();
        newstack.pop();
        newstack.pop();
        newstack.pop();


        newstack.show();

    }

}

