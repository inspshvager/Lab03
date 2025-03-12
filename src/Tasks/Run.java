package Tasks;

import java.util.Scanner;

public class Run {
    public void runTasks(){
        Task newTask = new Task();
        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz numer zadania do rozwiązania, od 1 do 7.");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                newTask.task01();
                break;
            case 2:
                newTask.task02();
                break;
            case 3:
                newTask.task03();
                break;
            case 4:
                newTask.task04();
                break;
            case 5:
                newTask.task05();
                break;
            case 6:
                newTask.task06();
                break;
            case 7:
                newTask.task07();
                break;
            default:
                break;
        }
    }
}
