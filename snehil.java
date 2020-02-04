import java.util.*;
import java.util.Stack; 

class snehil
{ 
static int Pre(char c) 
{ 
switch (c) 
{ 
case '+': 
case '-': 
return 1; 
case '*': 
case '/': 
return 2; 
case '^': 
return 3; 
} 
return -1; 
} 
	 
 static String infToPfix(String s) 
{ 
String result = new String(""); 
Stack<Character> stack = new Stack<>(); 
for (int i = 0; i<s.length(); ++i) 
{ 
char ch = s.charAt(i); 
if (Character.isLetterOrDigit(ch)) 
result += ch; 
else if (ch == '(') 
stack.push(ch); 
else if (ch == ')') 
{ 
while (!stack.isEmpty() && stack.peek() != '(') 
result += stack.pop(); 
if (!stack.isEmpty() && stack.peek() != '(') 
return "Not valid";			 
else
stack.pop(); 
} 
else 
{ 
while (!stack.isEmpty() && Pre(ch) <= Pre(stack.peek())){ 
if(stack.peek() == '(') 
return "Not valid"; 
result += stack.pop(); 
} 
stack.push(ch); 
} 
} 
while (!stack.isEmpty())
{ 
if(stack.peek() == '(') 
return "Not  valid"; 
result += stack.pop(); 
} 
return result; 
} 
public static void main(String[] args)
{ 
Scanner sc = new Scanner(System.in);
System.out.println("give  expression");
String s = sc.nextLine();
int l=s.length();
char d=s.charAt(l-1);
if(d=='+'||d=='-'||d=='*'||d=='/'||d=='('||d==')')
System.out.println("invalid");
else
System.out.println(infToPfix(s)); 
} 
} 
