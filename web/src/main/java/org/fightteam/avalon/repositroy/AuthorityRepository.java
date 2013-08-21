package org.fightteam.avalon.repositroy;

import org.fightteam.avalon.core.entity.domain.Authority;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * 权限Dao
 * User: faith
 * Date: 13-7-1
 * Time: 下午6:48
 * 继承Spring data实现
 */
public interface AuthorityRepository extends PagingAndSortingRepository<Authority,Long> {
}