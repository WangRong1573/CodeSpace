package com.bjpowernode.crm.workbench.dao;

import com.bjpowernode.crm.workbench.domain.Activity;

import java.util.HashMap;
import java.util.List;

public interface ActivityDao {
    int save(Activity activity);

    int getTotalByCondition(HashMap<String, Object> map);

    List<Activity> getActivityListByCondition(HashMap<String, Object> map);
}
