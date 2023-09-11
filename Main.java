import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        Shop shop = new shop();

        Category category1 = new category("Спорт");
        category1.addProduct(new Product("Тренажер", 550.0, 3));
        category1.addProduct(new Product("Велосипед", 1100.0, 5));

        Category category2 = new category("Музыка");
        category1.addProduct(new Product("Скрипка", 2000.0, 4));
        category1.addProduct(new Product("Саксофон", 3550.0, 3));

        shop.addCategory(category1);
        shop.addCategory(category2);

        shop.printCatalog();

        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        user1.getBasket().addProduct(category1.getProducts()get(0));
        user2.getBasket().addProduct(category2.getProducts()get(1));
        category1.getProducts().remove(0);
        category2.getProducts().remove(1);

        System.out.println(user1.getLogin() + "-Покупки:");
        ArrayList<Product>user1Products = user1.getBasket().getProducts();

        for(Product product: user1Products){
            System.out.println("-" + product.getName() + "-" + product.getPrice() +
            "-" + product.getRating());
        }

        System.out.println(user2.getLogin() + "-Покупки:");
        ArrayList<Product>user2Products = user1.getBasket().getProducts();

        for(Product product: user2Products){
            System.out.println("-" + product.getName() + "-" + product.getPrice() +
            "-" + product.getRating());
        }

    }
    
}
