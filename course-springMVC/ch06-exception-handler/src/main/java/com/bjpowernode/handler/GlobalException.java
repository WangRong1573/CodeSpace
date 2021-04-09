package com.bjpowernode.handler;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * tip：好好学习，天天向上！坚持
 *
 * @Description:
 * @Author rong.wang
 * @Date 2021/4/10
 **/

@ControllerAdvice
public class GlobalException {

    /**
     * 处理NameException异常
     * @return
     */
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","姓名必须是zs");
        mv.addObject("e",e);
        mv.setViewName("nameerror");
        return mv;
    }

    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","年龄不能为空，不能大于80");
        mv.addObject("e",e);
        mv.setViewName("ageerror");
        return mv;
    }

    @ExceptionHandler
    public ModelAndView doDefaultException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("e",e);
        mv.setViewName("defaulterror");
        return mv;
    }

}
