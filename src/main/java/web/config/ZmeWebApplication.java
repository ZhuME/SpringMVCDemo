package web.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @auth zme on 2019/1/3 13:41
 **/
public class ZmeWebApplication extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};//SpringWeb上下文 后端中间件或者数据层组件
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};//Spring 应用上下文，应用中的Bean，视图解析器，等
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
