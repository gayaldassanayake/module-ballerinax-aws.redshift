/*
 * Copyright (c) 2023 WSO2 LLC. (https://www.wso2.com) All Rights Reserved.
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerina.lib.aws.redshift;

import io.ballerina.runtime.api.utils.StringUtils;
import io.ballerina.runtime.api.values.BString;

/**
 * Constants for AWS Redshift client.
 *
 * @since 1.0.0
 */
public final class Constants {
    /**
     * Constants for Endpoint Configs.
     */
    public static final class ClientConfiguration {
        public static final BString URL = StringUtils.fromString("url");
        public static final BString USER = StringUtils.fromString("user");
        public static final BString PASSWORD = StringUtils.fromString("password");
        public static final BString DATASOURCE_NAME = StringUtils.fromString("datasourceName");
        public static final BString CONNECTION_POOL_OPTIONS = StringUtils.fromString("connectionPool");
        public static final BString OPTIONS = StringUtils.fromString("options");
        public static final BString PROPERTIES = StringUtils.fromString("properties");
    }

    public static final class SSL {
        public static final BString SSL = StringUtils.fromString("ssl");
        public static final BString SSL_MODE = StringUtils.fromString("sslMode");
        public static final BString SSL_MODE_DISABLED = StringUtils.fromString("DISABLE");
        public static final BString SSL_MODE_VERIFY_CA = StringUtils.fromString("VERIFY_CA");
        public static final BString SSL_MODE_VERIFY_CA_ARG = StringUtils.fromString("verify-ca");
        public static final BString SSL_MODE_VERIFY_FULL_ARG = StringUtils.fromString("verify-full");
        public static final BString SSL_MODE_PROP = StringUtils.fromString("sslmode");
    }
    public static final String CONNECT_TIMEOUT = ".*(connect).*(timeout).*";
    public static final String POOL_CONNECTION_TIMEOUT = "ConnectionTimeout";

    /**
     * Constants for Request Generated Keys field.
     */
    public static final class RequestGeneratedKeysValues {
        public static final String ALL = "ALL";
        public static final String EXECUTE = "EXECUTE";
        public static final String BATCH_EXECUTE = "BATCH_EXECUTE";
    }
}
