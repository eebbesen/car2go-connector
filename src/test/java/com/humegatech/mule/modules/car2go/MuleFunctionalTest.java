package com.humegatech.mule.modules.car2go;

import org.mule.tck.FunctionalTestCase;

public class MuleFunctionalTest extends FunctionalTestCase {

	@Override
	protected String getConfigResources() {
		return "car2go-connector-conf.xml";
	}

}