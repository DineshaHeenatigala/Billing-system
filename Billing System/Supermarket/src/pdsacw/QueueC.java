package pdsacw;
import javax.swing.*;
import java.lang.ref.Cleaner;

public class QueueC{

    private int endVAL,frontVAL,noItems,ArraySize;
    private Integer[] arr;

    public QueueC(int s){
        ArraySize = s;
        arr = new Integer[ArraySize];
        frontVAL = 0;
        endVAL = -1;
        noItems=0;
    }

    public int peekFront(){
        if(isEmpty() == false)
        {
            return arr[frontVAL];
        }else{
        return -999;}
    }

    public boolean isEmpty(){
        return(noItems == 0);
    }

    public boolean isFull(){
        return(endVAL == ArraySize-1);
    }

    public int sizeQ(){
        return noItems;
    }

    public void enqueue(int j){
        if(isFull() == false)
        {endVAL ++;
            arr[endVAL] = j;
            noItems++;
            JOptionPane.showMessageDialog(null,"Token Entered Successfully !");
        }else{
        JOptionPane.showMessageDialog(null, "Customer count is full !");}
    }//insert items at rear of queue

    public int dequeue(){
        if(isEmpty() == false)
        {noItems--;
            return arr[frontVAL++];
        }else{
             return -999;}
    } // remove items from the front of queue


    public static void main(String[] args) {
        //

    }

}
