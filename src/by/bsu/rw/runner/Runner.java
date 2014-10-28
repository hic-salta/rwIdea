package by.bsu.rw.runner;

import by.bsu.rw.creator.Creator;
import by.bsu.rw.train.Train;
import by.bsu.rw.logicactions.SearchByPassngCount;
import by.bsu.rw.report.LogInfo;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Runner {
    static {
        PropertyConfigurator.configure("D:\\Java8Course\\rw\\resources");
    }
    final static Logger LOG = Logger.getLogger(Runner.class);

    public static void main(String[] args) {
    	Train train = Creator.createTrain("Minsk-Hrodno");
        

    }
}
