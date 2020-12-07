package com.lore.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
public class CourseController {
    @Value("${default.course.name}")
    private String cName;

    @Value("${default.course.chapterCount}")
    private int chapterCount;

    @RequestMapping("/defautlCourse")
    Course getDefaultCourse(@RequestParam(value ="name",required =  false) String name,
                            @RequestParam(value = "chapterCount", defaultValue = "2", required = false)int chapterCount){

        return new Course(cName,chapterCount);
    }


    @RequestMapping("/course")
    public Course getEndpoint(@RequestParam(value = "name",defaultValue = "Spring Boot", required = false)String name,
                              @RequestParam(value = "chapterCount",defaultValue = "2", required = false)int chapterCount){

        return new Course( name, chapterCount);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/register/course")
    public String saveCourse(@RequestBody Course course){
        return "Your course named"+ course.getName()+ "with"+ course.getChapterCount()+ "chapters saved succefuly.";
    }

}
















