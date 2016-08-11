/**
 * 
 */
package com.iamVip.HttpWebDB.database.access.layout;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.iamVip.HttpWebDB.rs.ref.PageParam;

/**
 * same to the @see com.iamVip.HttpWebDB.logic.iapi.__IAPI <br/>
 * just add @Param in method parameters<br/>
 * @author Colin
 */
public interface __IDBAPI<T> {

	int insert(T one);

	int inserts(List<T> list);

	int deleteByKey(Object primaryKey);

	/**
	 * 删除多个 String = ${String}
	 */
	int deleteEq(T param);

	int updateByKey(Object primaryKey, T param);

	/**
	 * 查询数目 String LIKE CONCAT( '%', '${String}', '%' )
	 */
	long queryCount(T param);

	/**
	 * 查询数目 String = ${String}
	 */
	long queryCountEq(T param);

	/**
	 * 查询单个
	 */
	T queryByKey(Object primaryKey);

	/**
	 * 查询单个
	 * @param columns 要查询的列
	 */
	T queryByKey(@Param(value = "columns") String columns, @Param(value = "primaryKey") Object primaryKey);

	/**
	 * 查询单个 String = ${String}
	 */
	T queryEq(T param);

	/**
	 * 查询单个 String = ${String}
	 * @param columns 要查询的列
	 */
	T queryEq(String columns, T param);

	/**
	 * 查询多个 String LIKE CONCAT( '%', '${String}', '%' )
	 */
	List<T> queryMulti(T param);

	/**
	 * 查询多个 String LIKE CONCAT( '%', '${String}', '%' )
	 * @param columns 要查询的列
	 */
	List<T> queryMulti(String columns, T param);

	/**
	 * 查询多个 String = ${String}
	 */
	List<T> queryMultiEq(T param);

	/**
	 * 查询多个 String = ${String}
	 */
	List<T> queryMultiEq(String columns, T param);

	/**
	 * 分页查询 String LIKE CONCAT( '%', '${String}', '%' )
	 */
	List<T> queryLimit(PageParam page, T param);

	/**
	 * 分页查询 String LIKE CONCAT( '%', '${String}', '%' )
	 */
	List<T> queryLimit(String columns, PageParam page, T param);

	/**
	 * 分页查询 String = ${String}
	 */
	List<T> queryLimitEq(PageParam page, T param);

	/**
	 * 分页查询 String = ${String}
	 */
	List<T> queryLimitEq(String columns, PageParam page, T param);

}
