package org.cloud.mblog.service;

import java.util.List;

import org.cloud.mblog.model.NovelInfo;

/**
 * Created by d05660ddw on 2017/3/6.
 */
public interface INovelInfoService extends IService<NovelInfo> {
    long saveOrUpdateNovelInfo(NovelInfo novelInfo);

    List<NovelInfo> getAllByOrder(String condition, String orderColumn, String orderDir, int startIndex, int pageSize);

    int deleteSafetyById(Long id);

    List<NovelInfo> getAllNovel(int pageNum, int pageSize);

    long getCountByCondition(String condition, NovelInfo novelInfo);
}
