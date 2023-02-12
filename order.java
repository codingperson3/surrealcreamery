import java.util.Scanner;
import java.util.ArrayList;

public class order {

    
//adds a new account to a list of accounts for surreal creamery
public static Account MakeAccount(String email, String password, String phoneNum){
    Account newPerson = new Account(email, password, phoneNum);
    //accounts.add(newPerson);
   
    System.out.println("New Account Made!");
    return newPerson;

}

//finds an account in an existing list of accounts
public static boolean FindAccount(String enter, ArrayList<Account> accounts){
    for(int i=0; i<accounts.size(); i++){
        Account find = accounts.get(i);
        if(find.getEmail() == enter){
            return true;

        }
    }
    return false;
}    

//prints the entire menu 
public static  void PrintMenu(){
    System.out.println("1. Chocolate Blackout");
    System.out.println("2. Earl Grey Everyday");
    System.out.println("3. Its my Birthday");
    System.out.println("4. Know Your Roots");
    System.out.println("5. Brown Sugar Bubble Tea and Earl Grey Ice Cream Flotea");
    System.out.println("6. Thai Bilk Bubble Tea and Icea Coffee Ice Cream Flotea");
    System.out.println("7. Taro Bubble Tea and Matcha Swirled Ice Cream FloTea ");
    System.out.println("8. Make your Own Flotea");

}

//updates items on a menu 
public static  void arrayOfItems( Item[] menuList){
    Item item1 = new Item("Chocolate Blackout ", 11.25);
    menuList[0] = item1;
    Item item2 = new Item("Earl Grey Everyday ", 11.25);
    menuList[1] = item2;
    Item item3 = new Item("Its my Birthday ", 11.25);
    menuList[2] = item3;
    Item item4 = new Item("Know Your Roots ", 11.25);
    menuList[3] = item4;
    Item item5 = new Item("Brown Sugar Bubble Tea and Earl Grey Ice Cream Flotea ", 10.25);
    menuList[4] = item5;
    Item item6 = new Item("Thai Bilk Bubble Tea and Icea Coffee Ice Cream Flotea ", 10.25);
    menuList[5] = item6;
    Item item7 = new Item("Taro Bubble Tea and Matcha Swirled Ice Cream FloTea ", 10.25);
    menuList[6] = item7;
    Item item8 = new Item("Make your own Flotea ", 10.25);
    menuList[7] = item8;
}

public static void main(String[] args) {
    ArrayList<Account> accounts = new ArrayList<Account>(); // list of accounts
    Item[] menuList = new Item[8];
    arrayOfItems(menuList);
    Scanner input = new Scanner(System.in);
    String enterEmail; 
    String enterPassword;
    String enterPhone; 
    boolean signin = false;
    boolean find = false;
    
    //beginning screen of options
    System.out.println("Welcome to surreal creamery! Sign in or Sign up.");
    String choice = input.nextLine();
    if(choice == "Sign in"){
        while(signin == false){
        System.out.println("Put in email: "); // takes in email
        String enter = input.nextLine();
        find = FindAccount(enter, accounts);
        if(find == false){
            System.out.println("Account not found"); // if  email is not found in account list says that there is no account
        }else{
            System.out.println("Enter password"); //if there is an account, the password will be inputted
            input.nextLine();
            signin = true;

        }

        }
    }else if(choice == "Sign up"){ // this occurs if user does not have account
        System.out.println("Enter email: "); // making the account
        enterEmail = input.nextLine();
        System.out.println("Enter password:");
        enterPassword = input.nextLine();
        System.out.println("Enter phone number: ");
        enterPhone = input.nextLine();

        accounts.add(MakeAccount(enterEmail, enterPassword, enterPhone)); // adds the account to a list of existing accounts

    }



    ArrayList<Item> Cart = new ArrayList<Item>(); // items the user will buy
    boolean done = false;
    double total = 0.0;



    while( done != true){ // user doees shopping
    PrintMenu();

    System.out.println("What number item would you like to order?");

    int pick = input.nextInt();

    Cart.add(menuList[pick]);
    Item itemprice = menuList[pick-1];
    total= total + itemprice.getPrice(); //adding price of item added to total
    System.out.println(" Item added to cart. Type 1 to keep shopping Type 2 to checkout");
    int shop = input.nextInt();
    if(shop ==2){
        done = true; 
    }

    }

    System.out.println("The total is: " + total);
    System.out.println("Thank you for shopping at Surreal!");




    }    



    
    }

