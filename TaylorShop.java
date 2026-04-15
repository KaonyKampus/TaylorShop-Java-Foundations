
import java.util.Scanner;
public class TaylorShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        int productCounter = 0;
        int option = 0;
        final double TAXPRODUCT = 0.15;
        int registeredProducts = 0;
        String productName1 = "", productName2 = "", productName3 = "";
        int productStock1 = 0, productStock2 = 0, productStock3 = 0;
        double productPrice1 = 0, productPrice2 = 0, productPrice3 = 0;
        double productDiscount1 = 0, productDiscount2 = 0, productDiscount3 = 0;
        while (isRunning == true) {
            System.out.println("Welcome to TaylorShop, please select any of the following options:  ");
            System.out.println("1. Register a product");
            System.out.println("2. Consult a registered product");
            System.out.println("3. Delete a registered product");
            System.out.println("4. Finish");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    sc.nextLine();
                    if (productCounter == 0) {
                        System.out.println("Please enter the name of product 1: ");
                        productName1 = sc.nextLine();
                        System.out.println("Please enter the stock amount of product 1: ");
                        productStock1 = sc.nextInt();
                        System.out.println("Please enter the price of product 1: ");
                        productPrice1 = sc.nextDouble();
                        if (productPrice1 >= 100000) {
                            System.out.println("This product has a 15% of discount");
                            productDiscount1 = productPrice1 * TAXPRODUCT;
                        } else {
                            System.out.println("This product does not have any discount as its price is less than $100000");
                            productDiscount1 = 0;
                        }
                    } else if (productCounter == 1) {
                        System.out.println("Please enter the name of product 2: ");
                        productName2 = sc.nextLine();
                        System.out.println("Please enter the stock amount of product 1: ");
                        productStock2 = sc.nextInt();
                        System.out.println("Please enter the price of product 1: ");
                        productPrice2 = sc.nextDouble();
                        if (productPrice2 >= 100000) {
                            System.out.println("This product has a 15% of discount");
                            productDiscount2 = productPrice2 * TAXPRODUCT;
                        } else {
                            System.out.println("This product does not have any discount as its price is less than $100000");
                            productDiscount2 = 0;
                        }
                    } else if (productCounter == 2) {
                        System.out.println("Please enter the name of product 1: ");
                        productName3 = sc.nextLine();
                        System.out.println("Please enter the stock amount of product 1: ");
                        productStock3 = sc.nextInt();
                        System.out.println("Please enter the price of product 1: ");
                        productPrice3 = sc.nextDouble();
                        if (productPrice3 >= 100000) {
                            System.out.println("This product has a 15% of discount");
                            productDiscount3 = productPrice3 * TAXPRODUCT;
                        } else {
                            System.out.println("This product does not have any discount as its price is less than $100000");
                            productDiscount3 = 0;
                        }
                    }
                    productCounter++;
                    break;
                case 2:
                    System.out.println("Please enter the number of the product you want to validate: ");
                    option = sc.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("The name of product " + option + " is:" + productName1);
                            System.out.println("The stock of product " + option + " is:" + productStock1);
                            System.out.println("The price of product " + option + " is:" + productPrice1);
                            System.out.println("The discount of product " + option + " is:" + productDiscount1);
                            break;
                        case 2:
                            System.out.println("The name of product " + option + " is:" + productName2);
                            System.out.println("The stock of product " + option + " is:" + productStock2);
                            System.out.println("The price of product " + option + " is:" + productPrice2);
                            System.out.println("The discount of product " + option + " is:" + productDiscount2);
                            break;
                        case 3:
                            System.out.println("The name of product " + option + " is:" + productName3);
                            System.out.println("The stock of product " + option + " is:" + productStock3);
                            System.out.println("The price of product " + option + " is:" + productPrice3);
                            System.out.println("The discount of product " + option + " is:" + productDiscount3);
                            break;
                        default:
                            System.out.println("Please enter a valid option");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Please select the product you want to delete: ");
                    option = sc.nextInt();
                    switch (option) {
                        case 1:
                            productName1 = "";
                            productStock1 = 0;
                            productPrice1 = 0;
                            System.out.println("Product " + option + " was successfuly deleted!");
                            break;
                        case 2:
                            productName2 = "";
                            productStock2 = 0;
                            productPrice2 = 0;
                            System.out.println("Product " + option + " was successfuly deleted!");
                            break;
                        case 3:
                            productName3 = "";
                            productStock3 = 0;
                            productPrice3 = 0;
                            System.out.println("Product " + option + " was successfuly deleted!");
                            break;
                        default:
                            System.out.println("Please enter a valid option");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("CLOSING PROGRAMM!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("PLEASE ENTER A VALID OPTION!");
                    break;
            }
        }
    }
}
