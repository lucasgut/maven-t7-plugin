/**
 * Copyright (C) 2010 Joerg Bellmann <joerg.bellmann@googlemail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.googlecode.t7mp;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.logging.Log;
import org.junit.Test;
import org.mockito.Mockito;

public class PreConditionsTest {
	
	private Log log = Mockito.mock(Log.class);
	
	@Test(expected=MojoExecutionException.class)
	public void testWrongVersion() throws MojoExecutionException{
		PreConditions.checkConfiguredTomcatVersion(log, "6.x");
	}
	
	@Test
	public void testCorrectVersion() throws MojoExecutionException{
		PreConditions.checkConfiguredTomcatVersion(log, "7.x");
	}

}
