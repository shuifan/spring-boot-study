package com.example.anotherstudy.Resolver;

import com.chinacaring.util.TextUtil;
import com.example.anotherstudy.annotation.MyRequest;
import com.example.anotherstudy.domain.Param;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
public class MyRequestHandlerMethodResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().isAssignableFrom(Param.class)
                && parameter.hasParameterAnnotation(MyRequest.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

        String startTime = TextUtil.getDesc(webRequest.getParameter("start_time"), "默认参数");
        String endTime = TextUtil.getDesc(webRequest.getParameter("end_time"), "默认参数");

        return new Param(startTime, endTime);
    }
}
