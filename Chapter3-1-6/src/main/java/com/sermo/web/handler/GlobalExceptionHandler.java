package com.sermo.web.handler;

import com.sermo.web.exception.MyException;
import com.sermo.web.model.ErrorInfo;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sermo
 * @version 2016/11/28.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW="error";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {
        ModelAndView view = new ModelAndView();
        view.addObject("exception", e);
        view.addObject("url", request.getRequestURL());
        view.setViewName(DEFAULT_ERROR_VIEW);
        return view;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo jsonErrorHandler(HttpServletRequest request, MyException e) {
        ErrorInfo<String> info = new ErrorInfo<>();
        info.setCode(ErrorInfo.ERROR);
        info.setMessage(e.getMessage());
        info.setUrl(request.getRequestURL().toString());
        return info;
    }
}
