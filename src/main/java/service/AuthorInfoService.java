package service;

import domain.AuthorInfo;

public class AuthorInfoService {

    public AuthorInfo updateAuthorName(AuthorInfo authorInfo, String newAuthorName) {
        return new AuthorInfo(newAuthorName, authorInfo.getCreateDate());
    }
}
