import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTodo List Menu:");
            System.out.println("1. Add a task");
            System.out.println("2. Read your current tasks");
            System.out.println("3. Finish a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Exit\n");
            System.out.printf("Operation: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");

            switch (choice) {
                case 1: 
                    System.out.println("Enter the description of the task");
                    String description = scanner.nextLine();
                    todoList.addTask(description);
                    break;
                case 2:
                    todoList.readTasks();
                    break;
                case 3:
                    System.out.println("Which task do you want to complete?: ");
                    int index = scanner.nextInt();
                    todoList.finishTask(index);
                    break;
                case 4:
                    System.out.println("Which task do you want to remove?: ");
                    int indexremove = scanner.nextInt();
                    todoList.deleteTask(indexremove);
                    break;
                case 5: 
                    System.out.println("Ending the program... ");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again you idiot... ");
            }
        }
    }
}
