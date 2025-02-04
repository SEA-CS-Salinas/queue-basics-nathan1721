// (c) A+ Computer Science
// www.apluscompsci.com

// Name - nathan Carillo

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class PalinList1
{
	private Queue<String> queue;
	private Stack<String> stack;

	// Default constructor initializes the list with an empty string
	public PalinList()
	{
		setList("");
	}

	// Constructor that takes a space-separated string and sets up the list
	public PalinList(String list)
	{
		setList(list);
	}

	// Method to populate the queue and stack with elements from the input string
	public void setList(String list)
	{
		queue = new LinkedList<>();
		stack = new Stack<>();
		
		String[] words = list.split(" "); // Split the string into words
		for(String word : words) {
			queue.offer(word); // Add to queue (FIFO)
			stack.push(word);  // Add to stack (LIFO)
		}
	}

	// Method to check if the list is a palindrome
	public boolean isPalin()
	{
		while (!queue.isEmpty()) {
			if (!queue.poll().equals(stack.pop())) {
				return false; // If any mismatch occurs, return false
			}
		}
		return true; // If all elements match, it's a palindrome
	}

	// toString method to return the original list format
	public String toString()
	{
		return queue.toString();
	}
}
