package com.dao;

import com.pojo.Tbclass;

import java.util.List;

public interface TbClassMapper {
    List<Tbclass> selectClass(String no);
    int addClass(Tbclass tbclass);

}
