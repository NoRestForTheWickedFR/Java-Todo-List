import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks;
    
    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void readTasks() {
        if (tasks.isEmpty()) {
            System.out.println("There are currently no tasks. ");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i) + "\n");
            }
        }
    }

    public void finishTask(int index) {
        if (index > 0 && index <= tasks.size()) {
            tasks.get(index - 1).completed();
        } else {
            System.out.println("You selected the wrong task");
        }
    }

    public void deleteTask(int index) {
        if (index > 0 || index <= tasks.size()) {
            tasks.remove(index - 1);
        }
    }
}
