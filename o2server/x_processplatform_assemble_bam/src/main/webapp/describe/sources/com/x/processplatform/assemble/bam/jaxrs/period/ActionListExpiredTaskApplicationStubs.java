package com.x.processplatform.assemble.bam.jaxrs.period;

import com.x.base.core.project.http.ActionResult;
import com.x.base.core.project.logger.Logger;
import com.x.base.core.project.logger.LoggerFactory;
import com.x.processplatform.assemble.bam.ThisApplication;
import com.x.processplatform.assemble.bam.stub.ApplicationStubs;

class ActionListExpiredTaskApplicationStubs extends BaseAction {

	private static Logger logger = LoggerFactory.getLogger(ActionListExpiredTaskApplicationStubs.class);
	
	ActionResult<ApplicationStubs> execute() throws Exception {
		ActionResult<ApplicationStubs> result = new ActionResult<>();
		result.setData(ThisApplication.period.getExpiredTaskApplicationStubs());
		return result;
	}

}