package org.cloud.mblog.service;

import java.util.List;

import org.cloud.mblog.model.Album;
import org.cloud.mblog.model.Gallery;

/**
 * Created by d05660ddw on 2017/4/12.
 */
public interface IGalleryService extends IService<Gallery> {

    long saveOrUpdateGallery(Gallery gallery);

    List<Gallery> getAllByOrder(String orderColumn, String orderDir, int startIndex, int pageSize);

    List<Gallery> getGalleryByAlbum(Album album);

    List<Gallery> getAllGallery(int pageNum, int pageSize);
}
