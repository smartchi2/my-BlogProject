import  controller.PostController;
import controller.PostController;

import java.util.Scanner;
public class Main {
    PostController controller = new PostController();

    public String input() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public void display(String prompt) {
        System.out.println(prompt);
    }

    public String  createPost(){
        return null;
    }

    public void readPost(){
        display("Enter post Id: ");
        String userInput = input();
        if(userInput == controller.getPost()){

        }
    }
    public static void main(String[] args) {

    }
}
