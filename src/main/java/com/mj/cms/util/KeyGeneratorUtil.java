package com.mj.cms.util;

import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

/**
 * 
 * @author zhouping
 *
 */
@Component
public class KeyGeneratorUtil  implements KeyGenerator{
	protected final Logger logger = Logger.getLogger(this.getClass());
	@Override
	public Object generate(Object target, Method method, Object... params) {
		String key = method.getName().toLowerCase() + "_" + StringUtils.join(params, "_");
		logger.debug("KEY："+key);
		logger.info("KEY："+key);
		return key;
	}

}
