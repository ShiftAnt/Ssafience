package com.ssafy.ssafience.service.comment;

import com.ssafy.ssafience.model.comment.CommentModifyRequest;
import com.ssafy.ssafience.model.comment.CommentResult;
import com.ssafy.ssafience.model.comment.CommentWriteRequest;
import com.ssafy.ssafience.model.dto.ProgramComment;

public interface ProgramCommentService {
	public CommentResult<ProgramComment> selectBoardCommentList(int boardNo) throws Exception;
	public CommentResult<ProgramComment> selectCommentOne(int boardNo, int commentNo) throws Exception;
	public int insertComment(CommentWriteRequest request) throws Exception;
	public int updateComment(CommentModifyRequest request) throws Exception;
	public int deleteComment(int commentNo) throws Exception;
}
