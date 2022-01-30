package domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private CommentsInfo commentsInfo;
    private CopyrightInfo copyrightInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private int isPinned;
    private boolean markedAsAds;
    private boolean isFavourite;
}
