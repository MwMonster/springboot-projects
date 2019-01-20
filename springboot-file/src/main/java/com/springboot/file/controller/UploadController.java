package com.springboot.file.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * @author MwMonster
 * @Description 文件上传
 * @date 2019/1/19 11:04 PM
 */
@RestController
public class UploadController {


    private static final String filePath = "/Users/yaosong/IdeaProjects/" +
            "springboot-projects/springboot-projects/springboot-file/" +
            "src/main/resources/file/";

    @PostMapping(value = "/upload")
    public Object upload(MultipartFile file, HttpServletRequest request){

        //获取name值
        String name = request.getParameter("name");
        System.out.println("姓名：" + name);

        //获取文件名
        String fileName = file.getOriginalFilename();
        System.out.println("文件名：" + fileName);

        //获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        System.out.println("上传的后缀名为：" +  suffixName);

        //文件上传后的路径
        fileName = UUID.randomUUID() +  suffixName;
        System.out.println("转换后的名称：" +  fileName);

        File dest = new File(filePath + fileName);
        try{
            file.transferTo(dest);
            return fileName;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "fail";
    }
}
