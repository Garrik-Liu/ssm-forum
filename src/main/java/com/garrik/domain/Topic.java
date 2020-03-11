package com.garrik.domain;

import java.util.Date;

public class Topic extends BaseDomain {
  private Integer topicId;
  private Integer boardId;
  private Integer userId;
  private String topicTitle;
  private Date createTime;
  private Date lastPost;
  private Integer topicView;
  private Integer topicType;

  public Integer getTopicId() {
    return topicId;
  }

  public void setTopicId(Integer topicId) {
    this.topicId = topicId;
  }

  public Integer getBoardId() {
    return boardId;
  }

  public void setBoardId(Integer boardId) {
    this.boardId = boardId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getTopicTitle() {
    return topicTitle;
  }

  public void setTopicTitle(String topicTitle) {
    this.topicTitle = topicTitle;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getLastPost() {
    return lastPost;
  }

  public void setLastPost(Date lastPost) {
    this.lastPost = lastPost;
  }

  public Integer getTopicView() {
    return topicView;
  }

  public void setTopicView(Integer topicView) {
    this.topicView = topicView;
  }

  public Integer getTopicType() {
    return topicType;
  }

  public void setTopicType(Integer topicType) {
    this.topicType = topicType;
  }
}
