import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
	LinkedList<Integer> list=new LinkedList<Integer>();
	for(int i=0;i<10;i++)
	{
		list.add(s.nextInt());
	}
	LinkedList<Integer> l=new LinkedList<Integer>();
	ListIterator<Integer> itr=list.listIterator();
	for(int i=0;i<(list.size()/2);i++)
	l.add(itr.next());
	for(int i=(list.size()/2);i<list.size();i++)
	{
	l.add((list.size()/2),itr.next());	
	}
	System.out.println(list);
	System.out.println(l);
	}
}
