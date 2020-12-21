package Stack.Dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Interpreter {

    Stack<Character> opStack;
    Stack<Double> valStack;

    Interpreter(){
        opStack = new Stack<>();
        valStack = new Stack<>();
    }

    public Double expInterpreter(String exp){
        try {
            char[] arr = exp.toCharArray();
            for(char e: arr){
                if (e == '('){
                    // no action
                }else if(e == ')' && !opStack.isEmpty() && !valStack.isEmpty()){
                    Character op = this.opStack.pop();
                    switch (op){
                        case '*':
                            valStack.push(this.valStack.pop()*this.valStack.pop());
                            break;
                        case '/':
                            double x = this.valStack.pop();
                            valStack.push(this.valStack.pop()/x);
                            break;
                        case '+':
                            double y = this.valStack.pop();
                            valStack.push(this.valStack.pop()+y);
                            break;
                        case '-':
                            double z = this.valStack.pop();
                            valStack.push(this.valStack.pop()-z);
                            break;
                    }

                }else if(Character.isDigit(e)){
                    valStack.push(Double.parseDouble(String.valueOf(e)));
                }else if(!Character.isDigit(e)){
                    opStack.push(e);
                }
            }
        }catch (Exception x){
            System.out.println(x);
        }
        if (!valStack.isEmpty())
            return valStack.pop();
        else
            return -1.0;
    }

    public static void main(String[] args) throws IOException {
        Interpreter e = new Interpreter();
        System.out.println("Enter your expression: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(e.expInterpreter(br.readLine()));
    }
}
