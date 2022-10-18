package com.example.shoppingmallspring.service;

import com.example.shoppingmallspring.domain.members.Member;
import com.example.shoppingmallspring.domain.members.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public Member saveMember(Member member){
        validateDuplicateMember(member);

        return memberRepository.save(member);
    }

    private void validateDuplicateMember(Member member){
        Member findMember = memberRepository.findByEmail(member.getEmail());
        if(findMember!=null){
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }


}