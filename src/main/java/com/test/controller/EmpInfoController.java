package com.test.controller;

import com.test.model.EmpInfo;
import com.test.service.EmpInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by HFZY_JR_70 on 2017/6/2.
 */
@Controller
@RequestMapping("/empinfo/")
public class EmpInfoController {

    @Resource
    EmpInfoService empInfoService;

    @RequestMapping("get")
    public ModelAndView get(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv=new ModelAndView();
        EmpInfo empInfo=this.empInfoService.getEmpInfoById(1L);
        mv.addObject("empInfo",empInfo);
        mv.setViewName("/empInfo");
        return  mv;
    }
}
