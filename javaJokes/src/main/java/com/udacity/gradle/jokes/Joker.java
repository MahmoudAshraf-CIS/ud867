package com.udacity.gradle.jokes;

import java.util.Random;

public class Joker {
    public String getJoke() {
        String [] jks = {

                "What is the difference between a snowman and a snowwoman?\n-Snowballs.",
                "Anton, do you think I’m a bad mother?\n -My name is Paul.",
                "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
                "Oh darling, since you’ve started dieting, you’ve become such a passionate kisser…\n What do you mean, passionate? I’m looking for food remains!\n"
        };

        return jks[ new Random().nextInt(jks.length)];
    }
}
