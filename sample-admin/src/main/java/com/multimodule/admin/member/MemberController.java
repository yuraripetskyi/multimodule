package com.multimodule.admin.member;

import com.multimodule.common.member.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/")
    public Member get() {
        return new Member("yurii", "yurii@gmail.com");
    }
}
