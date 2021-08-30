package net.online_class.spring.domain;

import java.util.List;
import java.util.Map;

public class VideoExtend {
    private int id;

    private String title;

    private String summary;

    public VideoExtend() {

    }

    public VideoExtend(int id, String title) {
        System.out.println("Video 使用构造器构建bean对象");
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("Video类 注入Title属性");
        this.title = title;
    }

    @Override
    public String toString() {
        return "VideoExtend{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
