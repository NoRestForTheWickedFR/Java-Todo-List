public class Task {
    private String description;
    private boolean finished;

    public Task (String description) {
        this.description = description;
        this.finished = false;
    }

    public void completed() {
        finished = true;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFinished() {
        return finished;
    }

    @Override
    public String toString() {
        return description + " (Completed: " + (finished ? "Yes" : "No") + ")";
}

}
