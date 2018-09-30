package org.cloud.mblog.service;

import java.util.List;

import org.cloud.mblog.model.Album;

/**
 * Created by d05660ddw on 2017/4/12.
 */
public interface IAlbumService extends IService<Album> {

    long saveOrUpdateAlbum(Album album);

    List<Album> getAllAlbum(int pageNum, int pageSize);

    List<Album> getAllByOrder(String orderColumn, String orderDir, int startIndex, int pageSize);
}
