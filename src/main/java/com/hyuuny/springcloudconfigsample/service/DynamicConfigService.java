package com.hyuuny.springcloudconfigsample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@RefreshScope
@Service
public class DynamicConfigService {

    @Value("${hyuuny.profile}")
    private String profile;

    @Value("${hyuuny.comment}")
    private String comment;

    public Map<String, String> getConfig() {
        HashMap<String, String> map = new HashMap<>();
        map.put("profile", profile);
        map.put("comment", comment);
        return map;
    }

}
