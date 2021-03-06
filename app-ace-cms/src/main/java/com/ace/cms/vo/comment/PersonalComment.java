package com.ace.cms.vo.comment;

import com.ace.cms.vo.ContentVo;
import com.ace.cms.vo.user.Commenter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalComment {
    private Long commentId;
    private boolean anonymous;
    private String text;
    private int replyNum;
    private String createTime;
    private ContentVo contentVo;


}
