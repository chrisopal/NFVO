/*
 * Copyright (c) 2015 Fraunhofer FOKUS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openbaton.nfvo.repositories;

import org.openbaton.catalogue.nfvo.Configuration;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mob on 05.09.15.
 */
public interface ConfigurationRepository extends CrudRepository<Configuration, String> {
    Configuration findFirstById(String id);
    List<Configuration> findByProjectId(String projectId);
}
