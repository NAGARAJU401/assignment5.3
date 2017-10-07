package Linkedlist;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is Linkedlist

public class Linked {
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is array
	public static void main(String[] args) {
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		// TODO Auto-generated method stub
		int[] data = { 11,17,34,46,57,79};//creating an array of size and we are initializing them

		Object[][] linkedList = new Object[1][2];//we created an object for class 

		createLinkedList(data,linkedList);//creating a linked list and printing the linked list
	printLinkedList(linkedList);
	 
	}
	 
	public static void createLinkedList(int []data,Object[][] linkedList)//creating linkedlist
	{
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		Object node[][] = null;//taking the object node has null
	
		Object newnode[][] = null;//here taking new node also has null
	node=new Object[1][2];//creating a node with new object and initializing an array
	linkedList[0][1]=node;//now we are assigning the nodes in linked list with size of an array
	
	for(int i=0;i<data.length;i++)//by using for loop we are implementing linked list
	{
	node[0][0]=new Integer(data[i]);//creating an object by this if the one head which points to the 
	newnode=new Object[1][2];//first node of the list
	node[0][1]=newnode;
	node=newnode;//node equal to newnode
	 
	}
	node =null;//node equals to null
	newnode = null;//newnode equals to null
	    }
	 
	 
	public static void printLinkedList(Object[][] linkedList)
	{
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
	Object node[][] = null;
	node=linkedList;//we first insert the node  then insert the last node in linked list
	node =(Object [][]) node[0][1];
	
	while(node[0][1]!= null)//we are using while loop that is node not equal to the null
	{
		System.out.print("  "+node[0][0]+" --->" );
		//system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.
		node=(Object [][]) node[0][1];//same here it is as well by placing a new node
		 
	}
	System.out.print("null" );
	//system : system is a class in java language.lang package
  	//out : out is the static member of system class.It's type PrintStream
  	//println: which is used to print the output.
	}
	}


