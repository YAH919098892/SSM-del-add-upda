package com.service.tbclass;

import com.dao.TbClassMapper;
import com.pojo.Tbclass;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Setter
public class ClassServiceImp implements ClassService {
    @Autowired
    @Qualifier("tbClassMapper")
    private TbClassMapper tbClassMapper;
    @Override
    public List<Tbclass> selectClass(String no) {
        return tbClassMapper.selectClass(no);
    }

    @Override
    public int addClass(Tbclass tbclass) {
        return tbClassMapper.addClass(tbclass);
    }
}
