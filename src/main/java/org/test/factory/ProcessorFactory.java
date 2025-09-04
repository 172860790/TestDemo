package org.test.factory;

import org.test.processor.AdvanceProcessor;
import org.test.processor.BasicProcessor;
import org.test.processor.ProcessService;

public class ProcessorFactory {

    private ProcessorFactory(){}

    public static ProcessService getBasicProcessor(){
        return new BasicProcessor();
    }


    public static ProcessService getAdvanceProcessor(){
        return new AdvanceProcessor();
    }
}
