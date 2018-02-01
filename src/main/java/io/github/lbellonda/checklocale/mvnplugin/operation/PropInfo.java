/*
 * Copyright 2017-2018 Luca Bellonda.
 * 
 * Part of the checklocale project
 * See the NOTICE file distributed with this work for additional information 
 * regarding copyright ownership.
 * Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.lbellonda.checklocale.mvnplugin.operation;

import io.github.lbellonda.checklocale.mvnplugin.operation.model.PropInfoModel;

public class PropInfo extends PropInfoModel {

	public boolean hasDuplicates() {
		return !redefinitions.isEmpty();
	}

	public void writeToString(StringBuilder sb) {
		sb.append(getKey());
		sb.append("=");
		sb.append(getValue());
	}
	
	public boolean isValue() {
		return true ;
	}

	public boolean isComment() {
		return false ;
	}

	public boolean isEmpty() {
		return false ;
	}
}
