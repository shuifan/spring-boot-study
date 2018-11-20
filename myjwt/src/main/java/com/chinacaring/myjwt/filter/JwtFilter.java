package com.chinacaring.myjwt.filter;

import com.chinacaring.myjwt.config.JwtProperty;
import com.chinacaring.myjwt.controller.MyCommonErrorController;
import com.chinacaring.myjwt.exception.TokenException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author fandong
 * @create 2018/5/24
 */
@Component
public class JwtFilter extends GenericFilterBean{

    private JwtProperty jwtProperty;

    public JwtFilter(JwtProperty jwtProperty) {
        this.jwtProperty = jwtProperty;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        String authHeader = request.getHeader(jwtProperty.getHeader());

        //规避探测性质的 OPTIONS请求
        String optionsString = "OPTIONS";
        if (optionsString.equals(request.getMethod())){
            response.setStatus(HttpServletResponse.SC_OK);
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            //验证token
            if (StringUtils.isEmpty(authHeader) || !authHeader.startsWith(jwtProperty.getTokenHead())){
                    throw new ServletException(new TokenException(-1, MyCommonErrorController.TOKEN_MISS));
            }else {
                String token = authHeader.substring(jwtProperty.getTokenHead().length());
                try {
                    //使用jwt paser来验证签名
                    Claims claims = Jwts.parser().setSigningKey(jwtProperty.getSecret()).parseClaimsJws(token).getBody();
                    request.setAttribute("claims", claims);
                }catch (ExpiredJwtException e){
                    throw new ServletException(new TokenException(-2, MyCommonErrorController.TOKEN_EXPIRED));
                }catch (SignatureException e){
                    throw new ServletException(new TokenException(-3, MyCommonErrorController.TOKEN_INVALID));
                }catch (Exception e){
                    throw new ServletException(new TokenException(-4, MyCommonErrorController.TOKEN_ERROR));
                }

            }
            filterChain.doFilter(servletRequest, servletResponse);
        }

    }

}
