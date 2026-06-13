package domain;

public class Task {

    private String title;
    private AuthorInfo authorInfo;
    private Status status;

    public Task(String title, AuthorInfo authorInfo, Status status) {
        this.title = title;
        this.authorInfo = authorInfo;
        this.status = status;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
