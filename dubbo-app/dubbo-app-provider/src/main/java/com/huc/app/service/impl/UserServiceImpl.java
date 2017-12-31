package com.huc.app.service.impl;

import com.huc.app.service.UserService;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by hucheng on 2017/11/18.
 */
public class UserServiceImpl implements UserService {

    private Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    @Override
    public Map<String, Object> getList() {
        logger.info("-------------");
        List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < 5; i++) {
            Map<String,Object> map = new LinkedHashMap<String,Object>();
            map.put("user_id","10000"+i);
            list.add(map);
        }
        Map<String,Object> resultMap = new LinkedHashMap<String,Object>();
        resultMap.put("list",list);
        return resultMap;
    }
}
