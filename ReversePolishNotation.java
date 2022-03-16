import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        int answer = evaluateNormal(new String[] = {expression.split("\\s+") + ")"});


        System.out.println(answer);
    }

    public static int evaluate(String[] expression)
    {
        Stack<Integer> operands = new Stack<>();
        //Stack<Character> operators = new Stack<>();
        for(String element : expression)
        {
            if(element.charAt(0) >= '0' && element.charAt(0) <= '9')
            {
                operands.push(Integer.parseInt(element));
                continue;
            }
            switch (element.charAt(0))
            {
                case '+' -> operands.push(operands.pop() + operands.pop());
                case '-' -> operands.push(operands.pop() - operands.pop());
                case '*' -> operands.push(operands.pop() * operands.pop());
                case '/' -> operands.push(operands.pop() / operands.pop());
            }
        }
        return operands.pop();
    }

    public static int evaluateNormal(String[] expression)
    {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        operators.push('(')
        for(String element : expression)
        {
            if(element.charAt(0) >= '0' && element.charAt(0) <= '9')
            {
                operands.push(Integer.parseInt(element));
                continue;
            }
            if(element.charAt(0) == ')')
            {
                char operator;
                while((operator = operators.pop()) != '(')
                switch (operator)
                {
                    case '+' -> operands.push(operands.pop() + operands.pop());
                    case '-' -> operands.push(operands.pop() - operands.pop());
                    case '*' -> operands.push(operands.pop() * operands.pop());
                    case '/' -> operands.push(operands.pop() / operands.pop());
                }
                continue;
            }
            operators.push(element.charAt(0));
        }
        return operands.pop();
    }
}
