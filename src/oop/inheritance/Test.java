package oop.inheritance;

public class Test   {

    public static void main(String[] args) {
        Father myFather=new Father();
        myFather.height();
        myFather.educate();

        GrandFather myGrandFather=new Father();
        myGrandFather.jump();
        ((Father) myGrandFather).educate();

        Son foud = new Son();

        // GrandFather
        GrandFather g = new GrandFather();
        g.jump();
        g.playGame();



        // Father
        Father f = new Father();
        f.swim();
        f.educate();

        foud.bodyBuilder();


        Daughter maoya=new Daughter();
        maoya.educate(); // Father class
        maoya.sing();
        maoya.jump(); // GrandFather class



        GrandFather kazi = new Daughter();

        GrandFather denys = new Son();

        Father zaman = new Son();








    }






}

