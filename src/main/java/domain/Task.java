package domain;

public class Task {

    private String title;
    private AuthorInfo authorInfo;
    private TaskStatus taskStatus;

    public Task(String title, AuthorInfo authorInfo, TaskStatus taskStatus) {
        this.title = title;
        this.authorInfo = authorInfo;
        this.taskStatus = taskStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AuthorInfo getAuthorInfo() {
        return authorInfo;
    }

    public void setAuthorInfo(AuthorInfo authorInfo) {
        this.authorInfo = authorInfo;
    }

    public TaskStatus getStatus() {
        return taskStatus;
    }

    public void setStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}
