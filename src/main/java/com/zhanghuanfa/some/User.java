package com.zhanghuanfa.some;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhanghuanfa  2018-06-11 11:15
 */
@Data
class User implements Serializable {

    private static final long serialVersionUID = -7355655572097909149L;
    private transient Integer age;
    private String name;

    public Integer age() {
        return age;
    }

    private User(Builder builder) {
        age = builder.age;
        name = builder.name;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private Integer age;
        private String name;

        private Builder() {
        }

        public Builder age(Integer val) {
            age = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
