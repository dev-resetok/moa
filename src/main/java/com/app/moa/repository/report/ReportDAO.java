package com.app.moa.repository.report;


import com.app.moa.domain.post.Pagination;
import com.app.moa.domain.post.PostDTO;
import com.app.moa.domain.report.ReportDTO;
import com.app.moa.domain.report.ReportVO;
import com.app.moa.mapper.report.ReportMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Arg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor

public class ReportDAO {
    private final ReportMapper reportMapper;

    //    신고하기
    public void save(ReportVO reportVO) {
        reportMapper.report(reportVO);
    }

    //  신고 내역 조회
    public List<ReportDTO> selectAll(Pagination pagination, String order){
        return ReportMapper.selectAll(pagination, order);
    }

//    //  게시물 작성
//    public PostDTO findById(Long id) {
//        return postMapper.selectById(id);
//    }
//
//    public void update(PostDTO postDTO) {
//        postMapper.updateById(postDTO);
//    }
//
//    public void delete(Long id) {
//        postMapper.deleteById(id);
//    }
//
//    //  게시물 조회
//    public List<ReportDTO> selectAll(Pagination pagination, String order){
//        return ReportMapper.selectAll(pagination, order);
//    }

}
