package com.example.laptopstore;

import java.util.List;

public class Choice {


    News news1 = new News("Lenovo стала победителем в номинации Device Partner премии " +
            "Microsoft Partner of the Year Awards. Компанию отметили за превосходные результаты в области инноваций " +
            "и внедрения клиентских решений на основе технологий Microsoft.",
            "images/news/загруженное3.png",
            "images/news/загруженное3.png");

    News news2 = new News("Сегодня пользователи хотят от своих гаджетов нечто большего, чем простой мобильности. " +
            "Возможность работать и учиться онлайн позволяет проводить меньше времени в офисах и аудиториях. " +
            "Эти изменения вдохновили Lenovo на создание новых персональных устройств, " +
            "предназначенных для современного пользователя — это 16-дюймовый Lenovo IdeaPad 5i Chromebook " +
            "и две новинки в премиальной линейке планшетов Lenovo Tab P11: Lenovo Tab P11 (2-го поколения) и " +
            "Lenovo Tab P11 Pro (2-го поколения).",
            "images/news/загруженное.png",
            "images/news/загруженное.png");

    News news3 = new News("Lenovo анонсировала новый ThinkPad™ X1 Fold, который полностью меняет представление" +
            " об устройствах с гибким экраном, созданных компанией в 2020 году. Новый ThinkPad X1 Fold" +
            "  — самый легкий в мире среди коммерческих 16-дюймовых устройств — обладает мощностью ПК и " +
            "большей площадью экрана1",
            "images/news/загруженное1.png",
            "images/news/загруженное1.png");

    News news4 = new News("Lenovo продолжает создавать инновационные модели привычных устройств," +
            " прислушиваясь к мнению пользователей. Мы определили четыре основные области," +
            " в которых пользовательский опыт должен быть безупречным: производительность, клавиатура," +
            " дисплей и дизайн. ",
            "images/news/загруженное2.png",
            "images/news/загруженное2.png");


    public String[] choiceNews(String arg) {
        String[] new_item = new String[3];
        if ("new1".equals(arg)) {
            new_item[0] = news1.text;
            new_item[1] = news1.url1;
            new_item[2] = news1.url2;
        } else if ("new2".equals(arg)) {
            new_item[0] = news2.text;
            new_item[1] = news2.url1;
            new_item[2] = news2.url2;
        } else if ("new3".equals(arg)) {
            new_item[0] = news3.text;
            new_item[1] = news3.url1;
            new_item[2] = news3.url2;
        } else if ("new4".equals(arg)) {
            new_item[0] = news4.text;
            new_item[1] = news4.url1;
            new_item[2] = news4.url2;
        }
        return new_item;
    }

    Model m13 = new Model("LENOVO 13", "no install", "Intel Core i3 7100U", "500 Gb", "1366x768",
            "images/laptops/13/lenovo_13_20j10014rt.jpg","images/laptops/13/lenovo_13_20j10014rt_1.jpg",
            "images/laptops/13/lenovo_13_20j10014rt_2.jpg");
    Model m110_15 = new Model("LENOVO 110-15", "Windows 10 Home (64 bit)", "AMD A9-Series 9400",
            "500 Gb", "1366x768","images/laptops/110-15/lenovo_11015_80tr000grk.jpg",
            "images/laptops/110-15/lenovo_11015_80tr000grk_1.jpg",
            "images/laptops/110-15/lenovo_11015_80tr000grk_2.jpg");
    Model m120_14 = new Model("LENOVO 120-14", "Windows 10 Home (64 bit)", "Intel Celeron N3350",
            "64 Gb", "1920x1080","images/laptops/120-14/lenovo_120s14_81a500hrru.jpg",
            "images/laptops/120-14/lenovo_120s14_81a500hrru_1.jpg",
            "images/laptops/120-14/lenovo_120s14_81a500hrru.jpg");
    Model m300_15 = new Model("LENOVO 300-15", "Windows 10 Home (64 bit)", "Intel Core i7 6500U",
            "1000 Gb", "1366x768","images/laptops/300-15/lenovo_30015_80q70045rk.jpg",
            "images/laptops/300-15/lenovo_30015_80q70045rk_1.jpg","images/laptops/300-15/lenovo_30015_80q70045rk.jpg");
    Model m320_14 = new Model("LENOVO 320-14", "Windows 10 Home (64 bit)", "Intel Celeron N3350",
            "500 Gb", "1920x1080","images/laptops/320-14/lenovo_32014_80xq0011rk.jpg",
            "images/laptops/320-14/lenovo_32014_80xq0011rk_1.jpg",
            "images/laptops/320-14/lenovo_32014_80xq0011rk_2.jpg");

    public String[] choiceModel(String arg) {
        String[] model_item = new String[8];
        if ("m13".equals(arg)) {
            model_item[0] = m13.model;
            model_item[1] = m13.os;
            model_item[2] = m13.proc;
            model_item[3] = m13.memory;
            model_item[4] = m13.display;
            model_item[5] = m13.url1;
            model_item[6] = m13.url2;
            model_item[7] = m13.url3;
        } else if ("m110-15".equals(arg)) {
            model_item[0] = m110_15.model;
            model_item[1] = m110_15.os;
            model_item[2] = m110_15.proc;
            model_item[3] = m110_15.memory;
            model_item[4] = m110_15.display;
            model_item[5] = m110_15.url1;
            model_item[6] = m110_15.url2;
            model_item[7] = m110_15.url3;
        } else if ("m120-14".equals(arg)) {
            model_item[0] = m120_14.model;
            model_item[1] = m120_14.os;
            model_item[2] = m120_14.proc;
            model_item[3] = m120_14.memory;
            model_item[4] = m120_14.display;
            model_item[5] = m120_14.url1;
            model_item[6] = m120_14.url2;
            model_item[7] = m120_14.url3;
        } else if ("m300-15".equals(arg)) {
            model_item[0] = m300_15.model;
            model_item[1] = m300_15.os;
            model_item[2] = m300_15.proc;
            model_item[3] = m300_15.memory;
            model_item[4] = m300_15.display;
            model_item[5] = m300_15.url1;
            model_item[6] = m300_15.url2;
            model_item[7] = m300_15.url3;
        }else if ("m320-14".equals(arg)) {
            model_item[0] = m320_14.model;
            model_item[1] = m320_14.os;
            model_item[2] = m320_14.proc;
            model_item[3] = m320_14.memory;
            model_item[4] = m320_14.display;
            model_item[5] = m320_14.url1;
            model_item[6] = m320_14.url2;
            model_item[7] = m320_14.url3;
        }
        return model_item;
    }
}
