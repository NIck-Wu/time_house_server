package com.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.util.StringUtils;

/**
 * @since 阿波罗配置
 * @author NIck
 * @date 2019-11-07 09:34:31
 */
public class ApolloConfig {

	/** default val */
	private final static String DEFAULT_VALUE = "none";

	/** get somekey value by apollo server */

	public static String get(String key) {

		if (StringUtils.isEmptyStr(key)) {
			return DEFAULT_VALUE;
		}

		Config config = ConfigService.getAppConfig();

		return config.getProperty(key, DEFAULT_VALUE);
	}
}
