/*
 * Copyright 2017 Luca Bellonda.
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

package checklocale.mvnplugin.operation;

import checklocale.mvnplugin.operation.model.DirInfoModel;
import checklocale.mvnplugin.operation.model.FileInfoModel;
import checklocale.mvnplugin.operation.model.PropInfoModel;

public class FileInfo extends FileInfoModel {

	public FileInfo(DirInfoModel newDirInfo) {
		super(newDirInfo);
	}

	public void addKey(String key, int lineNo) {
		PropInfoModel property = null;
		if (properties.containsKey(key)) {
			property = properties.get(key);
			property.getRedefinitions().add(lineNo);
		} else {
			property = new PropInfoModel();
			property.setKey(key);
			property.setLineDefined(lineNo);
			properties.put(key, property);
		}
	}

}
