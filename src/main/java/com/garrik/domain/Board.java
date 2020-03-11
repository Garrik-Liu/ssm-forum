package com.garrik.domain;

public class Board extends BaseDomain {
  private Integer boardId;
  private String boardName;
  private String boardDesc;

  public Integer getBoardId() {
    return boardId;
  }

  public void setBoardId(Integer boardId) {
    this.boardId = boardId;
  }

  public String getBoardName() {
    return boardName;
  }

  public void setBoardName(String boardName) {
    this.boardName = boardName;
  }

  public String getBoardDesc() {
    return boardDesc;
  }

  public void setBoardDesc(String boardDesc) {
    this.boardDesc = boardDesc;
  }
}
