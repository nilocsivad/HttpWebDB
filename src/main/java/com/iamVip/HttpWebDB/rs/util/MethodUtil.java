/**
 * 
 */
package com.iamVip.HttpWebDB.rs.util;

import java.util.List;

/**
 * @author Colin
 */
public class MethodUtil {

	private static List<String> IGNORES;

	/**
	 * 
	 */
	public MethodUtil(List<String> ignores) {
		IGNORES = ignores;
	}

	/**
	 * @return the methods
	 */
	public static List<String> getIgnoreMethods() {
		return IGNORES;
	}

}
