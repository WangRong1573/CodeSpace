package com.bjpowernode.crm.workbench.dao;

import com.bjpowernode.crm.workbench.domain.Activity;

import java.util.HashMap;
import java.util.List;

public interface ActivityDao {
    int save(Activity activity);

    int getTotalByCondition(HashMap<String, Object> map);

    List<Activity> getActivityListByCondition(HashMap<String, Object> map);

    int delete(String[] ids);

    Activity getActivityById(String id);

    int update(Activity activity);

    Activity detail(String id);
}
