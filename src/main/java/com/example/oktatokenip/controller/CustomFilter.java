package com.example.oktatokenip.controller;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;


public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;

        // Perform some filtering logic based on the request
        String requestURI = httpRequest.getRequestURI();
        System.out.println("Request URI: " + requestURI);
        System.out.println("Authorization token: "+ httpRequest.getHeader("Authorization"));
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
