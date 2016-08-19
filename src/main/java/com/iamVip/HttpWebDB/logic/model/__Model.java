/**
 * 
 */
package com.iamVip.HttpWebDB.logic.model;

import java.io.Serializable;

/**
 * @author Colin
 */
public class __Model implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -832083558505630550L;

	/**
	 * 
	 */
	public __Model() {
	}

	public static final String arr2(String... fields) {
		if (fields.length == 0) {
			return "*";
		}
		StringBuffer buf = new StringBuffer();
		for (String field : fields) {
			if (field != null && !"".equals(field)) {
				buf.append(", " + field);
			}
		}
		if (buf.length() > 0) {
			return buf.substring(2).toString();
		}
		else {
			return "*";
		}
	}

}
