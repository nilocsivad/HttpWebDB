/**
 * 
 */
package com.iamVip.HttpWebDB.request.api;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iamVip.HttpWebDB.logic.iapi.IClienteleApi;
import com.iamVip.HttpWebDB.logic.model.Clientele;
import com.iamVip.HttpWebDB.logic.model.Login;
import com.iamVip.HttpWebDB.request.__Request;
import com.iamVip.HttpWebDB.rs.c.IAPP;

/**
 * @author Colin
 */
@Controller
@RequestMapping(value = { "api/clientele" })
public class ClienteleApiRequest extends __Request implements IAPP {

	@Autowired
	private IClienteleApi clienteleApi;

	/**
	 * 
	 */
	public ClienteleApiRequest() {
	}

	@ResponseBody
	@RequestMapping(value = { "query" })
	public Map<String, Object> queryLimit(HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap modelMap) throws Exception {
		return super.queryLimit(request, response);
	}

	@ResponseBody
	@RequestMapping(value = { "query/count" })
	public long queryCount(HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap modelMap) throws Exception {
		Clientele param = new Clientele();
		param.setClientName("222");
		clienteleApi.queryLimit(null, param);
		return System.currentTimeMillis();
	}

	@ResponseBody
	@RequestMapping(value = { "query/key/map/{primaryKey}" })
	public Map<String, Object> queryKeyMap(@PathVariable int primaryKey, HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap modelMap) throws Exception {
		String columns = "clientName, company, link, maxTemplate, dateTime";
		// super.toMap(clienteleApi.queryByKey(columns, primaryKey), columns);
		// columns = "clientName, company, link, dateTime, status";
		// super.toMap(clienteleApi.queryByKey(columns, primaryKey), columns);
		// columns = "clientName, company, link, maxTemplate, clientID";
		return super.toMap(clienteleApi.queryByKey(columns, primaryKey), columns);
	}

	@ResponseBody
	@RequestMapping(value = { "query/key/{primaryKey}" })
	public Clientele queryKey(@PathVariable int primaryKey, HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap modelMap) throws Exception {
		return clienteleApi.queryByKey("clientName, company, link, maxTemplate, dateTime", primaryKey);
	}

	@ResponseBody
	@RequestMapping(value = { "query/map/{primaryKey}" })
	public Clientele queryMap(@PathVariable int primaryKey, HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap modelMap) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("primaryKey", primaryKey);
		return clienteleApi.querySingleMethod("queryByKey2", map);
	}

	@ResponseBody
	@RequestMapping(value = { "more" })
	public Map<String, Object> moreClientele(HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap modelMap, Clientele client, Login login) throws Exception {

		Map<String, Object> refMap = new HashMap<String, Object>(3);
		int r = clienteleApi.moreClientele(client, login, refMap);

		Map<String, Object> map = new HashMap<String, Object>(3);
		map.put(JSON_KEY, r);
		map.put(JSON_RESULT_KEY, refMap);
		return map;
	}

}
