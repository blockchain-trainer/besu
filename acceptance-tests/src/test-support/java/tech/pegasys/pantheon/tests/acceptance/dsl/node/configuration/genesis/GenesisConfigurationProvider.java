/*
 * Copyright 2018 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package tech.pegasys.pantheon.tests.acceptance.dsl.node.configuration.genesis;

import tech.pegasys.pantheon.tests.acceptance.dsl.node.RunnableNode;

import java.util.Collection;
import java.util.Optional;

@FunctionalInterface
public interface GenesisConfigurationProvider {
  Optional<String> create(final Collection<? extends RunnableNode> validators);
}