import model.AddressBooks;

import java.util.Scanner;

public class MainClass {
    public MainClass() {
    }

    public static void main(String[] args) {
        Address management = new Address();
        Scanner input = new Scanner(System.in);
        try {
            while (true){
                System.out.println("=============== Address Book =============");
                System.out.println(" 1. Add new contact\n" +
                        " 2. Find a contact by name\n" +
                        " 3. Display contacts\n" +
                        " 4. Exit");
                System.out.print("Inviting you to choose: ");
                int choose = input.nextInt();
                int id;
                switch (choose){
                    case 1:
                        AddressBooks add = new AddressBooks();
                        add.inputData();
                        Address.addNewBooks(add);
                        break;
                    case 2:
                        System.out.print("Enter id: ");
                        id = input.nextInt();
                        AddressBooks add1 = management.getBooksById(id);
                        if(add1 != null){
                            System.out.println(add1.toString());
                        }else{
                            System.out.println("Not found");
                        }
                        break;
                    case 3:
                        management.viewAllBooks();
                        break;
                    case 4:
                        return;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
