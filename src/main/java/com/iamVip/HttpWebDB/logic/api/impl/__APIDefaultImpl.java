/**
 * 
 */
package com.iamVip.HttpWebDB.logic.api.impl;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.iamVip.HttpWebDB.database.access.layout.__IDBAPI;
import com.iamVip.HttpWebDB.logic.iapi.__IAPI;
import com.iamVip.HttpWebDB.rs.ref.PageParam;

/**
 * @author Colin
 * @param <T>
 */
public abstract class __APIDefaultImpl<T> implements __IAPI<T> {

	/**
	 * 
	 */
	public __APIDefaultImpl() {
	}

	protected abstract __IDBAPI<T> getDBApi();

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#insert(java.lang.Object)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int insert(T one) {
		try {
			return this.getDBApi().insert(one);
		}
		catch (Exception e) {
			e.printStackTrace();

			if (TransactionAspectSupport.currentTransactionStatus().isNewTransaction()) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}
			else {
				throw e;
			}
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#inserts(java.util.List)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int inserts(List<T> list) {
		try {
			return this.getDBApi().inserts(list);
		}
		catch (Exception e) {
			e.printStackTrace();

			if (TransactionAspectSupport.currentTransactionStatus().isNewTransaction()) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}
			else {
				throw e;
			}
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#deleteByKey(java.lang.Object)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteByKey(Object primaryKey) {
		try {
			return this.getDBApi().deleteByKey(primaryKey);
		}
		catch (Exception e) {
			e.printStackTrace();

			if (TransactionAspectSupport.currentTransactionStatus().isNewTransaction()) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}
			else {
				throw e;
			}
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#deleteEq(java.lang.Object)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteEq(T param) {
		try {
			return this.getDBApi().deleteEq(param);
		}
		catch (Exception e) {
			e.printStackTrace();

			if (TransactionAspectSupport.currentTransactionStatus().isNewTransaction()) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}
			else {
				throw e;
			}
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#updateByKey(java.lang.Object, java.lang.Object)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateByKey(Object primaryKey, T param) {
		try {
			return this.getDBApi().updateByKey(primaryKey, param);
		}
		catch (Exception e) {
			e.printStackTrace();

			if (TransactionAspectSupport.currentTransactionStatus().isNewTransaction()) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}
			else {
				throw e;
			}
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryCount(java.lang.Object)
	 */
	@Override
	public long queryCount(T param) {
		return this.getDBApi().queryCount(param);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryCountEq(java.lang.Object)
	 */
	@Override
	public long queryCountEq(T param) {
		return this.getDBApi().queryCountEq(param);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryByKey(java.lang.Object)
	 */
	@Override
	public T queryByKey(Object primaryKey) {
		return this.queryByKey("*", primaryKey);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryByKey(java.lang.String, java.lang.Object)
	 */
	@Override
	public T queryByKey(String columns, Object primaryKey) {
		return this.getDBApi().queryByKey(columns, primaryKey);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryEq(java.lang.Object)
	 */
	@Override
	public T queryEq(T param) {
		return this.getDBApi().queryEq(param);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryMulti(java.lang.Object)
	 */
	@Override
	public List<T> queryMulti(T param) {
		return this.getDBApi().queryMulti(param);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryMultiEq(java.lang.Object)
	 */
	@Override
	public List<T> queryMultiEq(T param) {
		return this.getDBApi().queryMultiEq(param);
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryLimit(com.iamVip.HttpWebDB. logic. model.PageParam, java.lang.Object)
	 */
	@Override
	public List<T> queryLimit(PageParam page, T param) {

		long count = this.getDBApi().queryCount(param);
		System.out.println(count + "-------------------------------------");

		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryLimitEq(com.iamVip.HttpWebDB. logic.model.PageParam, java.lang.Object)
	 */
	@Override
	public List<T> queryLimitEq(PageParam page, T param) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryEq(java.lang.String, java.lang.Object)
	 */
	@Override
	public T queryEq(String columns, T param) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryMulti(java.lang.String, java.lang.Object)
	 */
	@Override
	public List<T> queryMulti(String columns, T param) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryMultiEq(java.lang.String, java.lang.Object)
	 */
	@Override
	public List<T> queryMultiEq(String columns, T param) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryLimit(java.lang.String, com.iamVip.HttpWebDB.rs.ref.PageParam, java.lang.Object)
	 */
	@Override
	public List<T> queryLimit(String columns, PageParam page, T param) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryLimitEq(java.lang.String, com.iamVip.HttpWebDB.rs.ref.PageParam, java.lang.Object)
	 */
	@Override
	public List<T> queryLimitEq(String columns, PageParam page, T param) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#queryMethod(java.lang.String, java.util.Map)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<T> queryMethod(String methodName, Map<String, Object> map) throws Exception {
		__IDBAPI<T> dbApi = this.getDBApi();
		Method method = dbApi.getClass().getDeclaredMethod(methodName, Map.class);
		Object obj = method.invoke(dbApi, map);
		if (obj == null)
			return new ArrayList<T>(0);
		return (List<T>) obj;
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.iapi.__IAPI#querySingleMethod(java.lang.String, java.util.Map)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public T querySingleMethod(String methodName, Map<String, Object> map) throws Exception {
		__IDBAPI<T> dbApi = this.getDBApi();
		Method method = dbApi.getClass().getDeclaredMethod(methodName, Map.class);
		Object obj = method.invoke(dbApi, map);
		if (obj == null)
			return null;
		return (T) obj;
	}

}
