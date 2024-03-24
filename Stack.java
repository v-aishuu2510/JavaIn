package DataStructure;
import java.util.*;
public class Stack 
{
	static Scanner sc=new Scanner(System.in);
   static 	int stack[], top=-1 ,size;
	static
	{
		Stack.create();
	}
	static void create()
	{
		//int size;
		System.out.print("Enter the size of the stack: ");
		size=sc.nextInt();
		stack=new int[size];
		System.out.println("statck is created and the size of stack is: "+size);
	}
	static void push(int i)
	{
		if(isFull())
		{
			System.out.println("Stack is Overflow!");
		}
		else
		{
		    stack[++top]=i;
			System.out.println(i+" is pushed into a stack");
		}
	}
	static boolean isFull()
	{
		if(top==size-1)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	static int pop()
	{
		if(isEmpty())
		{
			//System.out.println("Stack is Underflow");
			return 0;
		}
		else
		{
			return stack[top--];
		}
	}
	
	static boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static int peek()
	{
		if(isEmpty())
		{
			return 0;
		}
		else
		{
			return stack[top];
		}
	}
	
	static void traverse()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("Stack Element are : ");
			for(int i=0;i<=top;i++)
			{
				System.out.println(stack[i]);
			}
			
		}
	}
	
	public static void main(String args[])
	{
		int ch, item;
		while(true)
		{
			System.out.println("1. PUSH ");
			System.out.println("2. POP ");
			System.out.println("3. PEEK");
			System.out.println("4. TRAVERSE ");
			System.out.println("5. QUIT ");
			
			System.out.print("Enter  Your Choice: ");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Element: ");
				item=sc.nextInt();
				Stack.push(item);
				break;
			case 2:
				item=Stack.pop();
				if(item==0)
				{
					System.out.println("Stack is Uderflow!");
				}
				else
				{
					System.out.println("Popped item: "+item);
				}
				break;
			case 3:
				item=Stack.peek();
				if(item==0)
				{
					System.out.println("Stack is Uderflow! ");
				}
				else
				{
					System.out.println("Peek Element is: "+item);
				}
				break;
			case 4:
				Stack.traverse();
				break;
			case 5:
				return;
				default:
					System.out.println("Invalid choice: ");
					continue;
			}
		}
	}
}
