package com.app.moa.mapper.post;

import com.app.moa.domain.post.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    //    게시글 작성
    public void insert(PostVO postVO);

    // ID로 게시글 조회
    public PostVO selectById(Long id);

    // ID로 게시글 수정
    public void updateById(PostVO postDTO);

    // ID로 게시글 삭제
    public void deleteById(Long id);

    // 전체 게시글 조회 (기존 메소드)
    public List<PostVO> selectAll();

    //    조회수 증가
    public void increaseViewCountById(Long id);
}
