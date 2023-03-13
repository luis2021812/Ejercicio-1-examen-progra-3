package gt.edu.umg.progra3.parcial1.pilas;

import java.util.Stack;
import static org.junit.Assert.*;

public class NotationParser {

    public Pila pila;

    public NotationParser(Pila pila) {
        this.pila = pila;
    }

    public String posFixToInfix(String expression){
        String[] llaves = expression.split(" ");
        Stack<String> stack = new Stack<>();

        for (String llave : llaves) {
            if (llave.matches("\\d+")) {
                stack.push(llave);
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String infixExpr = "" + operand1 + " " + llave + " " + operand2 + "";
                stack.push(infixExpr);
            }
        }

        return stack.pop();
    }

}
