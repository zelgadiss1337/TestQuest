package com.company;

import java.util.Scanner;

 class Main {

    public static Character player;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ваши друзья снова позвали вас катать на фейсите\n "
                + "Для начала им надо добавить вас в пати по вашему нику(Введите ваш ник):");
        player = new Character(in.next());
        story = new Story();
        while (true) {
            player.friendstilt += story.current_situation.dFD;
            player.tilt += story.current_situation.dTILT;
            System.out.println("=====\nТильт друзей:" + player.friendstilt + "\tВаш Тильт:" + player.tilt + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                if (player.tilt >= 100 && player.friendstilt >= 100) System.out.println("Вы богоподобны. Выйграли игру на фейсите, так еще и с друзьями все хорошо");
                if (player.tilt < 100 && player.friendstilt < 100) System.out.println("Все очень плохо. Вы проиграли игру, так еще и с друзьями сильно поссорились");
                System.out.println("Вы выключаете компьютер, и идете спать");
                return;
            }
            story.go(in.nextInt());
        }

    }

}