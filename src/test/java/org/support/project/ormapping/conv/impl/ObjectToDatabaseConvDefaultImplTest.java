package org.support.project.ormapping.conv.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ObjectToDatabaseConvDefaultImplTest {

	@Test
	public void testGetPropertyToClumnName() {
		String test = "userRoleTest";
		
		ObjectToDatabaseConvDefaultImpl convDefaultImpl = new ObjectToDatabaseConvDefaultImpl();
		
		String column = convDefaultImpl.getPropertyToClumnName(test);
		
		assertEquals("USER_ROLE_TEST", column);
	}

}
