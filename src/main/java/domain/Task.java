package domain;

public class Task {

    private String title;
    private AuthorInfo authorInfo;

    public Task(String title, AuthorInfo authorInfo) {
        this.title = title;
        this.authorInfo = authorInfo;
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
}
