package _4_OOP.baitap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date start() {
        return startTime = new Date();
    }

    public Date stop() {
        return endTime = new Date();
    }

    public long getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        double[] array = new double[100123123];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 1234213.123;
        }

        stopWatch.stop();
        System.out.println("star"+stopWatch.start());
        System.out.println("stop" +stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime() + "ms");
    }
}
