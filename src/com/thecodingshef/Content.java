package com.thecodingshef;

class Content {
    int contentId;
    String content;
    String category;
    int likes;
    int dislikes;
    int shares;

    public Content(int contentId, String content, String category, int likes, int dislikes, int shares) {
        super();
        this.contentId = contentId;
        this.content = content;
        this.category = category;
        this.likes = likes;
        this.dislikes = dislikes;
        this.shares = shares;
    }

    int getContentId() {
        return contentId;

    }

    String getContent() {
        return content;
    }

    String getCategory() {
        return category;
    }

    int getLikes() {
        return likes;
    }

    int getDislikes() {
        return dislikes;
    }

    int getShares() {
        return shares;
    }


}
