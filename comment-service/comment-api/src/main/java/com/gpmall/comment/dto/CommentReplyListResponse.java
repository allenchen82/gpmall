package com.gpmall.comment.dto;

import com.gpmall.commons.result.AbstractResponse;
import lombok.Data;

import java.util.List;

/**
 * @author heps
 * @date 2019/8/22 23:36
 * 商品评价回复意见分页查询返回结果
 */
@Data
public class CommentReplyListResponse extends AbstractResponse {

    private long total;

    private List<CommentReplyDto> commentReplyDtoList;

    private int page;

    public void setTotal(long total) {
        this.total = total;
    }

    public void setCommentReplyDtoList(List<CommentReplyDto> commentReplyDtoList) {
        this.commentReplyDtoList = commentReplyDtoList;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int size;
}
