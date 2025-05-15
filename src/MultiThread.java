import javax.management.RuntimeErrorException;

public class MultiThread extends Thread {
    public int threadNumber;

    public MultiThread(int num){
        this.threadNumber = num;
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Thread Number: " + threadNumber + ": " + (i+1));
            if(threadNumber == 2){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
