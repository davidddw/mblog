package org.cloud.mblog.service;

import java.io.Serializable;
import java.util.List;

import org.cloud.mblog.dto.CommentInfo;
import org.cloud.mblog.model.Article;
import org.cloud.mblog.model.Comment;

/**
 * Created by d05660ddw on 2017/3/6.
 */
public interface ICommentService extends IService<Comment>, Serializable {
    List<Comment> getAllByArticle(Article article, int pageNum, int pageSize);

    List<Comment> getTopByDateDesc();

    List<Comment> getAll(int pageNum, int pageSize);

    Long addNewComment(CommentInfo commentInfo, Article article);
}
