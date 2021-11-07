package com.company;

public class Main {
    public static void main(String[] args) {

        SolarSystem andromeda = new SolarSystem();
        andromeda.sun =1;
        andromeda.moon=2;
        andromeda.planet=4;

        featureSun acesun = new featureSun();
        acesun.color="blue";
        acesun.heat ="60000452145kj";
        acesun.temp="55641154989kelvin";
        acesun.radius="90000000km";
        acesun.maritalStatus="in love with asghar";

        //planet2 features

        planet2 bastronaut = new planet2();
        bastronaut.color ="blue";
        bastronaut.size="49844654987km";
        bastronaut.status ="single";
        
        Moon1 money = new Moon1();
        money.color ="red";
        money.size ="negative";
        money.dob="6";
        money.ring="3";

        Moon2 moon2 = new Moon2();
        moon2.color ="grey";
        moon2.size ="894549845 km";

    }
}
