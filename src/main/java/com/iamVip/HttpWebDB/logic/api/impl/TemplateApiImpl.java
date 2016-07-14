/**
 * 
 */
package com.iamVip.HttpWebDB.logic.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iamVip.HttpWebDB.database.access.layout.ITemplateDBApi;
import com.iamVip.HttpWebDB.database.access.layout.__IDBAPI;
import com.iamVip.HttpWebDB.logic.iapi.ITemplateApi;
import com.iamVip.HttpWebDB.logic.model.Template;

/**
 * @author Colin
 */
@Service
public class TemplateApiImpl extends __APIDefaultImpl<Template> implements ITemplateApi {

	@Autowired
	private ITemplateDBApi templateDBApi;

	/**
	 * 
	 */
	public TemplateApiImpl() {
	}

	/*
	 * (non-Javadoc)
	 * @see com.iamVip.HttpWebDB.logic.api.impl.__APIDefaultImpl#getDBApi()
	 */
	@Override
	protected __IDBAPI<Template> getDBApi() {
		return templateDBApi;
	}

}
