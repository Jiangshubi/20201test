package com.nacos.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

/**
 * @author:蒋书弼
 * @date:2020/12/9 19:54
 */
@Entity
@Table(name="student")
@Data
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class Student {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 32)
    private String studentId;

    private String name;

    private String sex;

}
