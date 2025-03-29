import java.util.*;
class CommandLine{
	public static void main(String args[])
	{
		if(args.length<1) System.out.println("noarguments provided");
		else{
			System.out.println("name: " + args[0] + " rollno: " + args[1] +" college: " + args[2]);
		}
	}
}

