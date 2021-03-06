/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2019 the original author or authors.
 */
package org.assertj.core.api.abstract_;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for <code>{@link org.assertj.core.api.AbstractAssert#withFailMessage(String, Object...)}</code>.
 *
 * @author Alexander Bischof
 */
public class AbstractAssert_withFailMessage_Test {

  @Test
  public void should_delegate_to_overridingErrorMessage() {
    AbstractAssert<?, ?> suT = spy(Assertions.assertThat("test"));

    suT.withFailMessage("test", "eins");

    verify(suT).overridingErrorMessage("test", "eins");
  }
}