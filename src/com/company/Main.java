package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(" # | Дейсвия");
        System.out.println("---|-----------------------------------");
        int a=action1();
        System.out.println(" * | Конец");
        System.out.println("Оценка: "+a);
        System.out.print("В целом день: ");
        if (a>2){
            System.out.print("Удачный");
        }else if(a>=0&&a<=2){
            System.out.print("Нормайьный");
        }else if (a<0){
            System.out.print("Неудачный");
        }
    }
    static  int action1() {
        System.out.println(" * | Начало дня");
        Random random= new Random();
        int action1=random.nextInt(1,3);
        if(action1==1){
            return action2();
        }
        else {
            return action3();
        }
    }
    static int action2() {
        System.out.println(" * | Поднимаюсь с кравати с левой ногой");
        Random random=new Random();
        int action2=random.nextInt(1,10);
        if (action2<=7) {
            return (-1+action4());
        }
        else {
            return (-1+action5());
        }
    }
    static int action3() {
        System.out.println(" * | Поднимаюсь с кравати с правой ногой");
        Random random=new Random();
        int action3= random.nextInt(1,6);
        if(action3<=4){
            return (1+action5());
        }
        else {
            return (1+action6());
        }
    }
    static int action4() {
        System.out.println(" * | Подаю с кравати");
        Random random=new Random();
        int action4= random.nextInt(1,12);
        if(action4<=8){
            return (-1+action7());
        }
        else {
            return (-1+action8());
        }
    }
    static int action5() {
        System.out.println(" * | Побежка по аллее");
        Random random=new Random();
        int action5= random.nextInt(1,12);
        if(action5<=8){
            return (1+action7());
        }
        else {
            return (1+action8());
        }
    }
    static int action6() {
        System.out.println(" * | Физ зарядка на балконе");
        Random random=new Random();
        int action6=random.nextInt(1,4);
        if(action6==1){
            return action8();
        }
        else {
            return action9();
        }
    }
    static int action7() {
        System.out.println(" * | Варю крепкий кофе");
        Random random=new Random();
        int action7= random.nextInt(1,5);
        if(action7<=2){
            return action10();
        }
        else {
            return action13();
        }
    }
    static int action8() {
        System.out.println(" * | Готовлю плотный завтрак");
        Random random=new Random();
        int action8= random.nextInt(1,5);
        if(action8<=2){
            return (1+action10());
        }
        else {
            return (1+action13());
        }
    }
    static int action9() {
        System.out.println(" * | Достаю вчерашный салат");
        Random random=new Random();
        int action9= random.nextInt(1,5);
        if(action9<=2){
            return (-1+action10());
        }
        else {
            return (-1+action13());
        }
    }
    static int action10() {
        System.out.println(" * | Спустило колесо");
        Random random=new Random();
        int action10= random.nextInt(1,8);
        if(action10<=2){
            return (-1+action11());
        }
        else {
            return (-1+action12());
        }
    }
    static int action11() {
        System.out.println(" * | Добираюсь на работу пешком");
        Random random=new Random();
        int action11= random.nextInt(1,8);
        if(action11<=2){
            return (-1+action14());
        }
        else {
            return (-1+action15());
        }
    }
    static int action12() {
        System.out.println(" * | Добираюсь на работу на маршрутке");
        Random random=new Random();
        int action12= random.nextInt(1,2);
        if(action12==1){
            return action14();
        }
        else {
            return action15();
        }
    }
    static int action13() {
        System.out.println(" * | Добираюсь на работу на своем авто");
        Random random=new Random();
        int action13= random.nextInt(1,8);
        if(action13<=5){
            return (1+action14());
        }
        else {
            return (1+action15());
        }
    }
    static int action14() {
        System.out.println(" * | Прихожу во время");
        return 1;
    }
    static int action15() {
        System.out.println(" * | Опаздываю на работу");
        return -1;
    }
}
