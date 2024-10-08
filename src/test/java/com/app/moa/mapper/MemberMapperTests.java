package com.app.moa.mapper;

import com.app.moa.domain.member.MemberDTO;
import com.app.moa.domain.member.MemberVO;
import com.app.moa.mapper.member.MemberMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@Slf4j
public class MemberMapperTests {
    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void testInsert(){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberEmail("test123@gmail.com");
        memberDTO.setMemberPassword("1234567");
        memberDTO.setMemberNickname("zzz");
        memberDTO.setMemberMajor("공학과");
        memberDTO.setMemberType(1);

        memberMapper.insert(memberDTO.toVO());
    }

    @Test
    public void testSelectByMemberEmailAndMemberPassword(){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberNickname("sm@gmail.com");
        memberDTO.setMemberEmail("sm@gmail.com");
        memberDTO.setMemberPassword("12345");

        Optional<MemberVO> foundMember =
                memberMapper.selectByMemberEmailAndMemberPassword(memberDTO.toVO());
        foundMember.map(MemberVO::toString).ifPresent(log::info);
    }

    @Test
    public void testSelectById() {
        Long id = 1L;

        Optional<MemberVO> foundMember = memberMapper.selectById(id);
        foundMember.map(MemberVO::toString).ifPresent(log::info);
    }

    @Test
    public void testSelectByMemberEmail() {
        String memberEmail = "sm@gmail.com";

        Optional<MemberVO> foundUser = memberMapper.selectByMemberEmail(memberEmail);
        foundUser.map(MemberVO::toString).ifPresent(log::info);
    }



    @Test
    public void testDelete() {
        Long id = 22L;
        memberMapper.delete(id);
    }
}















