

import java.util.*;
public class QueueQuestions {

	//Q1.to compare two queues
	//Q2.to find maximum element in the queue
	//Q3.merge two queues
	//Q4.in queue reverse first half of the element and leave of second half unchanged
	//Q5.to remove all duplicates in the queue
			
	
	public static void main(String[] args) {
		
		
		Queue<Integer> q1 = new LinkedList<>();
		Collections.addAll(q1, 1,2,3,4,5);
		Queue<Integer> q2 = new LinkedList<>();
		Collections.addAll(q2, 1,2,3,4,5);

		compareTwoQueues(q1,q2);
		merge(q1,q2);
		
		Queue<Integer> queue = new LinkedList<>();
		Collections.addAll(queue,1,1,2,2,3,3,5,5,8,9,8,0,9,9,0);
		
		
		maxElement(queue);
		removeduplicates(queue);
		
		
		Deque<Integer> deque = new LinkedList<>();
		Collections.addAll(deque, 2,67,9,23,90,12);
		
		reverseFirstHalf(deque);
		
		
		

	}
	
	
	public static void compareTwoQueues(Queue<Integer> q1, Queue<Integer> q2) {
		
		System.out.println("Queue1: "+q1);
		System.out.println("Queue2: "+q2);
		
		if(q1.equals(q2)) {
			System.out.println("Both Queue are Equal");
		}
		else {
			System.out.println("The Queue are not Equal!");
		}
		
	}
	
	public static void maxElement(Queue<Integer> queue) {
		
		int max = Integer.MIN_VALUE;
		for(int n : queue) {
			if(n > max) {
				max = n;
			}
		}
		
		System.out.println("The Queue: "+queue);
		System.out.println("Maximum: "+max);
		
	}
	
	public static void merge(Queue<Integer> q1, Queue<Integer> q2) {
		
		System.out.println("Queue1: "+q1);
		System.out.println("Queue2: "+q2);
		
		q2.addAll(q1);
		
		System.out.println("Merge Queue: "+q2);
		
	}
	
	
	public static void reverseFirstHalf(Deque<Integer> queue) {
		
		System.out.println("Input: "+queue);
		
		Deque<Integer> rev = new LinkedList<>();
		
		int mid = queue.size()/2;
		
		for(int i = 0; i < mid; i++) {
			int temp = queue.removeFirst();
			rev.addFirst(temp);
		}
		
		rev.addAll(queue);
		System.out.println("After Reverse FirstHalf: "+rev);
		
	}
	
	
	public static void removeduplicates(Queue<Integer> queue) {
		
		Queue<Integer> removedDup = new LinkedList<>();
		System.out.println("Input Queue: "+queue);
		
		while(!queue.isEmpty()) {
			if(!removedDup.contains(queue.peek())) {
				removedDup.add(queue.peek());
			}
			queue.poll();
		}
			
		
		System.out.println("Removed Duplicates: "+removedDup);
		
	}

}
