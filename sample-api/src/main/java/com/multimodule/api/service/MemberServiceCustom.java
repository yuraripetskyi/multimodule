package com.multimodule.api.service;

import com.multimodule.common.member.Member;
import com.multimodule.common.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceCustom {

    private MemberRepository memberRepository;

    public MemberServiceCustom(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long singup (Member member) {
        return memberRepository.save(member).getId();
    }
}
