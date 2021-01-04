package com.nacos.demo.dao;

import com.nacos.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author:蒋书弼
 * @date:2020/12/9 20:06
 */
public interface StudentDao extends JpaRepository<Student,String> {
}
