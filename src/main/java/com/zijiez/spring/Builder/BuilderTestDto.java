package com.zijiez.spring.Builder;

/**
 * @Auther: zhangzijie
 * @Date: 2019/5/6 14:53
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
public class BuilderTestDto {
    public String userName;
    public int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final class BuilderTestDtoBuilder {
        public String userName;
        public int age;

        private BuilderTestDtoBuilder() {
        }

        public static BuilderTestDtoBuilder aBuilderTestDto() {
            return new BuilderTestDtoBuilder();
        }

        public BuilderTestDtoBuilder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public BuilderTestDtoBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public BuilderTestDto build() {
            BuilderTestDto builderTestDto = new BuilderTestDto();
            builderTestDto.setUserName(userName);
            builderTestDto.setAge(age);
            return builderTestDto;
        }
    }
}
