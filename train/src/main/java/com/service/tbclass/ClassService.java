package com.service.tbclass;

import com.pojo.Tbclass;

import java.util.List;

public interface ClassService {
    List<Tbclass> selectClass(String no);
    int addClass(Tbclass tbclass);
}
