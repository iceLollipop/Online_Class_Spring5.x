package net.online_class.spring.service;

import net.online_class.spring.config.CustomConfig;
import net.online_class.spring.dao.VideoDao;
import net.online_class.spring.domain.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// 注解配置Bean对象
//@Component("videoService")
@Service("videoService")
public class VideoServiceImpl implements VideoService{
    @Autowired
    private VideoDao videoDao;

    @Autowired
    private CustomConfig customConfig;

    @Override
    public int save(Video video) {
        System.out.println("保存video");
        return 1;
    }

    @Override
    public Video findById(int id) {
        System.out.println("根据id找视频");
        videoDao.test();
        System.out.println(customConfig.toString());
        return new Video();
    }
}
