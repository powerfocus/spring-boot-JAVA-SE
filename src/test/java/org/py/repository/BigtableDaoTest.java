package org.py.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.py.model.Bigtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BigtableDaoTest {
    @Autowired
    private BigtableDao dao;
    @Test
    public void findById() {
        Optional<Bigtable> opt = dao.findById(1l);
        if(opt.isPresent())
            System.out.println(opt.get());
        else
            System.out.println("未找到任何数据！");
    }
    @Test
    public void pages() {
        int pageNum = 2;
        dao.findAll(PageRequest.of(pageNum - 1, 20)).forEach(System.out::println);
    }
}