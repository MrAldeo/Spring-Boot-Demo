package com.zijiez.spring.Builder;

import org.springframework.stereotype.Service;

/**
 * @Auther: zhangzijie
 * @Date: 2019/5/6 15:06
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@Service
public class BuilderTestService {
    public void builderTest(){
        BuilderTestDto.BuilderTestDtoBuilder builder = BuilderTestDto.BuilderTestDtoBuilder.aBuilderTestDto();
        BuilderTestDto builderTestDto = builder.withAge(11).withUserName("张三").build();

        System.out.println(builderTestDto.getAge()+builderTestDto.getUserName());
    }
}
