package com.mijiaokj.sys.dal.repository;

import com.google.common.base.Preconditions;
import com.mijiaokj.sys.dal.repository.mapper.BaseMapper;
import com.mijiaokj.sys.domain.ReferenceObject;
/**
 * 
 * @ClassName: BaseRepository
 * @Description: TODO 基础操作
 * @author sunchenguang
 * @eamil scg16@126.com
 * @date 2016年10月13日
 *
 */
public abstract class BaseRepository<T extends ReferenceObject> {
	protected abstract BaseMapper<T> getMapper();

	/**
	 * @param domain
	 *
	 * @return ID
	 */
	public Long insert(T domain) {
		Preconditions.checkNotNull(domain, domain.getClass().getSimpleName() + " is null");
		domain.setDefaultValue();
		getMapper().insert(domain);
		return domain.getId();
	}

	public T getById(Long id) {
		return getMapper().getById(id);
	}

	public Integer delete(Long id) {
		return getMapper().delete(id);
	}

	public Integer update(T domain){
		Preconditions.checkNotNull(domain, domain.getClass().getSimpleName() + " is null");
	//		domain.setDefaultValue();
		return getMapper().update(domain);
	}

	protected void checkIdNotNull(T domain) {
		String clazzName = domain.getClass().getSimpleName();
		Preconditions.checkNotNull(domain, clazzName + " is null");
		Preconditions.checkNotNull(domain.getId(), clazzName + ".id is null");
	}
}
