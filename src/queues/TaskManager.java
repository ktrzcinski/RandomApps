package queues;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
	public static void main(String[] args) {
		TaskManager tm = new TaskManager();
		try(Scanner sc = new Scanner(System.in)) {
			tm.mainLoop(sc);
		}
	}
	
	private void printOptions() {
		for(Option o : Option.values()) {
			System.out.println(o);
		}
	}
	
	private void mainLoop(Scanner sc) {
		Queue<Task> taskQueue = new PriorityQueue<>();
		
		Option next = null;
		while(next == null || next != Option.EXIT) {
			printOptions();
			next = Option.createFromInt(sc.nextInt());
			sc.nextLine();
			switch(next) {
			case ADD:
				taskQueue.offer(readAndCreateTask(sc));
				break;
			case TAKE:
				takeTask(taskQueue.poll());
				break;
			case EXIT:
				System.out.println("Bye!");
			}
		}
	}
	
	private Task readAndCreateTask(Scanner sc) {
		System.out.println("Name of the task: ");
		String name = sc.nextLine();
		System.out.println("Description of the task: ");
		String desc = sc.nextLine();
		System.out.println("Priority of the task (LOW, MODERATE, HIGH): ");
		Task.Priority priority = Task.Priority.valueOf(sc.nextLine().toUpperCase());
		System.out.println("Task has been added\n");
		
		return new Task(name, desc, priority);
	}
	
	private void takeTask(Task task) {
		System.out.println("Task to take: ");
		System.out.println(task);
	}
	
	private enum Option {
		ADD(0, "Add task"), TAKE(1, "Take next task"), EXIT(2, "Exit");
		
		int option;
		String desc;
		
		Option(int option, String desc) {
			this.option = option;
			this.desc = desc;
		}
		
		static Option createFromInt(int option) {
			return Option.values()[option];
		}
		
		@Override
		public String toString() {
			return option + " - " + desc;
		}
	}
	
		
}

