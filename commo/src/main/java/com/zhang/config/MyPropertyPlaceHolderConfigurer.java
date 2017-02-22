package com.zhang.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigValue;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * Created by zhang on 2017/2/22.
 */
public class MyPropertyPlaceHolderConfigurer extends PropertyPlaceholderConfigurer {
    @Override
    protected Properties mergeProperties() throws IOException {
        Config config = ConfigFactory.load();
        for (Map.Entry<String,ConfigValue> entry:
             config.entrySet()) {
        }
        return super.mergeProperties();
    }
}
