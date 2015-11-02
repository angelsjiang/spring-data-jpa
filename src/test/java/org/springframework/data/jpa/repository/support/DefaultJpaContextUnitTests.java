/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.jpa.repository.support;

import java.util.Collections;

import javax.persistence.EntityManager;

import org.junit.Test;

/**
 * Unit tests for {@link DefaultJpaContext}.
 * 
 * @author Oliver Gierke
 * @soundtrack Marcus Miller - B's River (Afrodeezia)
 * @since 1.9
 */
public class DefaultJpaContextUnitTests {

	/**
	 * @see DATAJPA-669
	 */
	@Test(expected = IllegalArgumentException.class)
	public void rejectsNullEntityManagers() {
		new DefaultJpaContext(null);
	}

	/**
	 * @see DATAJPA-669
	 */
	@Test(expected = IllegalArgumentException.class)
	public void rejectsEmptyEntityManagers() {
		new DefaultJpaContext(Collections.<EntityManager> emptySet());
	}
}