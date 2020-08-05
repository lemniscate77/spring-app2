package org.example.jm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);

        MucisPlayer mucisPlayer = new MucisPlayer(music);

        mucisPlayer.playMusic();

        context.close();
    }
}
