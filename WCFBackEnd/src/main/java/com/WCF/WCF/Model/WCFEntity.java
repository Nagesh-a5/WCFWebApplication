package com.WCF.WCF.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "wcfData")
@Table
@Data
public class WCFEntity implements Serializable {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "Description")
    private String Description;

    @Column(name = "client")
    private String client;

    @Column(name = "clientPriority")
    private String clientPriority;

    @Column(name = "targetDate")
    private String targetDate;

    @Column(name = "productArea")
    private String productArea;
}
