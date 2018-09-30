package org.cloud.mblog.service;

import java.util.List;
import java.util.Optional;

import org.cloud.mblog.model.Page;

/**
 * Created by d05660ddw on 2017/3/6.
 */
public interface IPageService extends IService<Page> {

    List<Page> getNameAndSlug();

    long saveOrUpdateCategory(Page page);

    Optional<Page> getBySlug(String slug);

    List<Page> getAllByOrder(String column, String orderDir, int pageNum, int pageSize);
}
