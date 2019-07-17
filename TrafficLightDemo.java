enum TrafficLightColour {
        RED, GREEN, YELLOW
}

class TrafficLightSimulator implements Runnable {
    private TrafficLightColour tlc; // holds the traffic light colour
    private boolean stop = false; // set to true to stop the simulation
    public boolean changed = false; // true when light has changed

    TrafficLightSimulator(TrafficLightColour init) {
        tlc = init;
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColour.RED;
    }

    public void run(){
        while(!stop) {
            //System.out.println("run() " + Thread.currentThread().getName());
            
            try {
                switch(tlc){
                    case GREEN:
                        Thread.sleep(1000);
                        break;
                    case YELLOW:
                        Thread.sleep(2000);
                        break;
                    case RED:
                        Thread.sleep(1200);
                        break;
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        changeColour();
        }
    }

    synchronized void changeColour() {
        //System.out.println("changeColour " + Thread.currentThread().getName());
        switch (tlc) {
            case RED:
                tlc = TrafficLightColour.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColour.RED;
                break;
            case GREEN:
                tlc = TrafficLightColour.YELLOW;
                break;
        }
    //changed = true;
    notify(); // signal that the light has changed
    }

    synchronized void waitForChange() {
        //System.out.println("waitForChange " + Thread.currentThread().getName());
        try {
            //while(!changed){
            //System.out.println("main waiting...");
            wait();
            //} // wait for light to change
            //System.out.println("main waking up...");
            //changed = false;
        }catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    synchronized TrafficLightColour getColour() {
        //System.out.println("getColour " + Thread.currentThread().getName());
        
        return tlc;
    }

    synchronized void cancel() {
        //System.out.println("cancel " + Thread.currentThread().getName());
        stop = true;
    }
}

class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator();
        Thread thrd = new Thread(t1);
        thrd.start();

        for(int i = 0; i < 9; i++) {
            
            System.out.println(t1.getColour());
            
            t1.waitForChange();
        }

    t1.cancel();
    }
}
