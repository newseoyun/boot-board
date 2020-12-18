package edu.seoyun.manage.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {

    private Long bdId;
    private int bdCode;
    private String bdTitle;
    private String bdContents;
    private String bdWriter;
    private Long bdMemberCode;
    private LocalDateTime bdCreate;
    private LocalDateTime bdUpdate;
    private String bdDelete;
    private int bdView;
    private int bdDepth;

}
