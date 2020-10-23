package com.interceptor;

import com.pojo.Tbstudent;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InterceptorTest implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("intercept正在执行prehandel方法111");
        String url=request.getRequestURI();//获取访问路径
        System.out.println(url);
        System.out.println("1234");
        if(url.indexOf("/index1")>=0){
            return true;
        }
        HttpSession httpSession=request.getSession();
        Tbstudent tbstudent= (Tbstudent) httpSession.getAttribute("myuser");//获取用户信息，如果不为空返回true
        if(tbstudent!=null){
            System.out.println(tbstudent.getName()+"我是用户名");
            return true;
        }else {
            request.setAttribute("msg","你没有登录请。。。");
            //httpServletResponse.sendRedirect("/index.jsp");
            request.getRequestDispatcher("/WEB-INF/jsp/index1.jsp").forward(request,response);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
