/*
----------------------------------------------------------------------------------------------------------
    Name:		ExpressionParser
    Authors:	Ollie Peel, Jeffrey Saylor, Alex Brinkley, Rawan Alhachami
    Language:	Java
    Date:		2024-07-01
    Purpose:	The purpose of this program is to use stacks to parse and evaluate expressions taken from
    an input file and output the results to the console.
----------------------------------------------------------------------------------------------------------
    Change Log
----------------------------------------------------------------------------------------------------------
    Who		Date		Reason
    JQS		2024-07-11	Setting up base of code
----------------------------------------------------------------------------------------------------------
*/

public class ExpressionParser {
	// We need to use stacks
	public static void infixParser() {
		
	}
	
	public static void expToParse(String expression) {
		
	}
	
	public static void evalExp(String expression) {
		
	}
	
	public static int getPrecedence(String op) {
		if (op.equals("*") || op.equals("/")) { return 2; }
		if (op.equals("+") || op.equals("-")) { return 1; }
		throw new IllegalArgumentException(String.format("Operator %s is not supported.", op));
	}
	
	public boolean compareOp(String op1, String op2) { return getPrecedence(op1) >= getPrecedence(op2); }
}
