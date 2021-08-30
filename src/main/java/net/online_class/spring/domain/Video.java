package net.online_class.spring.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;
@Component("video")
//@Scope("prototype")
@Scope("singleton")
public class Video {
    private int id;

    private String title;

//    private List<String> chapterList;
//
//    private Map<Integer,String> videoMap;

    public Video() {

    }

    public Video(int id, String title) {
        System.out.println("Video 使用构造器构建bean对象");
        this.id = id;
        this.title = title;
    }

    @PostConstruct      //对应注解的init-method
    public void init(){
        System.out.println("Video类  Init方法");
    }

    @PreDestroy         //对应注解的destroy-method
    public void destroy(){
        System.out.println("Video类  Destroy方法");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

//    public List<String> getChapterList() {
//        return chapterList;
//    }
//
//    public void setChapterList(List<String> chapterList) {
//        this.chapterList = chapterList;
//    }
//
//    public Map<Integer, String> getVideoMap() {
//        return videoMap;
//    }
//
//    public void setVideoMap(Map<Integer, String> videoMap) {
//        this.videoMap = videoMap;
//    }

    public void setTitle(String title) {
        System.out.println("Video类 注入Title属性");
        this.title = title;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
//                ", chapterList=" + chapterList +
//                ", videoMap=" + videoMap +
                '}';
    }
}
