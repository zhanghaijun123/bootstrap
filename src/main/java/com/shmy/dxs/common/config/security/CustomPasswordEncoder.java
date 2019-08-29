package com.shmy.dxs.common.config.security;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author: zhanghj
 * @Date: 2019/8/27 13:30
 * @Version: 1.0
 */
public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        return encoder.encodePassword(rawPassword.toString(), "dxs");

    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        return encoder.isPasswordValid(encodedPassword, rawPassword.toString(), "dxs");
    }

    public static void main(String[] args) {
        String pass="sysadmin";
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        String dxs = encoder.encodePassword(pass, "dxs");
        System.out.println("dxs = " + dxs);
    }
}
