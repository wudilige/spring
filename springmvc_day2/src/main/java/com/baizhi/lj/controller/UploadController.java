package com.baizhi.lj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @Author: LiJin
 * @Date: 2022/8/18
 * @Description:
 */
@Controller
@RequestMapping("a")
public class UploadController {
    @RequestMapping("b")
    public String upload1(MultipartFile photo, HttpServletRequest request) throws IOException {
        if(photo == null || photo.getSize() == 0){
            //用户未上传文件
            request.setAttribute("error","请选择文件");
            return "uploadView";
        }
        //原理：正常情况下，图片的内容类型均以"image/"开头
        if(!photo.getContentType().startsWith("image/")){
            //用户未上传文件
            request.setAttribute("error","上传的不是图片");
            return "uploadView";
        }
        //获取上传路径（保存到本地的路径）
        String path = request.getSession().getServletContext().getRealPath("/upload");
        //获取文件原始名称
        String fileName = photo.getOriginalFilename();
        //上传文件到服务器
        photo.transferTo(new File(path, fileName));
        return "index";
    }
}
