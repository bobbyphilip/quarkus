/*
 * Copyright 2019 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.quarkus.reactive.pg.client.runtime;

import java.util.Optional;
import java.util.OptionalInt;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(name = "datasource", phase = ConfigPhase.RUN_TIME)
public class DataSourceConfig {

    /**
     * The datasource URL.
     */
    @ConfigItem
    public Optional<String> url;

    /**
     * The datasource username.
     */
    @ConfigItem
    public Optional<String> username;

    /**
     * The datasource password.
     */
    @ConfigItem
    public Optional<String> password;

    /**
     * The datasource pool maximum size.
     */
    @ConfigItem
    public OptionalInt maxSize;
}
