package org.cloud.mblog.service;

import java.util.List;

import org.cloud.mblog.model.User;

/**
 * Created by d05660ddw on 2017/3/6.
 */
public interface IUserService extends IService<User> {
    long saveOrUpdateUser(User user);

    List<User> getAllByOrder(String orderColumn, String orderDir, int startIndex, int pageSize);

    int deleteSafetyById(Long id);
}
