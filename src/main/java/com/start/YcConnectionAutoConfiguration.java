package com.start;

import com.start.config.YcConnectionProperties;
import com.start.dao.DBHelper;
import com.start.dao.IDBHelper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Driver;

@Configuration
@EnableConfigurationProperties(YcConnectionProperties.class)  //表示能读取到数据库连接配置
@ConditionalOnClass({Driver.class, IDBHelper.class})
public class YcConnectionAutoConfiguration {

    @Bean  //托管
    public IDBHelper idbHelper(){
        IDBHelper dbHelper = new DBHelper();
        return dbHelper;
    }
}
