package com.WCF.WCF.Model;

import lombok.Data;

@Data
public class WCFRequest {
    private String title;
    private String description;
    private String client;
    private String clientPriority;
    private String targetDate;
    private String productArea;
}
