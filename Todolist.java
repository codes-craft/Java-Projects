import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== TO-DO LIST ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch(choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    if(tasks.isEmpty()) {
                        System.out.println("No tasks yet!");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for(int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if(tasks.isEmpty()) {
                        System.out.println("No tasks to delete!");
                    } else {
                        System.out.print("Enter task number to delete: ");
                        int num = sc.nextInt();
                        if(num >= 1 && num <= tasks.size()) {
                            tasks.remove(num - 1);
                            System.out.println("Task deleted!");
                        } else {
                            System.out.println("Invalid number!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 4);

        sc.close();
    }
}
