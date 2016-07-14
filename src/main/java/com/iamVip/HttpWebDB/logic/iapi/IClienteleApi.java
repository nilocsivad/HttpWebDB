/**
 * 
 */
package com.iamVip.HttpWebDB.logic.iapi;

import java.util.Map;

import com.iamVip.HttpWebDB.logic.model.Clientele;
import com.iamVip.HttpWebDB.logic.model.Login;

/**
 * @author Colin
 */
public interface IClienteleApi extends __IAPI<Clientele> {

	/**
	 * @param client
	 * @param login
	 * @param refMap
	 * @return
	 */
	int moreClientele(Clientele client, Login login, Map<String, Object> refMap);

}
