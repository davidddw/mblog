package org.cloud.mblog.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.cloud.mblog.dto.ArticleData;
import org.cloud.mblog.model.Article;
import org.cloud.mblog.model.Category;
import org.cloud.mblog.model.Tag;
import org.cloud.mblog.model.User;

/**
 * Created by d05660ddw on 2017/3/6.
 */
public interface IArticleService extends IService<Article> {

    List<Article> getAllByDateDesc(int pageNum, int pageSize);

    List<Article> getAllByOrder(String column, String orderDir, int pageNum, int pageSize);

    List<Article> getAllByTitleOrContent(String value, int pageNum, int pageSize);

    List<Article> getTopByDate();

    List<Article> getTopByReadCount();

    List<Article> getArticlesByCategory(Category category, int pageNum, int pageSize);

    List<Article> getArticlesByCategory(Category category);

    Optional<Article> getArticlesByWid(long wid);

    List<Article> getArticlesByTag(Tag tag, int pageNum, int pageSize);

    List<Article> getArticlesByTag(Tag tag);

    Map<String, Article> getPrevAndNextArticle(Article article);

    List<Map<String, Object>> getRelativeArticlesByTag(Article article);

    List<Article> getRelativeArticlesByCategory(Article article);

    void updateArticleReadCount(Article article);

    List<Article> getTopByComment();

    void love(Article article);

    long getArticleCountByCategory(Category category);

    long saveOrUpdateArticleFromData(ArticleData articleData);

    int deleteSafetyById(Long id);

    List<Article> getarticlesByUser(User user);
}
