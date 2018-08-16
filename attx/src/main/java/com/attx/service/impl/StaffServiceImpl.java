package com.attx.service.impl;

import com.attx.dao.StaffDao;
import com.attx.entity.Staff;
import com.attx.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffDao staffDao;

    @Override
    public List<Staff> getList() {
        return staffDao.getList();
    }
}
