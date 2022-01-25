package ru.netology.domain;

public class PostManager {
    private Cinema[] countCinema = new Cinema[0];
    private int newCountCinema;

    public PostManager() {
    }

    public PostManager(int newCountCinema) {
        this.newCountCinema = 10;
    }


//    1. Добавить фильм в ленту (класс фильма напишите сами по аналогии с лекции).
//    2. Выдать последние 10 добавленных фильмов* (фильмы выдаются в обратном порядке, т.е. первым в массиве результатов будет тот, который был добавлен последним).

    public void add(Cinema count) {
        // создаём новый массив размером на единицу больше
        int length = countCinema.length + 1;
        Cinema[] plusOneCinema = new Cinema[length];
        System.arraycopy(countCinema, 0, plusOneCinema, 0, countCinema.length);
        int lastCinema = plusOneCinema.length - 1;
        plusOneCinema[lastCinema] = count;
        this.countCinema = plusOneCinema;
    }


    public Cinema[] longPoster(int newCountCinema) {
        // пытаемся сделать чтобы можно было внести любое кол-во в массиве

        if (countCinema.length >= newCountCinema) {
            Cinema[] resultLength = new Cinema[newCountCinema];
            for (int i = 0; i < resultLength.length; i++) {
                int index = resultLength.length - i - 1;
                resultLength[i] = this.countCinema[index];
            }
            return resultLength;
        } else {
            Cinema[] resultLength = new Cinema[countCinema.length];
            for (int i = 0; i < resultLength.length; i++) {
                int index = resultLength.length - i - 1;
                resultLength[i] = this.countCinema[index];
            }
            return resultLength;
        }
    }


    public Cinema[] getAll() {
        Cinema[] result = new Cinema[countCinema.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = countCinema.length - i - 1;
            result[i] = countCinema[index];
        }
        return result;
    }


    //    public class CartManager {
//        private PurchaseItem[] items = new PurchaseItem[0];
//    public void add(PurchaseItem item) {
//        // создаём новый массив размером на единицу больше
//        int length = items.length + 1;
//        PurchaseItem[] tmp = new PurchaseItem[length];
//        // itar + tab
//        // копируем поэлементно
//        // for (int i = 0; i < items.length; i++) {
//        //   tmp[i] = items[i];
//        // }
//        System.arraycopy(items, 0, tmp, 0, items.length);
//        // кладём последним наш элемент
//        int lastIndex = tmp.length - 1;
//        tmp[lastIndex] = item;
//        items = tmp;
//    }
//
//public PurchaseItem[] getAll() {
//    PurchaseItem[] result = new PurchaseItem[items.length];
//    // перебираем массив в прямом порядке
//    // но кладём в результаты в обратном
//    for (int i = 0; i < result.length; i++) {
//        int index = items.length - i - 1;
//        result[i] = items[index];
//    }
//    return result;
//}
}
