/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadpoolexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author USER
 */

public class ThreadPoolExample {
    
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        
        for(int i = 1;i <= 5;i++){
            executorService.submit(new Task(i));
        }
        
        executorService.shutdown();
    }
    
}
