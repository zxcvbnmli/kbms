package cn.bdqn.kbms.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("========>>过滤器销毁");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		//执行具体过滤的过程
		//设置请求的的编码方式
		request.setCharacterEncoding("UTF-8");
		System.out.println("已对请求进行字符编码");
		//设置响应的编码方式
		response.setCharacterEncoding("UTF-8");
		System.out.println("已对响应进行字符编码");
		//进行下一步操作(如果还有过滤器，就进行下一个过滤器，如果没有，就进行servlet进行业务的处理)
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("=========>>过滤器初始化");
		
	}

}
