package com.wu.demo.sendemail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendemailApplicationTests {

    @Autowired
    private JavaMailSender javaMailSender;

    @Test
    public void contextLoads() throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        // 发送方邮箱
        helper.setFrom("532791689@qq.com");
        // 接收方邮箱
        helper.setTo("577972476@qq.com");
        // 主题
        helper.setSubject("主题：测试邮件");
        // 内容
        helper.setText("一封来自你对象的邮件，么么哒");
        javaMailSender.send(mimeMessage);

    }

}
