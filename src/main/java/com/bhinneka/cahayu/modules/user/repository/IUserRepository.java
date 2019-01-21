/*
 * Copyright 2019 wuriyanto.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bhinneka.cahayu.modules.user.repository;

import com.bhinneka.cahayu.modules.user.model.User;
import com.bhinneka.cahayu.modules.repository.IBaseRepository;
import org.bson.types.ObjectId;

/**
 *
 * @author wurianto
 */
public interface IUserRepository extends IBaseRepository<User, ObjectId> {

    public User findByEmail(String email);

}
