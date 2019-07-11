package com.neuedu.his.common.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.his.common.bean.BaseBean;
import com.neuedu.his.common.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<T extends BaseBean,D extends BaseDao<T>> {

    @Autowired
    protected D dao;


    public void insert(T t){
        dao.insert(t);
    }

    public void insertBatch(List<T> list){
        dao.insertBatch(list);
    }

    public void update(T t){
      t.preUpdate();
      dao.update(t);
  /*      C:\Users\徐寿春>git config --global user.name "xushouchun"

        C:\Users\徐寿春>git config --global user.email "327390985@qq.com"*/
    }

    public void delete(T condition){
        dao.delete(condition);
    }

    public void deleteById(String id){
        dao.deleteById(id);
    }


    public T findById(String id){
        return dao.findById(id);
    }


    public T find(T condition){
        return dao.find(condition);
    }


    public List<T> findList(T condition){
        return dao.findList(condition);
    }

    public List<T> findAll(){
        return dao.findAll();
    }

/**
 *genj id 是否存在判断是插入还是更新
 * */
    public void save(T t){
        if (t.getId()!=null &&!t.getId().equals("")){
            update(t);
        }else {
            insert(t);
        }
    }

/**
 * 更具条件查询分页数据
 * @param condition 条件
 * @param pageNum 当前页码
 * @param pageSize 当前数量

 * */
public PageInfo<T>getPage(T condition,Integer pageNum,Integer pageSize){
        return PageHelper.startPage(pageNum,pageSize).doSelectPageInfo(()->dao.findList(condition));
}

}
