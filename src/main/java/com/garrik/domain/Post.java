package com.garrik.domain;

import java.util.Date;

public class Post extends BaseDomain {
  private Integer postId;
  private Integer topicId;
  private Integer userId;
  private Integer postType;
  private String postTitle;
  private String postText;
  private Date createTime;

  public Integer getPostId() {
    return postId;
  }

  public void setPostId(Integer postId) {
    this.postId = postId;
  }

  public Integer getTopicId() {
    return topicId;
  }

  public void setTopicId(Integer topicId) {
    this.topicId = topicId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getPostType() {
    return postType;
  }

  public void setPostType(Integer postType) {
    this.postType = postType;
  }

  public String getPostTitle() {
    return postTitle;
  }

  public void setPostTitle(String postTitle) {
    this.postTitle = postTitle;
  }

  public String getPostText() {
    return postText;
  }

  public void setPostText(String postText) {
    this.postText = postText;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
