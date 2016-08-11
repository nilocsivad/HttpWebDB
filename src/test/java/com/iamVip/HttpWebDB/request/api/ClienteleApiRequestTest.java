/**
 * 
 */
package com.iamVip.HttpWebDB.request.api;

import org.junit.Test;

import com.iamVip.HttpWebDB.request.StringKVMap;
import com.iamVip.HttpWebDB.request.__RequestTest;

/**
 * @author Colin
 */
public class ClienteleApiRequestTest extends __RequestTest {

	/**
	 * 
	 */
	public ClienteleApiRequestTest() {
	}

	@Test
	public void more() throws Exception {
		this.executeHttp("/api/clientele/more", new StringKVMap().add("clientName", "123456").add("loginName", "12345").add("password", "333333").add("type", "5"));
	}

	@Test
	public void queryCount() throws Exception {
		this.executeHttp("/api/clientele/query/count");
	}

	@Test
	public void queryKey() throws Exception {
		this.executeHttp("/api/clientele/query/key/map/10024");
	}

	@Test
	public void queryLimit() throws Exception {
		this.executeHttp("/api/clientele/query");
	}


















}
