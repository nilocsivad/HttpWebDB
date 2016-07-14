/**
 * 
 */
package com.iamVip.HttpWebDB.request;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iamVip.HttpWebDB.rs.c.IAPP;

/**
 * @author Colin
 */
public class __Request implements IAPP {

	/**
	 * 
	 */
	public __Request() {
	}

	public Map<String, Object> queryLimit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>(3);
		map.put(JSON_KEY, this.getClass().getName());
		// map.put(JSON_RESULT_KEY, System.getenv());
		{
			Map<String, Object> extra = new HashMap<String, Object>(8);
			// extra.put("", );
			extra.put("webapp.root", System.getProperty("webapp.root"));
			// extra.put("package_name", System.getProperty("package_name"));
			// extra.put("file_name", System.getProperty("file_name"));
			// extra.put("project_name", System.getProperty("project_name"));
			// extra.put("time", System.getProperty("time"));
			// {
			// Properties props = System.getProperties();
			// props.forEach((key, value) -> {
			// extra.put(key.toString(), value);
			// });
			// }
			map.put(JSON_EXTRA_KEY, extra);
		}
		return map;
	}

	/**
	 * @param request
	 * @param find
	 * @return
	 */
	protected String getSuffixOfURL(HttpServletRequest request, String find) {
		String uri = request.getRequestURI();
		return uri.substring(uri.indexOf(find) + find.length());
	}

}
