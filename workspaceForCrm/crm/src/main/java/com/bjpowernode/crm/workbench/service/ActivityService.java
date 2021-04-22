package com.bjpowernode.crm.workbench.service;

import com.bjpowernode.crm.workbench.domain.Activity;
import com.bjpowernode.vo.PaginationVO;

import java.util.HashMap;

public interface ActivityService {
    boolean save(Activity activity);

    PaginationVO<Activity> pageList(HashMap<String, Object> map);
}
