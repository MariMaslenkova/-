package com.company;

public class Bank {

    private Record[] db; // массив класса рекорд массив карточек и пинов

    public Bank() { // переопределение дэфолтного конструктора банк
        this.db = new Record[]{
                // 0x позволяет записать в 16рич виде
                new Record("676767", "8082"),
                new Record("123456", "4018"),
                new Record("654321", "23223")
        };
    }


    // card number
    //pin
    // pin counter

    private class Record { // класс внутри класса банк с базой данных
        private String cardNumber;
        private String pinCode;
        private int pinCounter;

        public Record(String cardNumber, String pinCode) {
            this.cardNumber = cardNumber;
            this.pinCode = pinCode;
        } // переопределение дэф конструктора рекорд


        public boolean isBlocked() { // проверка блокировки карты
            return this.pinCounter == 3;
        }
    }


    public void checkPin(String cardNumber, String pin) throws CardIsBlockedException, IncorrectPinFormatException, IncorrectPinException {
        // Incorrect pin - все чекед эксепшены
        // Incorrect pin format
        // Card is blocked


        //проверяем формат пинкода
        if (pin.length() != 4){ // считает количество сомволов в строке
            throw new IncorrectPinFormatException();
        }
        for (char c:pin.toCharArray()){
            if (c< '0' || c>'9'){
                throw new IncorrectPinFormatException();
            }
        }

        Record card = null; // пустая ссылка на карточка/ ноль для ссылок никуда не указывает
        for (Record r : this.db) {
            if (r.cardNumber.equals(cardNumber)) {
                card = r; // ссылку записываем реальную карточку
                break;
            }
        }
        card.pinCounter++;

        if (card.isBlocked()) {// если карта заблокирована генерируем CardIsBlockedException
            throw new CardIsBlockedException();
        }




        // проверяем совпадение пинкодов
        if (!pin.equals(card.pinCode)){
            throw new IncorrectPinException();
        }
        card.pinCounter = 0;
    }
}