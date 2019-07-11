package com.neuedu.his.global.web;
/*
时间 ：  2019/7/119:36

作用 ：

基本思路 ：
*/


import com.github.pagehelper.PageInfo;
import com.neuedu.his.common.bean.Department;
import com.neuedu.his.common.web.BaseController;
import com.neuedu.his.global.dao.DepartmentDao;
import com.neuedu.his.global.service.DepartmentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/global/department")
public class DepartmentController extends BaseController<Department,DepartmentService,DepartmentDao> {

    @Override
    @RequestMapping("/list")
    public List<Department> findList(@RequestBody Department conditon) {
        return super.findList(conditon);
    }

    @Override
    public PageInfo getpage(Department condition, Integer pageNum, Integer pageSize) {
        return super.getpage(condition, pageNum, pageSize);
    }
}
