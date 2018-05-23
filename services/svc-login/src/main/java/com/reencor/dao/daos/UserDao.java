package com.reencor.dao.daos;
import com.reencor.base.BaseRepository;
import com.reencor.dao.custom.UserDaoCustom;
import com.reencor.display.entity.User;

public interface UserDao extends BaseRepository<User>, UserDaoCustom {

}