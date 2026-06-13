package domain;

import java.time.LocalDate;

public final class AuthorInfo {

    private final String authorName;
    private final LocalDate createDate;

    public AuthorInfo(String authorName, LocalDate createDate) {
        this.authorName = authorName;
        this.createDate = createDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

}
