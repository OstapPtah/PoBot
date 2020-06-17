package com.ua.PornBot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class VideoService {

    private PornHubService pornHubService;

    public VideoService() {
        pornHubService = new PornHubService();
    }

    public List<Video> getTopRatedVideos(String star, int amount) {

        List<Video> allVideos = pornHubService.getVideoForStar(star);
        if (!allVideos.isEmpty()) {
            VideoSorter videoSorter = new VideoSorter();
            List<Video> sorted = videoSorter.sortByRatings(allVideos);
            List<Video> topRated = new ArrayList<>(amount);
            ListIterator<Video> iterator = sorted.listIterator(sorted.size());
            int counter = 0;
            while (iterator.hasPrevious() && counter < amount) {
                topRated.add(iterator.previous());
            }

            return topRated;
        }
        return allVideos;

    }

}
