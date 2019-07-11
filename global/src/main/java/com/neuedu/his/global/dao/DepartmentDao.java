package com.neuedu.his.global.dao;
/*
时间 ：  2019/7/119:31

作用 ：

基本思路 ：
*/

import com.neuedu.his.common.bean.Department;
import com.neuedu.his.common.dao.BaseDao;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface DepartmentDao extends BaseDao<Department> {
}
