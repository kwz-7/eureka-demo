package com.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by FireCode on 2020/3/11.
 */

@Component
public class LoginFilter extends ZuulFilter {

    /**
     * 过滤器类型，包含如下四种：
     * pre:请求在路由之前执行
     * routing:在路由请求时执行
     * post:后置，在routing和error过滤器之后执行
     * error: 处理请求发生错误时调用
     * @return
     */

    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * 过滤器顺序即优先级  数字越大优先级越小
     * 负数优先级最高
     * 这里我们把它放在请求头之前执行
     * @return
     */
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER-1;
    }

    /**
     * 判断过滤器是否需要执行
     * @return
     */
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的的具体业务逻辑
     * @return
     * @throws ZuulException
     */
    public Object run() throws ZuulException {
        //获取请求的上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        //获取请求
        HttpServletRequest request = currentContext.getRequest();
       //获取请求参数
        String present_user = request.getParameter("present_user");
        if (StringUtils.isBlank(present_user)){
            //不存在，则阻拦
            currentContext.setSendZuulResponse(false);
            //返回状态 403
            currentContext.setResponseStatusCode(HttpStatus.SC_FORBIDDEN);
        }
        //默认是放行，不设置就行
        return null;
    }
}
