package com.reencor.base;

/**
 * Created by winsion-all on 2017/6/10.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * A base repository interface declaring a custom method shared amongst all repositories.
 *
 * @author Oliver Gierke
 * @see
 * @soundtrack Tim Neuhaus - As life found you (The Cabinet)
 */
@NoRepositoryBean
public  interface BaseRepository<T> extends JpaRepository<T, String> {

}
