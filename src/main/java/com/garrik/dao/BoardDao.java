package com.garrik.dao;

import com.garrik.domain.Board;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository
public class BoardDao extends BaseDao<Board> {
  private String sqlStr = "";
  private Object[] args = null;

  public void create(Board board) {
    sqlStr = "INSERT INTO board (board_id, board_name, board_desc) VALUES (?, ?, ?)";
    args = new Object[]{board.getBoardId(), board.getBoardName(), board.getBoardDesc()};

    getJdbcTemplate().update(sqlStr, args);
  }

  public Board getById(Integer id) {
    final Board board = new Board();

    sqlStr = "SELECT * FROM board WHERE board_id = ?";
    args = new Object[]{id};

    getJdbcTemplate().query(sqlStr, args, new RowCallbackHandler() {
      public void processRow(ResultSet resultSet) throws SQLException {
        board.setBoardId(resultSet.getInt("board_id"));
        board.setBoardName(resultSet.getString("board_name"));
        board.setBoardDesc(resultSet.getString("board_desc"));
      }
    });

    return board;
  }

  public ArrayList<Board> getAll() {
    final ArrayList<Board> boards = new ArrayList<Board>();

    sqlStr = "SELECT * FROM board";
    args = null;

    getJdbcTemplate().query(sqlStr, args, new RowCallbackHandler() {
      public void processRow(ResultSet resultSet) throws SQLException {
        Board board = new Board();
        board.setBoardId(resultSet.getInt("board_id"));
        board.setBoardName(resultSet.getString("board_name"));
        board.setBoardDesc(resultSet.getString("board_desc"));
        boards.add(board);
      }
    });

    return boards;

  }

  public void updateById(Integer id, Board board) {
    sqlStr = "UPDATE board SET board_name = ?, board_desc = ? WHERE board_id = ?";
    args = new Object[] {board.getBoardName(), board.getBoardDesc(), id};

    getJdbcTemplate().update(sqlStr, args);

  }

  public void deleteById(Integer id) {
    sqlStr = "DELETE FROM board WHERE board_id = ?";
    args = new Object[] {id};

    getJdbcTemplate().update(sqlStr, args);

  }
}
