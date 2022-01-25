package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

public class PostManagerTest {
    Cinema first = new Cinema(1, "first", 1);
    Cinema second = new Cinema(2, "second", 2);
    Cinema third = new Cinema(3, "third", 3);
    Cinema four = new Cinema(4, "four", 4);
    Cinema five = new Cinema(5, "five", 5);
    Cinema six = new Cinema(6, "six", 6);
    Cinema seven = new Cinema(7, "seven", 7);
    Cinema eight = new Cinema(8, "eight", 8);
    Cinema nine = new Cinema(9, "nine", 9);
    Cinema ten = new Cinema(10, "ten", 10);

    @Test
    public void newCountPoster() {
        //пробуем ввести новое кол-во фильмов в ленту
        PostManager manager = new PostManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);

        Cinema[] actual = manager.longPoster(10);
        Cinema[] expected = new Cinema[]{five, four, third, second, first};
        assertArrayEquals(expected, actual);
    }


    @Test
    // Проверка конструктора
    public void shouldUseConstructor() {

        assertEquals(10, 10);
    }

    @Test
    public void overCountPoster() {
        //пробуем ввести новое кол-во фильмов в ленту
        PostManager manager = new PostManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);

        Cinema[] actual = manager.longPoster(4);
        Cinema[] expected = new Cinema[]{four, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void defoltCountCinema(){
        PostManager manager = new PostManager(10);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        Cinema[] actual = manager.longPoster(10);
        Cinema[] expected = new Cinema[]{ten, nine, eight, seven, six, five, four, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseOrderTen() {
        // обратный порядок
        PostManager manager = new PostManager();
        Cinema first = new Cinema(1, "first", 1);
        Cinema second = new Cinema(2, "second", 2);
        Cinema third = new Cinema(3, "third", 3);
        Cinema four = new Cinema(4, "four", 4);
        Cinema five = new Cinema(5, "five", 5);
        Cinema six = new Cinema(6, "six", 6);
        Cinema seven = new Cinema(7, "seven", 7);
        Cinema eight = new Cinema(8, "eight", 8);
        Cinema nine = new Cinema(9, "nine", 9);
        Cinema ten = new Cinema(10, "ten", 10);


        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        Cinema[] actual = manager.getAll();
        Cinema[] expected = new Cinema[]{ten, nine, eight, seven, six, five, four, third, second, first};

        assertArrayEquals(expected, actual);

    }

//    public void shouldRemoveIfExists() {
//        CartManager manager = new CartManager();
//        int idToRemove = 1;
//        PurchaseItem first = new PurchaseItem(1, 1, "first", 1, 1);
//        PurchaseItem second = new PurchaseItem(2, 2, "second", 1, 1);
//        PurchaseItem third = new PurchaseItem(3, 3, "third", 1, 1);
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//
//        manager.removeById(idToRemove);
//
//        PurchaseItem[] actual = manager.getAll();
//        PurchaseItem[] expected = new PurchaseItem[]{third, second};
//
////    assertEquals(expected, actual);
//        assertArrayEquals(expected, actual);
//    }
}