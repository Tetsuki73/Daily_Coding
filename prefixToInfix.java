// Java program to convert prefix to Infix 
import java.util.Stack;

class prefixToInfix{	 
static boolean isOperator(char x) 
{
	switch(x)
	{
		case '+':
		case '-':
		case '*':
		case '/':
			return true;
	}
	return false;
}

// Convert prefix to Infix expression 
public static String preToPost(String str)
{
	Stack<String> stack = new Stack<>();
	
	// Length of expression 
	int l = str.length();
	
	// Reading from right to left 
	for(int i = l - 1; i >= 0; i--)
	{
		char c = str.charAt(i);
		if (isOperator(c))
		{
			String op1 = stack.pop();
			String op2 = stack.pop();
			
			// Concat the operands and operator 
			String temp = op1 + op2 + c;
			stack.push(temp);
		} 
		else
		{
			
			// To make character to string
			stack.push(c + ""); 
		}
	}
	return stack.pop();
}

// Driver code
public static void main(String[] args)
{
	String exp = "/A+BC";
	System.out.println("postfix : " + preToPost(exp));
}
}

