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

import java.util.ArrayList;
import java.util.List;

public class Configuration {
	private String encoding = "UTF-8";
	private String baseDir;
	private List<String> directories = new ArrayList<String>();
	private boolean fileNameContainsLocaleCode;
	private String outputFolder;
	private String baseLocale;
	private boolean errors = true;
	private boolean preventOutput = false;
	private boolean strict = false;
	private boolean skipComments = false;

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public List<String> getDirectories() {
		return directories;
	}

	public void setDirectories(List<String> directories) {
		this.directories = directories;
	}

	public void addFolder(String folder) {
		directories.add(folder);
	}

	public String getBaseDir() {
		return baseDir;
	}

	public void setBaseDir(String baseDir) {
		this.baseDir = baseDir;
	}

	public boolean isFileNameContainsLocaleCode() {
		return fileNameContainsLocaleCode;
	}

	public void setFileNameContainsLocaleCode(boolean fileNameContainsLocaleCode) {
		this.fileNameContainsLocaleCode = fileNameContainsLocaleCode;
	}

	public String getOutputFolder() {
		return outputFolder;
	}

	public void setOutputFolder(String outputFolder) {
		this.outputFolder = outputFolder;
	}

	public String getBaseLocale() {
		return baseLocale;
	}

	public void setBaseLocale(String baseLocale) {
		this.baseLocale = baseLocale;
	}

	public boolean isErrors() {
		return errors;
	}

	public void setErrors(boolean errors) {
		this.errors = errors;
	}

	public boolean hasBaseLocale() {
		return (null != baseLocale) && !baseLocale.isEmpty();
	}

	public boolean isPreventOutput() {
		return preventOutput;
	}

	public void setPreventOutput(boolean preventOutput) {
		this.preventOutput = preventOutput;
	}

	public boolean isStrict() {
		return strict;
	}

	public void setStrict(boolean strict) {
		this.strict = strict;
	}

	public boolean isSkipComments() {
		return skipComments;
	}

	public void setSkipComments(boolean skipComments) {
		this.skipComments = skipComments;
	}

}
