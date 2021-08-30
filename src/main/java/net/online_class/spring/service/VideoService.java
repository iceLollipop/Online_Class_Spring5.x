package net.online_class.spring.service;

import net.online_class.spring.domain.Video;

public interface VideoService {
    int save(Video video);

    Video findById(int id);
}
