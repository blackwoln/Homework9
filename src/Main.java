public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Анджей", "Сапковский");
        Author author2 = new Author("Стивен", "Кинг");

        // Создаем две книги
        Book book1 = new Book("Ведьмак: Кровь эльфов", author1, 1993);
        Book book2 = new Book("Оно", author2, 1986);

        // Изменяем год публикации одной из книг
        book2.setPublicationYear(1996);

        // Выводим информацию о книгах
        System.out.println(book1.getTitle() + " (" + book1.getPublicationYear() + ") - " +
                book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println(book2.getTitle() + " (" + book2.getPublicationYear() + ") - " +
                book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName());

    }
}